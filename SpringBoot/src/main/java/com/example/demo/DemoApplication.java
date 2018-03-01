package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// one way to fix not finding embeded DB driver
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// Need this because the stupid default only scan root package. That mean if your shit ain't in
// the same package as your application, it will not be scan and your @RequestMapping won't work
// https://stackoverflow.com/a/47283396
// https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-structuring-your-code.html
@ComponentScan("com.controller")
public class DemoApplication {
//https://spring.io/blog/2015/01/12/spring-and-angular-js-a-secure-single-page-application
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
