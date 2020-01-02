package com.yyh.dao;

import com.yyh.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-01-02-9:34
 */
@Repository
public class DeptDaoImpl {

    @Autowired
    private JdbcTemplate jt;


    private RowMapper<Dept> rowMapper = new RowMapper<Dept>() {
        @Override
        public Dept mapRow(ResultSet rs, int i) throws SQLException {
            Dept dept = new Dept();
            dept.setDept_id(rs.getInt("dept_id"));
            dept.setDept_name(rs.getString("dept_name"));
            return dept;
        }
    };

    public List<Dept> selectAll(){
        return jt.query("select * from dept",rowMapper);
    }





}
