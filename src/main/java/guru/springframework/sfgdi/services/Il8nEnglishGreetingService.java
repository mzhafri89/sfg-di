package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("il8nService")
@Profile({"EN", "default"})
public class Il8nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello";
    }
}
