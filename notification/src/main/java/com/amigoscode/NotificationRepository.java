package com.amigoscode;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The NotificationRepository.
 *
 * @author flaviodanilo
 * @Date 23/01/24.
 */

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
