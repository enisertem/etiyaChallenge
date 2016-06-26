package com.enis.service;

import com.enis.domain.Lesson;
import com.enis.domain.Student;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by enis on 26.06.2016.
 */
@Stateless
@LocalBean
public class CrudService {
    @PersistenceContext(unitName =  "odevDS")
    private EntityManager entityManager;

    public void  addStudent(Student student) {
         entityManager.merge(student);
    }

    public Student findStudent(Long id){
        Query query = entityManager.createQuery("select s from Student s where s.id=:id");
        query.setParameter("id",id);
        Student resultList = (Student) query.getResultList().get(0);
        return resultList;
    }

    public Lesson findLesson(Long id){
        Query query = entityManager.createQuery("select s from Lesson s where s.id=:id");
        query.setParameter("id",id);
        Lesson resultList = (Lesson) query.getResultList().get(0);
        return resultList;
    }




    public List<Student> findAll(){
        Query query = entityManager.createQuery("select s from Student s");
        List<Student> resultList = query.getResultList();
        return resultList;
    }

    public List<Lesson> findLessonsAll(){
        Query query = entityManager.createQuery("select s from Lesson s");
        List<Lesson> resultList = query.getResultList();
        return resultList;
    }

    public List<Lesson> findLessonsByStudentId(Long id){
        Query query = entityManager.createQuery("select s from Student s where s.id=:id");
        query.setParameter("id",id);
        Student student= (Student) query.getResultList().get(0);
        List<Lesson> lessons = student.getLessons();
        return lessons;
    }


    public void  addLesson(Lesson lesson) {
        entityManager.merge(lesson);
    }



}
