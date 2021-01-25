package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

public class ConstructorInjectedController {

    private final GreetingServiceImpl greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting () {
        return greetingService.sayGreeting();
    }
}
