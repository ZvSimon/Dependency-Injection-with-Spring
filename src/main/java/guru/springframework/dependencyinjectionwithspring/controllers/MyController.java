package guru.springframework.dependencyinjectionwithspring.controllers;

import guru.springframework.dependencyinjectionwithspring.services.GreetingService;
import guru.springframework.dependencyinjectionwithspring.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

   public MyController(){
       this.greetingService=new GreetingServiceImpl();
   }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }

}
