package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Profile("cf")
public class CfConfiguration {
	@Autowired
	Environment env;

	@Value("${spring.datasource.url}")
	private String SPRING_DATASOURCE_URL;

	@Value("${spring.datasource.username}")
	private String SPRING_DATASOURCE_USERNAME;

	@Value("${spring.datasource.password}")
	private String SPRING_DATASOURCE_PASSWORD;

//	@Value("${spring.datasource.testWhileIdle}")
//	private String SPRING_DATASOURCE_TESTWHILEIDLE;
//
//	@Value("${spring.datasource.validationQuery}")
//	private String SPRING_DATASOURCE_VALIDATIONQUERY;
//
//	@Value("${spring.jpa.show-sql}")
//	private String SPRING_JPA_SHOWSQL;
//
//	@Value("${spring.jpa.hibernate.ddl-auto}")
//	private String SPRING_JPA_HIBERNATE_DDL_AUTO;
//
//	@Value("${spring.jpa.hibernate.naming-strategy}")
//	private String SPRING_JPA_HIBERNATE_NAMING_STRATEGY;
//
//	@Value("${spring.jpa.properties.hibernate.dialect}")
//	private String SPRING_JPA_PROPERTIES_HIBERNATE_DIALECT;
}



