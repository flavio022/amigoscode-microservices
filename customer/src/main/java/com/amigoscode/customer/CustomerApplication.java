package com.amigoscode.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * The CustomerApplication.
 *
 * @author flaviodanilo
 * @Date 28/09/23.
 */
@SpringBootApplication(
      scanBasePackages = {
            "com.amigoscode.customer",
            "com.amigoscode.amqp",
      }
)
@EnableEurekaClient
@EnableFeignClients(
      basePackages = "com.amigoscode.client"
)
public class CustomerApplication {
  public static void main(String args[]){
    SpringApplication.run(CustomerApplication.class,args);
  }

}
