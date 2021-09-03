package com.example.Web_site_blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.Web_site_blog.controllers")
public class WebSiteBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSiteBlogApplication.class, args);
	}

}
