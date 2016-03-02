package br.com.rbarbioni.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by renan on 16/12/15.
 */

@EnableAutoConfiguration
@ComponentScan(basePackages = { Constants.PACKAGE_BASE })
@EnableJpaRepositories(basePackages = { Constants.PACKAGE_BASE })
@SpringBootApplication
public class StoreApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StoreApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StoreApplication.class, args);
    }

}