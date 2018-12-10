package com.ctalix.wl.springboot.web.server;

import com.ctalix.wl.springboot.web.server.exception.WebServerException;
import org.apache.catalina.LifecycleException;

/**
 * Todo
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */
public interface WebServer {


    void start() throws WebServerException, LifecycleException, InterruptedException;

    void stop() throws WebServerException;

    int getPort() throws WebServerException;
}
