package com.it.cloud.controller;

import com.it.cloud.domain.entity.teacher.Info;
import com.it.cloud.service.InfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class InfoController {
    @Resource
    InfoService infoService;

    /**
     * 根据ID查询用户
     * @param
     * @return
     */
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public  List<Info> selectInfo(){
        List<Info> infos = infoService.selectAll();
        return infos;
    }

}
