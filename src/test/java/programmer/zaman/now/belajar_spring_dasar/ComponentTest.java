package programmer.zaman.now.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmer.zaman.now.belajar_spring_dasar.repository.CategoryRepository;
import programmer.zaman.now.belajar_spring_dasar.repository.ProductRepository;
import programmer.zaman.now.belajar_spring_dasar.service.CategoryService;
import programmer.zaman.now.belajar_spring_dasar.service.ProductService;

public class ComponentTest {

    ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void testImport() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductService productService1 = applicationContext.getBean("productService",ProductService.class);

        Assertions.assertNotNull(productService);
    }

    @Test
    void testConstructorDI() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testConstructorDISetter() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }
}
