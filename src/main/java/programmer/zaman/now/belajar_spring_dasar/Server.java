package programmer.zaman.now.belajar_spring_dasar;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class Server {

    @PostConstruct
    public void start(){
        log.info("Start Server");
    }

    @PreDestroy
    public void stop(){
        log.info("Stop Server");
    }
}
