package basic_programming;

import java.util.Scanner;
public class Matriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linha");
        int linha = sc.nextInt();
        System.out.println("Digitet a quantidade de colunas");
        int coluna = sc.nextInt();
        int [][] matriz = new int [linha][coluna];
        System.out.println("Digite os elementos que pertencem a matriz");
        for(int i = 0; i< linha; i ++) {
            for( int j = 0; j < coluna; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("A matriz fornecdia por...");
        for(int i = 0; i<linha; i++){
            for(int j = 0; j<coluna; j++) {
                System.out.print(matriz[i][j] + " ");

            }
             System.out.println();
        }
    }
}
