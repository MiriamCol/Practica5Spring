package com.example.Practica5Spring;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class Practica5SpringController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/result").setViewName("result");
    }


    @GetMapping("/")
    public String greetingForm(Model model) {
        model.addAttribute("registrarse", new Registro());
        return "registrarse";
    }



    @PostMapping("/info")
    public String greetingSubmit(@Valid @ModelAttribute("registrarse") Registro registrarse, BindingResult bindingResult, Model model)
    {
        model.addAttribute("registrarse", registrarse);

        if (bindingResult.hasErrors()) {
            return "registrarse";
        }

        return "result";
    }





}