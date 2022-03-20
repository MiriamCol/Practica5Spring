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

    @GetMapping("/prueba")
    public String getPrueba(Model model) {

        return "prueba.json";
    }

    @GetMapping("/proc")
    public String getprog(Model model) {

        return "Proyectos";
    }

    @PostMapping("/")
    public String greetingSubmit(@ModelAttribute Registro registrarse ,@Valid Registro registro, BindingResult bindingResult, Model model)
    {


        model.addAttribute("registrarse", registrarse);
        /*
        JSONObject myObject = new JSONObject();
        myObject.put("name", "Carlos");
        myObject.put("name", "Carlos");
        myObject.put("name", "Carlos");
        myObject.put("name", "Carlos");
        */



        if (bindingResult.hasErrors()) {
            return "registrarse";

        }


        return "result";
    }



}