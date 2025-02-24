package com.digital_pay.application.entity;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    private Long id;

    private BigDecimal balance;
}