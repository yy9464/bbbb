package com.atguigu.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FristServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);
        String[] split = requestURI.split("/");
        for (String uri : split) {
            response.getWriter().write(uri);
        }
    }
}
