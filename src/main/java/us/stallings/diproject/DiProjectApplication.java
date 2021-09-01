package us.stallings.diproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import us.stallings.diproject.controllers.ConstructorInjectedController;
import us.stallings.diproject.controllers.MyController;
import us.stallings.diproject.controllers.PropertyInjectedController;
import us.stallings.diproject.controllers.SetterInjectedController;

@SpringBootApplication
public class DiProjectApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiProjectApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("----- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
