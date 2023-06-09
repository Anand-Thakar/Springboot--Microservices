package com.example.orderservice.external.dto;

import com.example.orderservice.model.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDtoRequest {

    private long orderId;
    private long amount;
    private PaymentMode paymentMode;
}
