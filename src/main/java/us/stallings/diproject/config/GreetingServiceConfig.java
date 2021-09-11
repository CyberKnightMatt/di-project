package us.stallings.diproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import us.stallings.diproject.services.ConstructorGreetingService;
import us.stallings.diproject.services.PropertyInjectedGreetingService;
import us.stallings.diproject.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
