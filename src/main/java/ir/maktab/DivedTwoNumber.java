package ir.maktab;
import lombok.*;
@Getter
@Setter
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
//@Data
public class DivedTwoNumber {
    private double a;
    private double b;

    public double divide() throws InvalidInputExeption {

        if (this.b != 0) {
            return this.a / this.b;  // cannot divide by zero

        } else
            throw new InvalidInputExeption("invalid zero");
        //throw new RuntimeException("value is zero can not divided");
    }
}

