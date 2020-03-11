package io.pivotal.basti.sccontractsconsumer.payment;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;


public interface PaymentReleasedChannel {
    String CHANNEL_NAME = "payment-released";

    @Input(CHANNEL_NAME)
    MessageChannel output();
}

