package com.oracledemo.entity;

import java.util.Date;

/**
 * @ClassName Emp
 * @Description
 * @Author chendapeng
 * @Date 2019/1/24
 **/
public class Emp  {
    private Integer empno;   //员工号
    private String  ename;   //员工名
    private String  job;     //工种
    private Integer mgr;     //上级
    private Date higedate;//入职日期
    private double  sal;     //工资
    private double  comm;    //奖金
    private Integer deptno;  //部门号

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHigedate() {
        return higedate;
    }

    public void setHigedate(Date higedate) {
        this.higedate = higedate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", higedate=" + higedate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
