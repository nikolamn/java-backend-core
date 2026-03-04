package com.niko.wiring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niko.wiring.service.GreetingService;


// Boot handles http requests automatically 
// (auto-configures  DispatcherServlet and RequestMappingHandlerMapping)
// REST endpoints exposed automatically
@RestController
public class GreetingController {

    private final GreetingService service; // injected automatically

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/greet") // auto-registered endpoint via Boot MVC
    public String greet(@RequestParam String name) {
        return service.greet(name);
    }
}