package com.oracledemo.service.impl;



import com.oracledemo.dao.OracleDao;
import com.oracledemo.entity.Emp;
import com.oracledemo.service.OracleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OracleServiceImpl
 * @Description
 * @Author chendapeng
 * @Date 2019/1/24
 **/
@Service
public class OracleServiceImpl implements OracleService {

    @Autowired
    private OracleDao oracleDao;

    @Override
    public List<Emp> findList() {
        List<Emp> empList = new ArrayList<Emp>();
        empList = oracleDao.findList();
        System.out.println(empList);
        return empList;
    }
}
