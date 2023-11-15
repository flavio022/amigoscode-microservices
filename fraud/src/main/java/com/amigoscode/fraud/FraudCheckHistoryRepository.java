package com.amigoscode.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The com.amigoscode.fraud.FraudCheckHistoryRepository.
 *
 * @author flaviodanilo
 * @Date 01/10/23.
 */
public interface FraudCheckHistoryRepository
      extends JpaRepository<FraudCheckHistory, Integer> {
}