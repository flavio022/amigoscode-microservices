package com.amigoscode.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * The CustomerConfig.
 *
 * @author flaviodanilo
 * @Date 01/10/23.
 */
@Configuration
public class CustomerConfig {
  @Bean
  @LoadBalanced
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }
}
