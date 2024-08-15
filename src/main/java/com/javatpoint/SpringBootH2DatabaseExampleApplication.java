package com.javatpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScans({ @ComponentScan("com.javatpoint.controller") })
@EnableJpaRepositories("com.javatpoint.repository")
@EntityScan("com.javatpoint.model")
public class SpringBootH2DatabaseExampleApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(SpringBootH2DatabaseExampleApplication.class, args);
}
}
