package programmer.zaman.now.belajar_spring_dasar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @Test
    void test() {
        Connection connection = applicationContext.getBean(Connection.class);

        applicationContext.close();
    }

    @Test
    void testServer() {
        applicationContext.getBean(Server.class);
    }
}
