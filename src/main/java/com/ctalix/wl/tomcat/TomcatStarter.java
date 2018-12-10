package com.ctalix.wl.tomcat;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 *
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */
class TomcatStarter implements ServletContainerInitializer {


    @Override
    public void onStartup(Set<Class<?>> c, ServletContext servletContext) throws ServletException {
        System.out.printf("start up event");
    }
}
