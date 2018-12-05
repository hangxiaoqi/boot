package com.ctalix.wl.springboot.web.context;

import org.springframework.util.ClassUtils;

/**
 * 处理 webContext 的类型
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since 0.0.1
 */
public enum WebApplicationType {
    /**
     * The application should not run as a web application and should not start an
     * embedded webserver.
     */
    NONE,

    /**
     * The application should run as a servlet-based web application and should start an
     * embedded servlet web server.
     */
    SERVLET,

    /**
            * The application should run as a reactive web application and should start an
            * embedded reactive web server.
     */
    REACTIVE;

    private static final String WEBMVC_INDICATOR_CLASS = "org.springframework."
            + "web.servlet.DispatcherServlet";

    private static final String WEBFLUX_INDICATOR_CLASS = "org."
            + "springframework.web.reactive.DispatcherHandler";

    private static final String JERSEY_INDICATOR_CLASS = "org.glassfish.jersey.servlet.ServletContainer";

    private static final String SERVLET_APPLICATION_CONTEXT_CLASS = "org.springframework.web.context.WebApplicationContext";

    private static final String REACTIVE_APPLICATION_CONTEXT_CLASS = "org.springframework.boot.web.reactive.context.ReactiveWebApplicationContext";

    private static final String[] SERVLET_INDICATOR_CLASSES = { "javax.servlet.Servlet",
            "org.springframework.web.context.ConfigurableWebApplicationContext" };

    /**
     * 创建 context 的 类型，根据是否存在web mvc 的框架
     * @return WebApplicationType
     */
    public static WebApplicationType deduceFromClasspath() {
        if (ClassUtils.isPresent(WEBFLUX_INDICATOR_CLASS, null)
                && !ClassUtils.isPresent(WEBMVC_INDICATOR_CLASS, null)
                && !ClassUtils.isPresent(JERSEY_INDICATOR_CLASS, null)) {
            return WebApplicationType.REACTIVE;
        }
        for (String className : SERVLET_INDICATOR_CLASSES) {
            if (!ClassUtils.isPresent(className, null)) {
                return WebApplicationType.NONE;
            }
        }
        return WebApplicationType.SERVLET;
    }

}
