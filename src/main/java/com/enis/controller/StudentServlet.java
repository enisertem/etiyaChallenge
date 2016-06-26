package com.enis.controller;

import com.enis.domain.Student;
import com.enis.service.CrudService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by enis on 26.06.2016.
 */
@WebServlet(name = "studentSave",urlPatterns = {"/studentSave"})
public class StudentServlet extends HttpServlet {

    @Inject
    private CrudService studentService;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Student student = new Student();
        student.setName(req.getParameter("name").toString());
        student.setSurName(req.getParameter("surname").toString());
        student.setSchoollNo(Integer.valueOf(req.getParameter("schoolNo").toString()));
        studentService.addStudent(student);
        getServletContext().getRequestDispatcher("/WEB-INF/student/resultPage.jsp").forward(req, resp);

    }
}
