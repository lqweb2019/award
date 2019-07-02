package com.zyl.award.sys.controller;

import com.zyl.award.commons.BaseController;
import com.zyl.award.enums.ResultCode;
import com.zyl.award.exception.BusinessException;
import com.zyl.award.result.PlatformResult;
import com.zyl.award.sys.entity.dto.LoginDto;
import com.zyl.award.sys.entity.po.SysUser;
import com.zyl.award.sys.entity.vo.SysUserVo;
import com.zyl.award.sys.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author sunhaijun
 * @description: 系统用户接口层
 * @create: 2019-06-29 12:18
 **/
@Api(value = "后台用户相关接口",tags = "后台用户相关接口")
@RestController
@RequestMapping("/api/back/sysuser")
public class SysUserController extends BaseController {

    @Autowired
    SysUserService sysUserService;

    @ApiOperation(value = "系统用户登陆")
    @PostMapping("/login")
    public PlatformResult<SysUserVo> login(@RequestBody LoginDto loginDto){
        if(ObjectUtils.isEmpty(loginDto.getUserName())){
            throw new BusinessException(ResultCode.PARAM_NOT_COMPLETE);
        }
        SysUserVo loginVo = sysUserService.login(loginDto);
        return PlatformResult.success(loginVo);
    }

    @ApiOperation("系统用户注册")
    @PostMapping("/register")
    public PlatformResult<SysUserVo> register(@Validated @RequestBody SysUser sysUser){
        if(ObjectUtils.isEmpty(sysUser.getMobile()) && ObjectUtils.isEmpty(sysUser.getUserName())){
            throw new BusinessException(ResultCode.PARAM_NOT_COMPLETE);
        }

        SysUserVo sysUserVo = sysUserService.register(sysUser);
        return PlatformResult.success(sysUserVo);

    }

    @ApiOperation("根据用户id查询用户信息")
    @GetMapping
    public PlatformResult<SysUserVo> userInfo(){
        return PlatformResult.success(getUserInfo());
    }


}
