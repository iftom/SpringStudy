package test.wxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.wxy.autoconfig.Person;

@Configuration
public class JavaConfig {
    @Bean
    Person sayHello() {
        return new Person();
    }
}