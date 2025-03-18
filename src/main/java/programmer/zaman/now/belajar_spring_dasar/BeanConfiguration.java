package programmer.zaman.now.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        return foo;
    }
}
