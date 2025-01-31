package com.example.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    int age;
    int std;
    String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", std=" + std +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
