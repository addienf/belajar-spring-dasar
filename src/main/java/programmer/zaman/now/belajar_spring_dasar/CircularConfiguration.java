package programmer.zaman.now.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmer.zaman.now.belajar_spring_dasar.data.Cyclic.CyclicA;
import programmer.zaman.now.belajar_spring_dasar.data.Cyclic.CyclicB;
import programmer.zaman.now.belajar_spring_dasar.data.Cyclic.CyclicC;

@Configuration
public class CircularConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }

}
