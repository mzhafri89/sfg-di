package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("il8nService")
@Profile("ES")
public class Il8nSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Ola";
    }
}
