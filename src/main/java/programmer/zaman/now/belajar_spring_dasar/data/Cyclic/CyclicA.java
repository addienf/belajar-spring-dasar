package programmer.zaman.now.belajar_spring_dasar.data.Cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicA {

    private CyclicB cyclicB;
}
