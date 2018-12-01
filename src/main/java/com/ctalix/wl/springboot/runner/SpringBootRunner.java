package com.ctalix.wl.springrunner;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * 模拟 springboot 的 启动类
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */
public class SpringBootRunner {

    public ConfigurableApplicationContext run(String... arg) {
        ConfigurableApplicationContext context = null;
        context = createContext();
        
        return context;
    }

    /**
     * 根据是否存在tomcat 的容器类创建spring context 的类型
     * 如果不存在，则创建 AnnotationConfigApplicationContext
     * 如果存在， 则创建 AnnotationConfigServletWebServerApplicationContext
     * @return
     */
    private ConfigurableApplicationContext createContext() {
        
    }
}
