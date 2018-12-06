package com.ctalix.wl.tomcat;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * 创建 tomcat 容器的工厂类
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since 0.0.1
 */
public class TomcatServletwebServer {

    /**
     * 设置 nio protocol
     */
    public static final String DEFAULT_PROTOCOL = "org.apache.coyote.http11.Http11NioProtocol";

    /**
     * 获取 web Server 此处直接返回一个 tomcat 的实例
     * @param baseDir tomcat 的基础工作目录
     * @return Tomcat
     */
    public Tomcat getWebServer(String baseDir) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(80);
        tomcat.setBaseDir(baseDir);
        Connector connector = new Connector(DEFAULT_PROTOCOL);
        connector.setPort(8009);
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context, "helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello","helloServlet");

        tomcat.getService().addConnector(connector);
        tomcat.getHost().setAutoDeploy(false);
        return tomcat;
    }

    public static void main(String[] args) throws LifecycleException, InterruptedException {
        TomcatServletwebServer tomcatServletwebServer = new TomcatServletwebServer();
        Tomcat tomcat = tomcatServletwebServer.getWebServer("D://tmp");
        tomcat.start();
        tomcat.getServer().await();
    }

}


