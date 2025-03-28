package programmer.zaman.now.belajar_spring_dasar.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import programmer.zaman.now.belajar_spring_dasar.PaymentGatewayClient;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://payment/");
        client.setPrivateKey("PRIVATE");
        client.setPublicKey("{PUBLIC");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
