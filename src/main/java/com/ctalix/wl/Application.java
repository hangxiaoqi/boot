package com.ctalix.wl;


import com.ctalix.wl.config.AppConfig;
import com.ctalix.wl.config.MvcConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(AppConfig.class);
        annotationConfigApplicationContext.register(MvcConfig.class);
        annotationConfigApplicationContext.refresh();
    }

}
