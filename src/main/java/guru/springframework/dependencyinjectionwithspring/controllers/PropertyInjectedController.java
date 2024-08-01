package guru.springframework.dependencyinjectionwithspring.controllers;

import guru.springframework.dependencyinjectionwithspring.services.GreetingService;
import org.springframework.stereotype.Controller;


public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
