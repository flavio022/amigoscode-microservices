package com.amigoscode.customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The CustomerRepository.
 *
 * @author flaviodanilo
 * @Date 30/09/23.
 */

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
