package com.arangodb.spring.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class DemoApplication {
    public static void main(final String... args) {
        Class<?>[] runner = new Class<?>[]{};
        System.exit(SpringApplication.exit(SpringApplication.run(runner, args)));
    }
}
