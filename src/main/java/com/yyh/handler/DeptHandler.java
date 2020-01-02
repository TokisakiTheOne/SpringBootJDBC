package com.yyh.handler;

import com.yyh.dao.DeptDaoImpl;
import com.yyh.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-01-02-9:43
 */
@Controller
@RequestMapping("/dept")
public class DeptHandler {
    @Autowired
    private DeptDaoImpl dd;

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<Dept> selectAll(){
        return dd.selectAll();
    }

    @RequestMapping("/")
    public String selectAllDept(Model model){
        model.addAttribute("deptList",dd.selectAll());
        return "dept";
    }




}
