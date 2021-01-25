package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryInjectedController {

    private final GreetingService greetingService;

    public PrimaryInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting () {
        return greetingService.sayGreeting();
    }
}
