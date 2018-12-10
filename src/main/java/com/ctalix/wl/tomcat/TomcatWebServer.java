package com.ctalix.wl.tomcat;

import com.ctalix.wl.springboot.web.server.WebServer;
import com.ctalix.wl.springboot.web.server.exception.WebServerException;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Todo
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */
public class TomcatWebServer implements WebServer {

    public Tomcat tomcat;

    public TomcatWebServer(Tomcat tomcat) {
        this.tomcat = tomcat;
    }

    @Override
    public void start() throws WebServerException, LifecycleException, InterruptedException {

        // 启动tomcat 容器，同时触发 listener
        tomcat.start();


    }

    @Override
    public void stop() throws WebServerException {

    }

    @Override
    public int getPort() throws WebServerException {
        return 80;
    }
}
