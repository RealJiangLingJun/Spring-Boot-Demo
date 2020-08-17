package com.jiangjiawei.controller;

import com.jiangjiawei.domain.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @ API 用来声明一系列接口功能
 * @APIOperation 用来声明具体接口功能
 * @ApiIgnore   忽略此接口，不显示
 * @ApiImplicitParam(name = "name",value = "姓名")  用来描述方法中的隐式的参数信息
 */
@RestController
@RequestMapping("/guest")//表示类中的每个方法请求都是这个开头
@Api( tags = "嘉宾相关接口",description = "对嘉宾信息进行增删改查操作")
public class GuestController {

    //显示所有的嘉宾列表
//    @RequestMapping(method = RequestMethod.GET) == @GetMapping
    @GetMapping
    @ApiOperation("查询所有嘉宾信息")
    public String list(Model model){
        return "list";
    }

    //显示添加嘉宾页面
//    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    @GetMapping("/toAdd")
    @ApiIgnore//忽略此接口，不显示
    public String toAdd(){
        return "add";
    }

    //添加嘉宾，并回到嘉宾列表
    @PostMapping
    @ApiOperation("添加嘉宾信息")
    public String add(Guest guest){
        return "add guest";
    }

    //去更新嘉宾信息

    /**
     * @PathVariable("name") 表示从路径中获取name的值
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    @ApiIgnore//忽略此接口，不显示
    public String toUpdate(@PathVariable("name") String name, Model model){
        return "update";
    }

    //修改嘉宾信息，并回到嘉宾列表
    @PutMapping
    @ApiOperation("更新嘉宾信息")
    @ApiImplicitParam(name = "guest",value = "嘉宾")
    public String update(Guest guest){
        return "update guest";
    }

    @DeleteMapping("/{name}")
    @ApiOperation("删除嘉宾")
    @ApiImplicitParam(name = "name",value = "姓名")
    public String delete(@PathVariable("name") String name){
        return "delete guest";
    }
}
