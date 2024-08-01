package guru.springframework.dependencyinjectionwithspring.controllers;

import guru.springframework.dependencyinjectionwithspring.services.GreetingService;


public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
