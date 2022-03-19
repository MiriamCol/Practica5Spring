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
public class Practica5SpringController {



    @GetMapping("/registrarse")
    public String greetingForm(Model model) {
        model.addAttribute("registrarse", new Registro());
        return "registrarse";
    }

    @PostMapping("/result")
    public String greetingSubmit(@ModelAttribute Registro registrarse ,@Valid Registro registro, BindingResult bindingResult, Model model)
    {
        if (bindingResult.hasErrors()) {
            return "registrarse";
        }
        model.addAttribute("registrarse", registrarse);
        return "result";
    }



}