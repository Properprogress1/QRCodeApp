package com.digital_pay.application.dto;

import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Data
public class PaymentRequest {
    @NotNull
    @Positive
    private BigDecimal amount;

    @NotNull
    private String currency;

    @NotNull
    private Long merchantId;

    private String description;

    @NotNull
    private Long userId;
}
