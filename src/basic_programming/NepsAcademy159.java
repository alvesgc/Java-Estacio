package basic_programming;

import java.util.Scanner;

public class NepsAcademy159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++) {
            soma += scanner.nextInt();
        }

        System.out.println(soma);

        scanner.close();
    }
}
