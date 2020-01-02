package com.yyh.handler;

import com.yyh.dao.DeptDaoImpl;
import com.yyh.dao.EmpDaoImpl;
import com.yyh.po.Dept;
import com.yyh.po.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-01-02-10:55
 */
@RestController
@RequestMapping("/emp")
public class EmpHandler {
    @Autowired
    private EmpDaoImpl ed;

    @RequestMapping("/")
    public List<Emp> selectAll() {
        return ed.selectAll();
    }

}