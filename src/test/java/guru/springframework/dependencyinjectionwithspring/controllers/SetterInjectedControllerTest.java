package guru.springframework.dependencyinjectionwithspring.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import guru.springframework.dependencyinjectionwithspring.services.GreetingServiceImpl;


class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}