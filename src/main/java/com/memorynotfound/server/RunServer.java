package com.memorynotfound.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;
//@EnableAutoConfiguration
//@ComponentScan
import org.springframework.web.bind.annotation.RequestMapping;
@SpringBootApplication
public class RunServer extends SpringBootServletInitializer{

   /* public static void main(String[] args) {
        SpringApplication.run(RunServer.class);
    }
   */ 
   /* protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	RunServer obj = new RunServer();
        @SuppressWarnings("resource")
        ConfigurableApplicationContext applicationContext = 
             new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
         applicationContext.registerShutdownHook();
         applicationContext.getBeanFactory().autowireBeanProperties(
             obj, AutowireCapableBeanFactory.AUTOWIRE_NO, false);
        return application.sources(RunServer.class);
    }*/

    
  
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RunServer.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RunServer.class, args);
    }
    
    
    

}


