package us.kulba.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import us.kulba.starter.config.StarterDbConnectionConfig;

import javax.sql.DataSource;
import java.io.IOException;

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

    @Autowired
    private StarterDbConnectionConfig starterDbConnectionConfig;

    @Bean(name = "starterDataSource")
    public DataSource starterDatasource() throws IOException {
        org.apache.tomcat.jdbc.pool.DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource();
        ds.setDriverClassName(starterDbConnectionConfig.getDriverClassName());
        ds.setUrl(starterDbConnectionConfig.getUrl());
        ds.setUsername(starterDbConnectionConfig.getUsername());
        ds.setPassword(starterDbConnectionConfig.getPassword());

        return ds;
    }


    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
