package programmer.zaman.now.belajar_spring_dasar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepensOnTest {

    ApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);


}
