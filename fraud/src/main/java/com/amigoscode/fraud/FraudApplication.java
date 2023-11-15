package com.amigoscode.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * The FraudApplication.
 *
 * @author flaviodanilo
 * @Date 01/10/23.
 */

@SpringBootApplication
@EnableEurekaClient
public class FraudApplication {
  public static void main(String[] args) {
    SpringApplication.run(FraudApplication.class, args);
  }
}
