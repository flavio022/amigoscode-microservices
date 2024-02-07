package com.amigoscode.client.notification;

/**
 * The NotificationRequest.
 *
 * @author flaviodanilo
 * @Date 23/01/24.
 */
public record NotificationRequest(
      Integer toCustomerId,
      String toCustomerName,
      String message
) {
}