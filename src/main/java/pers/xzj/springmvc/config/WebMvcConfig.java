package pers.xzj.springmvc.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import pers.xzj.springmvc.controller.Controller3;

@Configuration
public class WebMvcConfig {


    /**
     * ServletRegistrationBean  FilterRegistrationBean ServletListenerRegistrationBean 分别将servlet filter listener注册到spring容器中
     * @return
     */
    @Bean
    public ServletRegistrationBean register(){
        return new ServletRegistrationBean<>(new Controller3(),"/test3");
    }

//    @Bean
//    public InterceptorRegistration re(){
//        return new InterceptorRegistration(new DemoInterceptor());
//    }




}
