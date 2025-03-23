package programmer.zaman.now.belajar_spring_dasar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import programmer.zaman.now.belajar_spring_dasar.data.Bar;
import programmer.zaman.now.belajar_spring_dasar.data.Foo;
import programmer.zaman.now.belajar_spring_dasar.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Lazy
    @Bean
    @Scope(value = "prototype")
    @DependsOn(value = {"bar"})
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
