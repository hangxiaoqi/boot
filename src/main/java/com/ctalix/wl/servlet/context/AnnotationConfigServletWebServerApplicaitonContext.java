package com.ctalix.wl.servlet.context;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Todo
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>
 * @since
 */
public class AnnotationConfigServletWebServerApplicaitonContext extends ServletWebServerApplicationContext implements AnnotationConfigRegistry {


    private final AnnotatedBeanDefinitionReader reader;

    private final ClassPathBeanDefinitionScanner scanner;

    private final Set<Class<?>> annotatedClasses = new LinkedHashSet<Class<?>>();

    private String[] basePackages;


    public void register(Class<?>... classes) {

    }

    public void scan(String... strings) {

    }


    public AnnotationConfigServletWebServerApplicaitonContext() {
        this.reader = new AnnotatedBeanDefinitionReader(this);
        this.scanner = new ClassPathBeanDefinitionScanner(this);

    }

    public AnnotationConfigServletWebServerApplicaitonContext(DefaultListableBeanFactory beanFactory, AnnotatedBeanDefinitionReader reader, ClassPathBeanDefinitionScanner scanner) {
        this.reader = reader;
        this.scanner = scanner;
    }
}
