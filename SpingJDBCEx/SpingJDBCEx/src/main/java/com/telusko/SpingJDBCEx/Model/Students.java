package com.telusko.SpingJDBCEx.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Students {
    private String Name;
    private int ROllNo;
    private float Marks;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getROllNo() {
        return ROllNo;
    }

    public void setROllNo(int ROllNo) {
        this.ROllNo = ROllNo;
    }

    public float getMarks() {
        return Marks;
    }

    public void setMarks(float marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", ROllNo=" + ROllNo +
                ", Marks=" + Marks +
                '}';
    }

}
