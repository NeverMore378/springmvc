package pers.xzj.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import pers.xzj.springmvc.converter.Dataconverter;

@Configuration
public class ConverterConfig extends WebMvcConfigurationSupport {

    protected void addFormatters(FormatterRegistry registry) {

        registry.addConverter(new Dataconverter());
    }

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new DemoInterceptor()).addPathPatterns("/**");
    }

}
