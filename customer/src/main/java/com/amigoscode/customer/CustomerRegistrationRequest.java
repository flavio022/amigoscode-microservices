package com.amigoscode.customer;

/**
 * The CustomerRegistrationRequest.
 *
 * @author flaviodanilo
 * @Date 28/09/23.
 */
public record CustomerRegistrationRequest(
      String firstName,
      String lastName,
      String email) {

}
