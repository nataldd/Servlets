package ru.ivmiit.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("<h1>Hello!</h1>");
        writer.write("<h2>Java the Best!!</h2>");
        writer.write("<h3>Java the Best of the best!</h3>");
        writer.write("<h4>Java the Best of the best, a C# net!</h4>");
    }
}
