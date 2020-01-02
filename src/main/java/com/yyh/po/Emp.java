package com.yyh.po;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author YanYuHang
 * @create 2020-01-02-10:48
 */
@Data
public class Emp {

    private int emp_id;
    private String emp_name;
    private BigDecimal emp_money;
    private Dept dept;


}
