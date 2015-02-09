package us.kulba.starter.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application is the initial app driver.
 *
 * @author James Kulba, jkulba@gmail.com
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("us.kulba.starter")
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
