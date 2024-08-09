package com.example.dii;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentCollection {

    private String name ;

    public StudentCollection(String name, List<Integer> phone, Set<String> courses, Map<String, Integer> marks) {
        this.name = name;
        this.phone = phone;
        this.courses = courses;
        this.marks = marks;
    }

    public StudentCollection() {
    }

    @Override
    public String toString() {
        return "StudentCollection{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", courses=" + courses +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPhone() {
        return phone;
    }

    public void setPhone(List<Integer> phone) {
        this.phone = phone;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    private List<Integer> phone;
    private Set<String> courses;
    private Map<String,Integer> marks;


}
