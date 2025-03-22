package programmer.zaman.now.belajar_spring_dasar.data.Cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {

    private CyclicC cyclicC;
}
