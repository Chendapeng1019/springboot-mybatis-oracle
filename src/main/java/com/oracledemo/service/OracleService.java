package com.oracledemo.service;

import com.oracledemo.entity.Emp;

import java.util.List;

/*
 *@ClassName OracleService
 *@Description
 *@Author chendapeng
 *@Date 2019/1/24
 */
public interface OracleService {
    List<Emp> findList();
}
