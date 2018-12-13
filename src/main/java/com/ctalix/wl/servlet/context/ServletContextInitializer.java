package com.ctalix.wl.servlet.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Todo
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */

@FunctionalInterface
public interface ServletContextInitializer {


    /**
     * Configure the given {@link ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initialization.
     * @param servletContext the {@code ServletContext} to initialize
     * @throws ServletException if any call against the given {@code ServletContext}
     * throws a {@code ServletException}
     */
    void onStartup(ServletContext servletContext) throws ServletException;

}
