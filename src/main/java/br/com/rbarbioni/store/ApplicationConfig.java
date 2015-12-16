package br.com.rbarbioni.store;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by root on 10/12/15.
 */
@Configuration
@EnableJpaRepositories(basePackages = { Constants.PACKAGE_BASE })
@ComponentScan(basePackages = { Constants.PACKAGE_BASE })
@PropertySource({"classpath:application.properties" })
@EnableWebMvc
public class ApplicationConfig extends WebMvcConfigurerAdapter {

	final static Logger logger = LoggerFactory.getLogger(ApplicationConfig.class);

//	@Bean(name = "dataSource")
//	public DataSource dataSource() {
//
//		try {
//	        return (DataSource) new InitialContext().lookup("java:comp/env/jdbc/MySQLDS");
//		} catch (Exception e) {
//			logger.error("Datasource Error", e);
//		}
//		return null;
//	}


//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
//		builder.applicationContext( ApiWebApplicationContext.getApplicationContext());
//		builder.serializationInclusion(JsonInclude.Include.NON_NULL);
//		builder.failOnUnknownProperties(false);
//		builder.failOnEmptyBeans(false);
//		builder.propertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
//		builder.serializationInclusion(JsonInclude.Include.NON_EMPTY);
//		builder.indentOutput(true).dateFormat(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"));
//		ObjectMapper build = builder.build();
//		converters.add(new MappingJackson2HttpMessageConverter(build));
//		build.registerModule( new Hibernate5Module());
//	}
}