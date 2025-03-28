package programmer.zaman.now.belajar_spring_dasar;

import lombok.Data;

@Data
public class PaymentGatewayClient {

    private String endpoint;

    private String publicKey;

    private String privateKey;

}
