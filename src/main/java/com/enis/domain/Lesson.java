package com.enis.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by enis on 26.06.2016.
 */
@Table(name = "T_LESSON")
@Entity
public class Lesson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String lessonName;
    private Integer lessonNumber;
    private Integer lessonKredit;

    public Lesson() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Integer getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(Integer lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public Integer getLessonKredit() {
        return lessonKredit;
    }

    public void setLessonKredit(Integer lessonKredit) {
        this.lessonKredit = lessonKredit;
    }
}
