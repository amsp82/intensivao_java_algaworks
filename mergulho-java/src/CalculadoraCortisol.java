
public class CalculadoraCortisol {

    public static void main(String[] args) {
        double cortisol = 18.6;

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        // boolean resultadoAnormal = !resultadoCortisol;
        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;

        System.out.println("Cortisol normal: " + resultadoNormal);
        System.out.println("Cortisol anormal: " + resultadoAnormal);
    }
}
