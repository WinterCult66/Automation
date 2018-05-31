/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emidad.automation.controller;

import com.emidad.automation.constants.TemplatesConstants;
import org.apache.logging.log4j.Level;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Permafrost
 */
@Controller
public class HomeController {

    private static final Logger LOG = LogManager.getLogger(HomeController.class);

    @GetMapping("/home")
    public String home() {
        LOG.log(Level.INFO, "Start " + TemplatesConstants.HOME + "...");
        return TemplatesConstants.HOME;
    }
    
    
    
        @GetMapping("/")
    public String redirectHome() {
        LOG.log(Level.INFO, "Start " + TemplatesConstants.HOME + "...");
        return TemplatesConstants.HOME;
    }
    

}
