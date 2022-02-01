package com.example.lab_6;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "image", value = "/image")
public class image extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String category = request.getParameter("select");

        // Генерация случайного числа для вывода случайной картинки из каталога
        int num = new Random().nextInt(10) + 1;

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel=\"stylesheet\" href=\"/css/img.css\" type=\"text/css\" />");
        out.println("</head>");
        out.println("<body>");

        out.println(String.format("<img src=\"images/" + category + "/%d.jpg\"/>", num));

        out.println("</body></html>");
    }

    public void destroy () {
    }
}