package com.oracledemo.dao;



import com.oracledemo.entity.Emp;

import java.util.List;

/**
 * @ClassName OracleDao
 * @Description
 * @Author chendapeng
 * @Date 2019/1/24
 **/


public interface OracleDao {

   /* @Select("select EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO from EMP")
    @Results({
            @Result(property = "empno",column = "EMPNO"),
            @Result(property = "ename",column = "ENAME"),
            @Result(property = "job",column = "JOB"),
            @Result(property = "mgr",column = "MGR"),
            @Result(property = "higedate",column = "HIREDATE"),
            @Result(property = "sal",column = "SAL"),
            @Result(property = "comm",column = "COMM"),
            @Result(property = "deptno",column = "DEPTNO")
    })*/
    List<Emp> findList();
}
