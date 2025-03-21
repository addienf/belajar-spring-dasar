package programmer.zaman.now.belajar_spring_dasar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import programmer.zaman.now.belajar_spring_dasar.data.Bar;
import programmer.zaman.now.belajar_spring_dasar.data.Foo;
import programmer.zaman.now.belajar_spring_dasar.data.FooBar;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        Foo foo = new Foo();
        log.info("Create new foo1");
        return foo;
    }

    @Bean(value = "fooSecond")
    public Foo foo2(){
        Foo foo = new Foo();
        log.info("Create new foo2");
        return foo;
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
