package us.stallings.diproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import us.stallings.diproject.services.GreetingService;
import us.stallings.diproject.services.ConstructorGreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

