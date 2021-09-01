package us.stallings.diproject.controllers;

import us.stallings.diproject.services.GreetingService;
import us.stallings.diproject.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

