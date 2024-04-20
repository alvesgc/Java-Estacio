package curso.nelio.alves;

import java.util.Locale;

public class ExerciceOne {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        String gender = "M";

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is %.2f ", product1, price1);
        System.out.println();
        System.out.printf("%s, which price is %.2f ", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code $d and gender: %s", age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %f", measure);
        System.out.println();
        System.out.printf("Rounded (three decimal places): %.3f", measure);
        System.out.println();
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
