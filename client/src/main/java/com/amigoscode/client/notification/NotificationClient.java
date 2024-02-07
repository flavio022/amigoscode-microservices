package com.amigoscode.client.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * The NotificationClient.
 *
 * @author flaviodanilo
 * @Date 23/01/24.
 */

@FeignClient("notification")
public interface NotificationClient {

  @PostMapping("api/v1/notification")
  void sendNotification(NotificationRequest notificationRequest);
}

