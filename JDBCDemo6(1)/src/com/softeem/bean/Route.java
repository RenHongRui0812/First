package com.softeem.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Route {
    private Integer rid ;
    private String rname;
    private Double price;
    private Date rdate  ;
    private Integer cid ;
}
