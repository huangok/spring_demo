package org.version_release;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"org.version.controller","org.version.service"})
@EntityScan(basePackages= {"org.version.bean"})
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication app=new SpringApplication(App.class);
    		app.setBannerMode(Banner.Mode.OFF);
    		app.run(args);
    }
}
