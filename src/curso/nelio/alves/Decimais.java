package curso.nelio.alves;
import java.util.Locale;
public class Decimais {

    public static void main(String[] args) {
        /* O tipo de dados double é um dado primitivo
        geralmente utilizado para representar dados
        com pontos flutuantes com parte fracionária.
        */
        double x = 10.35784;
        System.out.println(x);
        Locale.setDefault(Locale.US); // Mudar a "linguagem" do local
        System.out.printf("%.2f%n", x); // Fracionado por 2 casas decimais e arrendondamento de número
        System.out.printf("%.4f%n", x); // Fracionado por 4 casas decimais.
        System.out.println("The result is " + x + " metters");

        String nome = "Alisson";
        int idade = 23;
        double renda = 4000.0;
        System.out.printf("%s have %d years and his salary is $ %.2f dollars%n", nome,idade,renda);
    }
}

/*
* Regra geral do printf
* %f = ponto flutuante
* %d = inteiro
* %s = texto
* %n = quebra de linha
* Ele pegara cada um dos módulos acima e substituira
* pelas variaveis criada "idade, nome, renda"
* */