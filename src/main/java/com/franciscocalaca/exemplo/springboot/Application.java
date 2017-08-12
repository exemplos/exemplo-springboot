package com.franciscocalaca.exemplo.springboot;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.google.common.base.Predicate;

import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

   
   @Bean
   public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
     LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
     em.setDataSource(dataSource);
     em.setJpaVendorAdapter(jpaVendorAdapter());
     em.setPackagesToScan("com.franciscocalaca.exemplo.springboot");
     return em;
   }
   
   @Bean
   public HibernateJpaVendorAdapter jpaVendorAdapter(){
     HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
     jpaVendorAdapter.setShowSql(true);
     jpaVendorAdapter.setGenerateDdl(true);
     jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
     return jpaVendorAdapter;
   }   

   @Bean
   public Docket allApi() {
       return new Docket(DocumentationType.SWAGGER_2)
               .groupName("All")
               .apiInfo(apiInfo())
               .select()
               .paths(PathSelectors.any())
               .build()
               .ignoredParameterTypes(ApiIgnore.class)
               .enableUrlTemplating(true);
   }

   @Bean
   public Docket personApi() {
       return new Docket(DocumentationType.SWAGGER_2)
               .groupName("Person")
               .apiInfo(apiInfo())
               .select()
               .paths(personPaths())
               .build()
               .ignoredParameterTypes(ApiIgnore.class)
               .enableUrlTemplating(true);
   }
   
   private Predicate<String> personPaths() {
      return PathSelectors.regex("/*");
  }

  private ApiInfo apiInfo() {
      return new ApiInfoBuilder()
              .title("Springfox petstore API")
              .description("Spring Boot Angular example")
              .termsOfServiceUrl("http://springfox.io")
              .contact("springfox")
              .license("Apache License Version 2.0")
              .licenseUrl("https://github.com/convergencia-tecnologia/springboot-angular")
              .version("2.0")
              .build();
  }
   
}