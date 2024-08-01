package guru.springframework.dependencyinjectionwithspring.controllers;

import guru.springframework.dependencyinjectionwithspring.services.GreetingService;
import org.springframework.stereotype.Controller;


public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
