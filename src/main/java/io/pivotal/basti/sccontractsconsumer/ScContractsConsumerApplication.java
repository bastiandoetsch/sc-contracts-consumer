package io.pivotal.basti.sccontractsconsumer;

import io.pivotal.basti.sccontractsconsumer.payment.PaymentReleasedChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(PaymentReleasedChannel.class)
@SpringBootApplication
public class ScContractsConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScContractsConsumerApplication.class, args);
    }

}
