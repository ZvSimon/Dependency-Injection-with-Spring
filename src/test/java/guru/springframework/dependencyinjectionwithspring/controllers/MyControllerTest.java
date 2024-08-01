package guru.springframework.dependencyinjectionwithspring.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {
    @Test
    void sayHello() {
        MyController myController = new MyController();
        assertEquals("Hello Everyone From Base Service Implementation!!!", myController.sayHello());
        System.out.println(myController.sayHello());
    }

}