package com.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/checkUser")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: "+username);
        System.out.println("password: "+password);

        String path = request.getContextPath();
        System.out.println("path: "+path);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write("响应成功！！！");
        //重定向
        response.sendRedirect("templates/b_buying.html");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: "+username);
        System.out.println("password: "+password);

        //转发请求
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("templates/b_buying.html");
        requestDispatcher.forward(request,response);
        /*
        * 转发与重定向的区别：
        * 1. 转发发送一次请求，重定向发送两次请求
        * 2. 转发浏览器地址栏无变化，重定向浏览器地址栏有变化
        * 3. 转发可以访问WEB-INF目录下的资源，重定向不行   其实这个主要是转发在服务器内部完成
        * 4. 转发可以共享request域中的数据
        */
    }
}
