package com.telusko.SpingJDBCEx.Repository;

import com.telusko.SpingJDBCEx.Model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Students s){
        System.out.println(s.getName()+" Saved");
        String sql="insert into students(name,rollno,marks) values(?,?,?)";
        int rows= jdbc.update(sql,s.getName(),s.getROllNo(),s.getMarks());
        System.out.println(rows);
    }


    public List<Students> findAll() {
        //List<Students> so=new ArrayList<>();
        String sql="select * from students";
        RowMapper<Students> mapper= new RowMapper<Students>() {
            @Override
            public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
                Students s=new Students();
                s.setName(rs.getString("name"));
                s.setROllNo(rs.getInt("rollno"));
                s.setMarks(rs.getFloat("marks"));
                return s;
            }
        };
        return jdbc.query(sql,mapper);


    }
}
