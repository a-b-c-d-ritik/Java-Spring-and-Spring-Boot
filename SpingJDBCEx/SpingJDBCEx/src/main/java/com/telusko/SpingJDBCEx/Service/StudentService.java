package com.telusko.SpingJDBCEx.Service;

import com.telusko.SpingJDBCEx.Model.Students;
import com.telusko.SpingJDBCEx.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private static StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Students s)
    {
        repo.save(s);
        System.out.println(s.getName()+" Added");
    }

    public static List<Students> getStudents(){
        return repo.findAll();
    }


}
