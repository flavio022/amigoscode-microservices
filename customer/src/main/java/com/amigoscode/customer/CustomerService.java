package com.amigoscode.customer;

import com.amigoscode.client.fraud.FraudCheckResponse;
import com.amigoscode.client.fraud.FraudClient;
import com.amigoscode.client.notification.NotificationClient;
import com.amigoscode.client.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
  private final NotificationClient notificationClient;
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

    notificationClient.sendNotification(
          new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Hi %s, welcome to Amigoscode...",
                      customer.getFirstName())
          )
    );
  }
}
