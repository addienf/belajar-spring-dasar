package programmer.zaman.now.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfiguration {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server(){
        return new Server();
    }
}
