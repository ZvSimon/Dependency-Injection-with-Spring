package guru.springframework.dependencyinjectionwithspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class GreetingServicePrimary implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello Everyone - Primary Greeting service";
    }
}
