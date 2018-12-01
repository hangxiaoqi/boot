package com.ctalix.wl.tomcat;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * 创建 tomcat 容器的工厂类
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since 0.0.1
 */
public class TomcatServletwebServer {

       public static final String DEFAULT_PROTOCOL = "org.apache.coyote.http11.Http11NioProtocol";

        public Tomcat getWebServer(String baseDir) {
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir(baseDir);
        Connector connector = new Connector(DEFAULT_PROTOCOL);
        tomcat.getService().addConnector(connector);
        tomcat.setConnector(connector);
        tomcat.getHost().setAutoDeploy(false);
        return tomcat;
    }
}

