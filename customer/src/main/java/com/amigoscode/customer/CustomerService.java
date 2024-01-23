package com.amigoscode.customer;

import com.amigoscode.client.fraud.FraudCheckResponse;
import com.amigoscode.client.fraud.FraudClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * The CustomerService.
 *
 * @author flaviodanilo
 * @Date 28/09/23.
 */
@Service
@AllArgsConstructor
public class CustomerService {

  private final CustomerRepository customerRepository;
  private final RestTemplate restTemplate;
  private final FraudClient fraudClient;
  public void registerCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
          .firstName(request.firstName())
          .lastName(request.lastName())
          .email(request.email())
          .build();
    // todo: check if email valid
    // todo: check if email not taken
    customerRepository.saveAndFlush(customer);


    FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

    if(fraudCheckResponse.isFraudster()){
      throw new IllegalStateException("fraudster");
    }
  }
}
