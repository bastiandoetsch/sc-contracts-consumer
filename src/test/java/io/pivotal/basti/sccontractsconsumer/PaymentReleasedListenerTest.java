package io.pivotal.basti.sccontractsconsumer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.StubTrigger;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(stubsMode = StubRunnerProperties.StubsMode.REMOTE,
        repositoryRoot = "git://git@github.com:bastiandoetsch/sc-contracts-contracts.git",
        ids = {"io.pivotal.basti:sc-contracts-producer:+:"})
public class PaymentReleasedListenerTest {
    @Autowired
    StubTrigger stubTrigger;

    @Test
    public void testMessageReceipt() {
        stubTrigger.trigger("paymentReleased");

    }

}
