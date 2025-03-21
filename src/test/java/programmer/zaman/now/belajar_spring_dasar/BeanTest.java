package programmer.zaman.now.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmer.zaman.now.belajar_spring_dasar.data.Foo;

public class BeanTest {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    @Test
    void testBean() {


        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);

        Assertions.assertSame(foo2, foo1);
    }

    @Test
    void duplicateBean() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("foo1", Foo.class);
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo1, foo2);
    }

    @Test
    void duplicateBean2() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("fooFirst", Foo.class);
        Foo foo2 = applicationContext.getBean("fooSecond", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo1, foo2);
    }
}
