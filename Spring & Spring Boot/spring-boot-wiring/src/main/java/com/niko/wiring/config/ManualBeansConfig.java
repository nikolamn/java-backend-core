package com.niko.wiring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.zaxxer.hikari.HikariDataSource;

import jakarta.validation.Validator;

// manual configuration beans:
// - commented: Boot auto-configures
// - uncommented: override Boot deatults
@Configuration
public class ManualBeansConfig {

//	 @Bean
//     @Primary // overrides auto-configured DataSource
//     public DataSource manualDataSource() {
//         HikariDataSource ds = new HikariDataSource();
//         ds.setJdbcUrl("jdbc:h2:mem:manualdb");
//         ds.setUsername("sa");
//         ds.setPassword("");
//         System.out.println("Manual DataSource initialized!");
//         return ds;
//     }
//	
//     @Bean
//     @Primary // Overrides auto-configured Validator
//     public Validator manualValidator() {
//         System.out.println("Manual Validator initialized!");
//         return new LocalValidatorFactoryBean();
//     }
}
