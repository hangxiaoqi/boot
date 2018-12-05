package com.ctalix.wl.springboot.web.context;

import org.springframework.util.Assert;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.support.ServletContextAwareProcessor;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

/**
 * Todo
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since 0.0.1
 */
public class WebApplicationContextServletContextAwareProcessor extends ServletContextAwareProcessor {

    private final ConfigurableWebApplicationContext webApplicationContext;

    public WebApplicationContextServletContextAwareProcessor(
            ConfigurableWebApplicationContext webApplicationContext) {
        Assert.notNull(webApplicationContext, "WebApplicationContext must not be null");
        this.webApplicationContext = webApplicationContext;
    }

    @Override
    protected ServletContext getServletContext() {
        ServletContext servletContext = this.webApplicationContext.getServletContext();
        return (servletContext != null) ? servletContext : super.getServletContext();
    }

    @Override
    protected ServletConfig getServletConfig() {
        ServletConfig servletConfig = this.webApplicationContext.getServletConfig();
        return (servletConfig != null) ? servletConfig : super.getServletConfig();
    }
}
