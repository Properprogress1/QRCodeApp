package com.digital_pay.application.dto;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class PaymentResponse {
    private String transactionId;
    private String status;
    private BigDecimal userBalance;
    private BigDecimal merchantBalance;
    private PaymentRequest paymentDetails;
}