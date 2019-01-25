package com.oracledemo.controller;



import com.oracledemo.entity.Emp;
import com.oracledemo.service.OracleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName OracleTestController
 * @Description
 * @Author chendapeng
 * @Date 2019/1/24
 **/

@Controller
@RequestMapping("/oracle")
public class OracleTestController {

    @Autowired
    private OracleService oracleService;

    //查询列表
    @RequestMapping("/list")
    @ResponseBody
    public List<Emp> list(){

        return oracleService.findList();
    }
}
