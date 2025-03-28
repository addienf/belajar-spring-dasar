package programmer.zaman.now.belajar_spring_dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmer.zaman.now.belajar_spring_dasar.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "programmer.zaman.now.belajar_spring_dasar.service",
        "programmer.zaman.now.belajar_spring_dasar.repository",
        "programmer.zaman.now.belajar_spring_dasar.configuration",
        "programmer.zaman.now.belajar_spring_dasar.factory"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
