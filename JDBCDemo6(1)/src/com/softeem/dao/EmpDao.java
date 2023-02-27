package com.softeem.dao;

import com.softeem.bean.Emp;
import com.softeem.uitl.BaseInterface;

import java.sql.SQLException;
import java.util.List;

public interface EmpDao extends BaseInterface<Emp> {
    public Emp login(Emp emp) throws SQLException;

    public List<Emp> findEmpDept() throws SQLException;
}
