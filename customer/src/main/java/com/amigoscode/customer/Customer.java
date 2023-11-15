package com.amigoscode.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Builder;
import lombok.Data;

/**
 * The Customer.
 *
 * @author flaviodanilo
 * @Date 28/09/23.
 */
@Data
@Builder
@Entity
public class Customer {
  @Id
  @SequenceGenerator(
        name = "customer_id_sequence",
        sequenceName = "customer_id_sequence"
  )
  @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "customer_id_sequence"
  )
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;
}
