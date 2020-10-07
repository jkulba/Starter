package us.kulba.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application is the initial app driver.
 *
 * Special Note: In order to allow the ComponentScan to find all of the classess with the
 * ComponentScan annotation, make sure this class is in the root classpath.
 *
 * @author James Kulba, jkulba@gmail.com
 */
@SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
