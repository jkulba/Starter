package us.kulba.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import us.kulba.starter.config.StarterDbConnectionConfig;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * JdbcTestConfig is used by the JUnit tests to setup any bean dependencies.
 *
 * @author James Kulba, jkulba@gmail.com
 */
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan("us.kulba.starter")
public class JdbcTestConfig {

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

}
