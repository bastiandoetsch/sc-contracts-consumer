package io.pivotal.basti.sccontractsconsumer.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

@Slf4j
@EnableBinding({PaymentReleasedChannel.class})
public class PaymentReleasedListener {

    @StreamListener(PaymentReleasedChannel.CHANNEL_NAME)
    public void onMessage(Message message) {
        log.warn("Received message: {}", message);
    }
}
