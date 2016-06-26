package com.enis.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by enis on 26.06.2016.
 */
@Table(name = "T_STUDENT")
@Entity
public class Student implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surName;
    private Integer schoollNo;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = false,fetch = FetchType.EAGER)
    private List<Lesson> Lessons;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getSchoollNo() {
        return schoollNo;
    }

    public void setSchoollNo(Integer schoollNo) {
        this.schoollNo = schoollNo;
    }

    public List<Lesson> getLessons() {
        return Lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        Lessons = lessons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
