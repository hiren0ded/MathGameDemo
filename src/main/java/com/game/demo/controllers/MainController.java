package com.game.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping("/")
    public ModelAndView swagger()
    {
        return new ModelAndView("redirect:" + "swagger-ui.html");
    }

}
