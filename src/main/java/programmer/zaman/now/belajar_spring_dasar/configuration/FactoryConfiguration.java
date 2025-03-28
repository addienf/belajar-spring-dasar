package programmer.zaman.now.belajar_spring_dasar.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmer.zaman.now.belajar_spring_dasar.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import(value = {
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
