package com.amigoscode.client.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * The FraudClient.
 *
 * @author flaviodanilo
 * @Date 21/12/23.
 */

@FeignClient("fraud")
public interface FraudClient {

  @GetMapping(path = "api/v1/fraud-check/{customerId}")
  FraudCheckResponse isFraudster(
        @PathVariable("customerId") Integer custumerId);

}
