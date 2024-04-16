package Heranca;

public class funcionario {
    String nome;
    double salario;

    String setor;

    int matricula;
    public void beneficios() {
        System.out.println("Vale alimentação");
    }
    public void cargaHoraria(int h1, int h2, int m1, int m2) {
        System.out.println("A carga horaria do funcionario é de" + (h1-h2)+(m1-m2));
    }
}
