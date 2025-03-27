package programmer.zaman.now.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmer.zaman.now.belajar_spring_dasar.repository.ProductRepository;
import programmer.zaman.now.belajar_spring_dasar.service.ProductService;

public class ConstructBasedDITest {

    ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void testBean() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        Assertions.assertNotNull(productService);

        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        Assertions.assertNotNull(productRepository);
    }
}
