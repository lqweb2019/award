package com.zyl.award.sys.controller;

import com.zyl.award.commons.BaseController;
import com.zyl.award.commons.model.po.Node;
import com.zyl.award.result.PlatformResult;
import com.zyl.award.sys.entity.po.SysMenu;
import com.zyl.award.sys.entity.vo.SysRoleMenuVo;
import com.zyl.award.sys.entity.vo.SysUserVo;
import com.zyl.award.sys.service.SysMenuService;
import com.zyl.award.sys.service.SysRoleMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-30 14:08
 **/
@Api(value = "用户菜单",tags = "用户菜单")
@RestController
@Slf4j
@RequestMapping("/api/back/sysmenu")
public class SysMenuController extends BaseController {

    @Autowired
    SysMenuService sysMenuService;

    @Autowired
    SysRoleMenuService sysRoleMenuService;

    @ApiOperation("获取节点Id下的所有节点")
    @GetMapping("tree/{treeId}")
    public PlatformResult<Node<SysMenu>> getTreeNode(@PathVariable("treeId") Integer treeId) {
        Node<SysMenu> node = sysMenuService.selectNodeByParentId(treeId);
        return PlatformResult.success(node);
    }

    @ApiOperation("获取用户的权限菜单")
    @GetMapping
    public PlatformResult<List<SysRoleMenuVo>> getMenu(){
        SysUserVo sysUserVo = getUserInfo();
        List<SysRoleMenuVo> menuList = sysRoleMenuService.getMenuListByRoleId(sysUserVo.getRoleId());
        return PlatformResult.success(menuList);
    }


}
