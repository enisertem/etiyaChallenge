package com.enis.controller;

import com.enis.domain.Lesson;
import com.enis.domain.Student;
import com.enis.service.CrudService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by enis on 26.06.2016.
 */
@WebServlet(urlPatterns = {"/studentsLessonsSubmit"})
public class StudentsLessonsSubmitServlet extends HttpServlet {

    @Inject
    private CrudService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long studentId = Long.valueOf(req.getParameter("student"));

        req.setAttribute("allLessons", service.findLessonsAll());
        req.setAttribute("studentLessons", service.findLessonsByStudentId(studentId));


        req.setAttribute("students", service.findAll());

        getServletContext().getRequestDispatcher("/WEB-INF/student/addLessonStudentRelation.jsp?sid=" + studentId).forward(req, resp);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String selectedValues=  req.getParameter("secilen");

     Long studentId= Long.valueOf(req.getParameter("sid"));

        Student student=service.findStudent(studentId);

        List<Lesson> slist=new ArrayList<>();
        for (String s : selectedValues.split("-")) {
          if(!s.equals("-")) {
           slist.add(service.findLesson(Long.valueOf(s)));
          }
        }
        student.setLessons(slist);
        service.addStudent(student);



        getServletContext().getRequestDispatcher("/WEB-INF/student/RelationResult.jsp").forward(req, resp);
    }
}
