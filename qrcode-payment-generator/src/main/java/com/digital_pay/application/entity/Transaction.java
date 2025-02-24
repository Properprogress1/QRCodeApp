package com.digital_pay.application.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(36)")
    private String id;

    private BigDecimal amount;
    private String currency;
    private Long merchantId;
    private Long userId;
    private String description;
    private String status;
    private LocalDateTime createdAt;
}