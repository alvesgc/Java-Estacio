package basic_programming;

import java.util.Scanner;
public class DivisaoSoma {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        int media = (a + b ) / 2;
        System.out.println(media);
    }
}
