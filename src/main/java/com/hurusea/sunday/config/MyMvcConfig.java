package com.hurusea.sunday.config;

import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.hurusea.sunday.component.LoginHandlerInterceptor;
import com.hurusea.sunday.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @hurusea
 * @create2020-03-23 15:20
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // super.addViewControllers(registry);
        //浏览器发送 /atguigu 请求来到 success
        registry.addViewController("/atguigu").setViewName("success");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//                super.addInterceptors(registry);
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index","/","/user/login","/asserts/css/**","/webjars/**");
    }


    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}

