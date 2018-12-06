package com.ctalix.wl.springboot.runner;

import com.ctalix.wl.servlet.context.AnnotationConfigServletWebServerApplicaitonContext;
import com.ctalix.wl.springboot.web.context.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模拟 springboot 的 启动类
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */
public class SpringBootRunner {

    /**
     * 标识应用的类型
     */
    private WebApplicationType webApplicationType;

    /**
     * 在 spring boot 中 通过多个重载的 run() 进行一些初始化的工作，这里就直接在一个方法中进行创建
     * @param arg 运行参数
     * @return ConfigurableApplicationContext
     */
    public ConfigurableApplicationContext run(String... arg) {
        ConfigurableApplicationContext context = null;
        context = createContext();
        return context;
    }

    /**
     * 根据是否存在tomcat 的容器类创建spring context 的类型
     * 如果不存在，则创建 AnnotationConfigApplicationContext
     * 如果存在， 则创建 AnnotationConfigServletWebServerApplicationContext
     * 此处简略返回 AnnotationConfigServletWebApplicationContext
     * @return ConfigurableApplicationContext
     */
    private ConfigurableApplicationContext createContext() {
        this.webApplicationType = WebApplicationType.deduceFromClasspath();
        switch (this.webApplicationType) {
            case SERVLET:
                return new AnnotationConfigServletWebServerApplicaitonContext();
            default:
                return new AnnotationConfigApplicationContext();
        }
    }
}
