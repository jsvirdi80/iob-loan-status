package com.iob.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final LoanService service;

    @Value("${CF_INSTANCE_INDEX:local}")
    private String instance;

    public HomeController(LoanService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("loans", service.all());
        model.addAttribute("bootVersion", SpringBootVersion.getVersion());
        model.addAttribute("springVersion", SpringVersion.getVersion());
        model.addAttribute("javaVersion", System.getProperty("java.version"));
        model.addAttribute("instance", instance);
        return "index";
    }
}
