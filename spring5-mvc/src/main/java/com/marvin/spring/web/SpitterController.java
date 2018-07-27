package com.marvin.spring.web;

import com.marvin.spring.data.SpitterRepository;
import com.marvin.spring.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
    @Autowired
    private SpitterRepository spitterRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrateForm() {
        return "registerForm";
    }

    //form表单不指定action 提交会到当前网址
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid Spitter spitter, Errors errors) {//form表单校验，@Valid必须和Error一起使用，errors紧跟着@Valide后面
        if(errors.hasErrors()){
            return "registerForm";
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();//redirect 重定向到指定页面
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showInfo(@PathVariable String username, Model model) {
        Spitter ss = spitterRepository.findByUsername(username);
        model.addAttribute("spitter", ss);
        return "profile";
    }
}

