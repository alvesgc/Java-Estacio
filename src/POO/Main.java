package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Exemplo de POO
        System.out.println("Digite o nome do funcionário: ");
        String nome = sc.next();
        System.out.println("Digite o sálario do funcionario");
        float salario = sc.nextFloat();

        Funcionario f1 = new Funcionario(); // POO
        f1.ola(nome);
        f1.salario(salario, nome);
    }
}
