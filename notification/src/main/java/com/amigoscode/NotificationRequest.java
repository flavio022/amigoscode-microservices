package com.amigoscode;

public record NotificationRequest(
      Integer toCustomerId,
      String toCustomerName,
      String message
) {
}