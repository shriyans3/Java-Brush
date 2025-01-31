package com.example.demo.Repository;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;


@Repository
public class StudRepo {
    private JdbcTemplate jdbc;


    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql="insert into student (age,std,sex) values(?,?,?)";

        int rows=jdbc.update(sql,s.getAge(),s.getStd(),s.getSex());
        System.out.println(rows +"affected");
    }

    public List<Student> fetch() {
        String sql="select * from student"; RowMapper<Student> mapper=(rs, rowNum) ->
        {
            Student s=new Student();
            s.setAge(rs.getInt("age"));
            s.setStd(rs.getInt("std"));
            s.setSex(rs.getString("sex"));
            return s;

        };

        return jdbc.query(sql, mapper);

    }



    //without lambda expression

    /*
     * public List<Student> findAll() {
     *
     * String sql="select * from student"; RowMapper<Student> mapper=new
     * RowMapper<Student>() {
     *
     * @Override public Student mapRow(ResultSet rs, int rowNum) throws SQLException
     * { Student s=new Student(); s.setRollNo(rs.getInt("rollno"));
     * s.setName(rs.getString("name")); s.setMarks(rs.getInt("marks")); return s; }
     * }; return jdbc.query(sql, mapper); }
     */
    }



