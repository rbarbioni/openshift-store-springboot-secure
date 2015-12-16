package br.com.rbarbioni.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by renan on 16/12/15.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class StoreApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StoreApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StoreApplication.class, args);
    }

}