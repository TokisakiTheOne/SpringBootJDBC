package com.yyh.dao;

import com.yyh.po.Dept;
import com.yyh.po.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-01-02-10:50
 */
@Repository
public class EmpDaoImpl {


    @Autowired
    private JdbcTemplate jt;

    private RowMapper<Emp> rowMapper = new RowMapper<Emp>() {
        @Override
        public Emp mapRow(ResultSet rs, int i) throws SQLException {
            Emp emp = new Emp();
            emp.setEmp_id(rs.getInt("emp_id"));
            emp.setEmp_name(rs.getString("emp_name"));
            emp.setEmp_money(rs.getBigDecimal("emp_money"));
            Dept dept = new Dept();
            dept.setDept_id(rs.getInt("dept_id"));
            dept.setDept_name(rs.getString("dept_name"));
            emp.setDept(dept);
            return emp;
        }
    };
public List<Emp> selectAll(){
    return jt.query("select emp_id,emp_name,emp_money,dept.dept_id,dept_name from emp,dept where emp.dept_id=dept.dept_id",rowMapper);
}

}
