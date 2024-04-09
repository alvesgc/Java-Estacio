package basic_programming;

import java.util.Scanner;
public class Vetor_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int n = sc.nextInt();
        int vetor[] = new int [n];
        System.out.println("Digite os elementos que pertencem a esse vetor");
        for(int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        System.out.println("Impressão de elementos...");
        for(int i = 0; i <  vetor.length; i++){
            System.out.println(vetor[i] + "");
        }
    }
}

