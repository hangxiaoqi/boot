package com.ctalix.wl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * author: 弓成龙 <br>
 * email : gcx909109@sina.cn <br>
 * create: 2018-11-30 9:58 <br>
 * description： web mvc 的配置类 <br>
 **/
@Configuration
@ComponentScan(useDefaultFilters = false,basePackages = {"com.ctalix.wl"},includeFilters = {
        @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = {Controller.class}
        )
})
public class MvcConfig {



}
