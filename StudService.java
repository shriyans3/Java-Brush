package com.example.demo.service;

import com.example.demo.Repository.StudRepo;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudService {

    StudRepo s1;

    public StudRepo getS() {
        return s1;
    }
    @Autowired
    public void setS(StudRepo s) {
        this.s1 = s;
    }

    public void add(Student s) {
        s1.save(s);
    }

    public List<Student> fetch(){
        return s1.fetch();
    }
}
