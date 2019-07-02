package com.zyl.award.sys.controller;

import java.util.List;

import com.zyl.award.commons.model.qo.PageQO;
import com.zyl.award.commons.model.vo.PageVO;
import com.zyl.award.enums.ResultCode;
import com.zyl.award.exception.BusinessException;
import com.zyl.award.result.PlatformResult;
import com.zyl.award.sys.entity.po.SysDict;
import com.zyl.award.sys.entity.po.SysDictCatalog;
import com.zyl.award.sys.service.SysDictCatalogService;
import com.zyl.award.sys.service.SysDictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import tk.mybatis.mapper.entity.Example;

@Api(value = "字典",tags = "字典接口相关")
@Slf4j
@RestController
@RequestMapping("/api/back")
public class SysDictController {

	@Autowired
	SysDictService sysDictService;

	@Autowired
	SysDictCatalogService sysDictCatalogService;

	@ApiOperation(value = "全部字典目录")
	@GetMapping(value = "/catalog")
	public PlatformResult<PageVO<SysDictCatalog>> getCatalogs(
			@ApiParam(value = "页码") @RequestParam(defaultValue = "1") Integer page,
			@ApiParam(value = "数据行数") @RequestParam(defaultValue = "10") Integer rows) {
		PageQO pageQO = PageQO.builder().pageNum(page).pageSize(rows).orderBy("sort asc").build();
		PageVO<SysDictCatalog> list = sysDictCatalogService.selectPage(pageQO);
		return  PlatformResult.success(list);
	}

	@ApiOperation(value = "查询字典目录")
	@GetMapping(value = "/catalog/search")
	public PlatformResult<PageVO<SysDictCatalog>> searchCatalogs(
			@ApiParam(value = "页码") @RequestParam(defaultValue = "1") Integer page,
			@ApiParam(value = "数据行数") @RequestParam(defaultValue = "10") Integer rows,
			@ApiParam(value = "字典目录id") @RequestParam(required = false) Integer id,
			@ApiParam(value = "字典目录名称（模糊查询）") @RequestParam(required = false) String name) {
		PageQO pageQO = PageQO.builder().pageNum(page).pageSize(rows).build();
		Example example = new Example(SysDictCatalog.class);
		Example.Criteria criteria = example.createCriteria();
		if(!ObjectUtils.isEmpty(id)){
			criteria.andEqualTo("id",id);
		}
		if(!ObjectUtils.isEmpty(name)){
			criteria.andLike("name",name);
		}
		PageVO<SysDictCatalog> sysDictCatalogPageVO = sysDictCatalogService.selectPage(pageQO, example);
		return PlatformResult.success(sysDictCatalogPageVO);
	}

	@ApiOperation(value = "字典目录详情")
	@GetMapping(value = "/catalog/detail")
	public PlatformResult<SysDictCatalog> getCatalog(@ApiParam(value = "字典目录id") @RequestParam Integer id) {
		return PlatformResult.success(sysDictCatalogService.selectByPk(id));
	}

	@ApiOperation(value = "创建字典目录")
	@PostMapping(value = "/catalog")
	public PlatformResult addCatalog(@ApiParam(value = "字典目录") @Validated @RequestBody SysDictCatalog catalog) {
		return PlatformResult.success(sysDictCatalogService.insert(catalog));
	}

	@ApiOperation(value = "更新字典目录")
	@PutMapping(value = "/catalog")
	public PlatformResult updateCatalog(@ApiParam(value = "字典目录") @RequestBody SysDictCatalog catalog) {
		return PlatformResult.success(catalog);
	}

	@ApiOperation(value = "删除字典目录（级联删除字典项）")
	@DeleteMapping(value = "/catalog")
	public PlatformResult deleteCatalog(@ApiParam(value = "字典目录ID") @RequestParam Integer id) {
		int success = sysDictCatalogService.deleteByPk(id);
		if(success>0) {
			return PlatformResult.success();
		}
		return PlatformResult.failure("删除字典失败");
	}

	@ApiOperation(value = "通过字典目录查询字典配置")
	@GetMapping(value = "/dict")
	public PlatformResult<PageVO<SysDict>> getDictList(@ApiParam(value = "页码") @RequestParam(defaultValue = "1") Integer page,
			@ApiParam(value = "数据行数") @RequestParam(defaultValue = "10") Integer rows,
			@ApiParam(value = "字典目录code", required = true) @RequestParam String catalogCode) {
		if(ObjectUtils.isEmpty(catalogCode)) {
			throw new BusinessException(ResultCode.PARAM_IS_INVALID);
		}
		Example example = new Example(SysDict.class);
		example.createCriteria().andEqualTo("catalogCode",catalogCode);
		PageQO pageQO = PageQO.builder().pageSize(rows).pageNum(page).orderBy("sort asc").build();
		PageVO<SysDict> sysDictPageVO = sysDictService.selectPage(pageQO, example);

		return PlatformResult.success(sysDictPageVO);
	}
	
	@ApiOperation(value = "查询字典详情")
	@GetMapping(value = "/dict/detail")
	public PlatformResult<SysDict> getDict(@ApiParam(value = "字典id", required = true) @RequestParam Integer id) {
		return PlatformResult.success(sysDictService.selectByPk(id));
	}

	@ApiOperation(value = "创建字典项")
	@PostMapping(value = "/dict")
	public PlatformResult addDict(@ApiParam(value = "字典项") @RequestBody SysDict dict) {
		int success = sysDictService.insert(dict);
		if(success>0){
			return PlatformResult.success();
		}else{
			return PlatformResult.failure("创建字典失败");
		}
	}

	@ApiOperation(value = "更新字典项")
	@PutMapping(value = "/dict")
	public PlatformResult updateDict(@ApiParam(value = "字典项") @RequestBody SysDict dict) {
		int update = sysDictService.updateByPk(dict.getId(),dict);
		if(update>0){
			return PlatformResult.success();
		}else{
			return PlatformResult.failure("更新字典失败");
		}

	}

	@ApiOperation(value = "删除字典项")
	@DeleteMapping(value = "/dict")
	public PlatformResult deleteDict(@ApiParam(value = "字典项ID") @RequestParam Integer id) {
		sysDictService.deleteByPk(id);
		return PlatformResult.success();
	}
	

}
