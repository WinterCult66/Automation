/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emidad.automation.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Permafrost
 */
@Configuration
public class WebMvc implements WebMvcConfigurer{
    
    private static final int BROWSER_CACHE_CONTROL = 604800;
    
    @Override
    public void addResourceHandlers (ResourceHandlerRegistry registry){
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/static/") 
                .setCachePeriod(BROWSER_CACHE_CONTROL).resourceChain(true);
    }
    
    
}
