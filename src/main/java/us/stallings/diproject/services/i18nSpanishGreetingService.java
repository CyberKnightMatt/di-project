package us.stallings.diproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class i18nSpanishGreetingService implements GreetingService{
    private final GreetingService greetingService;

    public i18nSpanishGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
