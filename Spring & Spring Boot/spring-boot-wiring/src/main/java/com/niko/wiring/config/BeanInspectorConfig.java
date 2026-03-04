package com.niko.wiring.config;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import jakarta.validation.Validator;

@Configuration
public class BeanInspectorConfig {

//    @Bean
//    public CommandLineRunner inspectBeans(
//            ApplicationContext context,
//            DataSource dataSource,
//            LocalContainerEntityManagerFactoryBean emfBean,
//            PlatformTransactionManager txManager,
//            DispatcherServlet dispatcherServlet,
//            RequestMappingHandlerMapping handlerMapping,
//            Validator validator
//    ) {
//        return args -> {
//            System.out.println("\n=== Key Auto-configured Beans ===");
//            System.out.println("1. DataSource: " + dataSource);
//            System.out.println("2. EntityManagerFactory: " + emfBean.getObject());
//            System.out.println("3. TransactionManager: " + txManager);
//            System.out.println("4. DispatcherServlet: " + dispatcherServlet);
//            System.out.println("5. RequestMappingHandlerMapping: " + handlerMapping);
//            System.out.println("6. Validator: " + validator);
//
//            System.out.println("\n=== All Beans in ApplicationContext ===");
//            String[] allBeans = context.getBeanDefinitionNames();
//            Arrays.sort(allBeans);
//            AtomicInteger counter = new AtomicInteger(1);
//            for (String beanName : allBeans) {
//                System.out.printf("%3d. %s%n", counter.getAndIncrement(), beanName);
//            }
//            System.out.println("======================================\n");
//        };
//    }
}