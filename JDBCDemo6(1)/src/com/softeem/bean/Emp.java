package com.softeem.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
//Emp 是多
public class Emp {
    private Integer id ;
    private String name ;
    private String gender ;
    private Double salary ;
    private Date joinDate;
    private Integer deptId;
    //如果进行多表查询的话.一般是通过多这一方发起连接查询比较简单
    private Dept dept = new Dept();
}
