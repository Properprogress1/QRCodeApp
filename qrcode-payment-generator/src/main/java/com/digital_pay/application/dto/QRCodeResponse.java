package com.digital_pay.application.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QRCodeResponse {
    private String qrCodeBase64;
    private String transactionId;
    private PaymentRequest paymentDetails;
}