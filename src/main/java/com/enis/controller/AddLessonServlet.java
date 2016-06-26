package com.enis.controller;

import com.enis.domain.Lesson;
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
@WebServlet(urlPatterns = {"/addLessonServlet"})
public class AddLessonServlet extends HttpServlet {

    @Inject
    private CrudService studentService;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Lesson lesson=new Lesson();
        lesson.setLessonName(req.getParameter("lessonName"));
        lesson.setLessonNumber(Integer.valueOf(req.getParameter("lessonNumber")));
        lesson.setLessonKredit(Integer.valueOf(req.getParameter("lessonKredit")));
        studentService.addLesson(lesson);
        getServletContext().getRequestDispatcher("/WEB-INF/student/resultPage.jsp").forward(req, resp);

    }
}
