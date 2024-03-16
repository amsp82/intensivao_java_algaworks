
import java.math.BigDecimal;

public class TesteCalculo {

    public static void main(String[] args) {
        BigDecimal y = new BigDecimal("1.0");
        y = y.subtract(new BigDecimal("0.10"));
        y = y.subtract(new BigDecimal("0.20"));
        y = y.subtract(new BigDecimal("0.30"));
        System.out.println(y);

        double x = 1.0;
        x = x - 0.10;
        x = x - 0.20;
        x = x - 0.30;
        System.out.println(x);
    }
}
