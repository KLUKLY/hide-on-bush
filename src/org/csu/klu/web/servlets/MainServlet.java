package org.csu.klu.web.servlets;

import java.io.IOException;

public class MainServlet extends javax.servlet.http.HttpServlet {
    private static final String MAIN = "/WEB-INF/jsp/catalog/Main.jsp";//设置常量路径指向固定页面
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher(MAIN).forward(request,response);
    }
}
