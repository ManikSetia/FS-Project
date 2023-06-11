package com.example.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class SpringBootExampleApplication {

//    record Person(String name, int age, double money) {}
//    record Greeting(
//            String greeting,
//            List<String> favProgrammingLanguages,
//            Person person) {} //this is equivalent to the following class

//    class Greeting {
//        private String greet;
//
//        Greeting(String greet) {
//            this.greet = greet;
//        }
//
//        @Override
//        public String toString() {
//            return "Greeting{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        //this getter is important to set the value of "greet" instance variable
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Greeting greeting = (Greeting) o;
//            return Objects.equals(greet, greeting.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(greet);
//        }
//    }

//    @GetMapping("/greet")
//    public Greeting greet() {
//        return new Greeting("hello", List.of("Java", "Python"), new Person("Manik", 22, 1_00_000));
//    }


    public static void main(String[] args) {

        //To see all the beans managed by application context
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootExampleApplication.class, args);

//        printBeans(applicationContext);
    }

    private static void printBeans(ConfigurableApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    //By adding @Bean, it'll be managed by Spring and the dependency will be injected wherever we need.
    @Bean("foo")
    Foo getFoo() {
        return new Foo("bar");
    }

    public record Foo(String name) {}


}
