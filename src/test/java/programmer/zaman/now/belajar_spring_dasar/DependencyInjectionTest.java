package programmer.zaman.now.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmer.zaman.now.belajar_spring_dasar.data.Bar;
import programmer.zaman.now.belajar_spring_dasar.data.Foo;
import programmer.zaman.now.belajar_spring_dasar.data.FooBar;

public class DependencyInjectionTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);

    @Test
    void testDI() {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);
        Assertions.assertSame(fooBar.getBar(), bar);
        Assertions.assertSame(fooBar.getFoo(), foo);
    }

    @Test
    void testDI2() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(bar, fooBar.getBar());
        Assertions.assertSame(foo, fooBar.getFoo());
    }

    @Test
    void testDI3() {
        Foo foo = applicationContext.getBean( "fooSecond", Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(bar, fooBar.getBar());
        Assertions.assertSame(foo, fooBar.getFoo());
    }
}
