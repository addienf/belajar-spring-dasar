package programmer.zaman.now.belajar_spring_dasar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmer.zaman.now.belajar_spring_dasar.configuration.FactoryConfiguration;

public class FactoryBeanTest {

    ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void test() {

        PaymentGatewayClient client = applicationContext.getBean(PaymentGatewayClient.class);
        Assertions.assertEquals("https://payment/", client.getEndpoint());
        Assertions.assertEquals("PRIVATE", client.getPrivateKey());
        Assertions.assertEquals("PUBLIC", client.getPublicKey());
    }
}
