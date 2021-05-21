package com.example.bootdata.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * user: ken
 * data: 2021/5/14 15:44
 */
@Configuration
public class MyMVCConfigure implements WebMvcConfigurer{


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/pet").setViewName("pet");
    }
}
