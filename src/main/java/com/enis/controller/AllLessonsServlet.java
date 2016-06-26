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
import java.util.List;

/**
 * Created by enis on 26.06.2016.
 */
@WebServlet(urlPatterns = {"/allLessons"})
public class AllLessonsServlet extends HttpServlet {

    @Inject
    private CrudService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Lesson> lessons = service.findLessonsAll();
        req.setAttribute("lessons",lessons);
        getServletContext().getRequestDispatcher("/WEB-INF/student/listLessons.jsp").forward(req, resp);

    }
}
