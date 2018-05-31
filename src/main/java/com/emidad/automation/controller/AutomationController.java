/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emidad.automation.controller;

import com.emidad.automation.constants.TemplatesConstants;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author krodriguez
 */
@Controller
public class AutomationController {

    private static final Logger LOG = LogManager.getLogger(HomeController.class);

    @GetMapping("/createtest")
    public String home() {
        LOG.log(Level.INFO, "Start createtest" + "...");
        return TemplatesConstants.CREATETEST;
    }

}
