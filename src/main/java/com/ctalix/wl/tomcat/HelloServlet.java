package com.ctalix.wl.tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * test Servlet
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since 0.0.1
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write("hello world ! ");
    }
}

