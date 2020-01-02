package com.yyh.handler;

import com.yyh.dao.DeptDaoImpl;
import com.yyh.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-01-02-9:43
 */
@RestController
@RequestMapping("/dept")
public class DeptHandler {
    @Autowired
    private DeptDaoImpl dd;

    @RequestMapping("/")
    public List<Dept> selectAll(){
        return dd.selectAll();
    }






}
