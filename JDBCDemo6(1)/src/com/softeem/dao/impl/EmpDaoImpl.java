package com.softeem.dao.impl;

import com.softeem.bean.Emp;
import com.softeem.dao.EmpDao;
import com.softeem.uitl.BaseDao;
import com.softeem.uitl.MyDataSource;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import javax.print.attribute.standard.JobKOctets;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmpDaoImpl extends BaseDao implements EmpDao {

    @Override
    public Emp login(Emp emp) throws SQLException {
        //做个样子.不能运行
        Connection connection = MyDataSource.getDataSource().getConnection();
        connection.setAutoCommit(false);//设置手动提交.其实就是开户事务

        String sql = "";
        List<Emp> empList = queryRunner.query(connection, sql, new BeanListHandler<>(Emp.class));

        connection.setAutoCommit(true);//归还连接时还原成自动提交
        DbUtils.commitAndClose(connection);
        return null;
    }

    @Override
    public List<Emp> findEmpDept() throws SQLException {
        String sql = "select e.*,d.name as dname,d.id as did from emp e , dept d where e.dept_id = d.id";
        MapListHandler handler = new MapListHandler();
        List<Map<String, Object>> list = queryRunner.query(sql, handler);
        ArrayList<Emp> empList = new ArrayList<>();
        for (Map<String, Object> objectMap : list) {
            Emp emp = new Emp();
            emp.setId((Integer) objectMap.get("id"));
            emp.setName((String) objectMap.get("name"));
            emp.setSalary((Double) objectMap.get("salary"));
            emp.setJoinDate((Date) objectMap.get("join_date"));
            emp.setDeptId((Integer) objectMap.get("dept_id"));
            emp.setGender((String) objectMap.get("gender"));
            emp.getDept().setName((String) objectMap.get("dname"));
            emp.getDept().setId((Integer) objectMap.get("did"));
            empList.add(emp);
        }
        return empList ;
    }

    /*@Override
    public List<Emp> findEmpDept() throws SQLException {
        String sql = "select e.*,d.name as dname,d.id as did from emp e , dept d where e.dept_id = d.id";
        ResultSetHandler<List<Emp>> handler = new ResultSetHandler<>() {
            @Override
            public List<Emp> handle(ResultSet rs) throws SQLException {
                ArrayList<Emp> empList = new ArrayList<>();
                while(rs.next()){
                    Emp emp = new Emp();
                    emp.setId(rs.getInt("id"));
                    emp.setName(rs.getString("name"));
                    emp.setGender(rs.getString("gender"));
                    emp.setJoinDate(rs.getDate("join_date"));
                    emp.setDeptId(rs.getInt("dept_id"));
                    emp.setSalary(rs.getDouble("salary"));
                    //以上完成的是emp表的数据封装
                    //以下完成dept表的数据封装
                    emp.getDept().setId(rs.getInt("did"));
                    emp.getDept().setName(rs.getString("dname"));
                    empList.add(emp);
                }
                return empList;
            }
        };
        List<Emp> empList = queryRunner.query(sql, handler);
        return empList;
    }*/

    @Override
    public List<Emp> findAll() {
        return null;
    }

    @Override
    public void save(Emp emp) {

    }

    @Override
    public void updateById(Emp emp) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Emp findById(Integer id) {
        return null;
    }

    @Override
    public List<Emp> page(Integer pageNumber) {
        return null;
    }

    @Override
    public Integer pageRecord() {
        return null;
    }
}
