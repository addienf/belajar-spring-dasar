package programmer.zaman.now.belajar_spring_dasar.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@Data
public class FooBar {

    private  Foo foo;

    private Bar bar;
}
