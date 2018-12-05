package com.ctalix.wl.servlet.context;

import com.ctalix.wl.springboot.web.server.WebServer;
import org.springframework.context.ApplicationContext;

/**
 * Todo
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */
public interface WebServerApplicaitonContext extends ApplicationContext {


    WebServer getWebServer();

    String getServerNamespace();

}
