package ar.org.centro8.curso.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWeb {

    @GetMapping("/welcome")
    public String getWelcome() {
        return "login";
    }
    
    @GetMapping("/calc")
    public String getCalculadora() {
        return "calculadora";
    }

    @GetMapping("/calc2")
    public String getCalculadora2() {
        return "calculadora2";
    }
}
