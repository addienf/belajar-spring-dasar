package programmer.zaman.now.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmer.zaman.now.belajar_spring_dasar.data.Foo;

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

}
