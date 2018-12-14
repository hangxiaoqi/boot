package com.ctalix.wl.servlet.context;

import com.ctalix.wl.springboot.web.context.WebApplicationContextServletContextAwareProcessor;
import com.ctalix.wl.springboot.web.server.WebServer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.web.context.support.GenericWebApplicationContext;

import javax.servlet.ServletConfig;

/**
 * Todo
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */
public class ServletWebServerApplicationContext extends GenericWebApplicationContext implements ConfigurableWebSeverApplicationContext {

    private static final Log logger = LogFactory
            .getLog(ServletWebServerApplicationContext.class);

    public static final String DISPACHER_SERVLET_NAME = "dispatherServlet";

    private volatile WebServer webServer;

    private ServletConfig servletConfig;

    private String serverNamespace;

    public ServletWebServerApplicationContext() {

    }

    public ServletWebServerApplicationContext(DefaultListableBeanFactory beanFactory) {
        super(beanFactory);
    }

    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        beanFactory.addBeanPostProcessor(new WebApplicationContextServletContextAwareProcessor(this));
    }

    @Override
    public WebServer getWebServer() {
        return null;
    }

    @Override
    public String getServerNamespace() {
        return null;
    }


    @Override
    public void close() {
        super.close();
        stopAndReleaseWebServer();
    }

    private void stopAndReleaseWebServer() {
        WebServer webServer = this.webServer;
        if (webServer != null) {
            try {
                webServer.stop();
                this.webServer = null;
            }
            catch (Exception ex) {
                throw new IllegalStateException(ex);
            }
        }
    }
}
