package io.pivotal.basti.sccontractsconsumer.payment;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class PaymentReleasedEvent {
    private String paymentId, currency;
    private BigDecimal amount;
}
