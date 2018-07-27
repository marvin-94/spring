package com.marvin.spring.controller;

import com.marvin.spring.model.Spitter;
import com.marvin.spring.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
    private final SpitterService spitterService;

    @Autowired
    public SpitterController(SpitterService spitterService) {
        this.spitterService = spitterService;
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String registerForm(Model model) {
        model.addAttribute("spitter",new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@Validated Spitter spitter, Errors errors) {
        if(errors.hasErrors()){
            return "registerForm";
        }
        spitterService.register(spitter);
        return "success";
    }
}
