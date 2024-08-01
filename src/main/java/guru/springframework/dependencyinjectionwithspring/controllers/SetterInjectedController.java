package guru.springframework.dependencyinjectionwithspring.controllers;

import guru.springframework.dependencyinjectionwithspring.services.GreetingService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
