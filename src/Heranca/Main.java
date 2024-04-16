package Heranca;

public class Main {
    public static void main (String[] args) {
        gerente ge = new gerente();
        ge.nome = "Jose";
        ge.salario = 10000;
        ge.bonus = 4000;
        ge.matricula = 123456;
        ge.setor = "Gerencia";
        ge.beneficios();

        System.out.println("__________________________");
        System.out.println(ge.nome + ", sua remuneração é de: "+(ge.salario+ge.bonus));
        System.out.println("Sua matrícula é: "+ge.matricula+" e você trabalha no setor: "+ge.setor);
        System.out.println("__________________________");
        ge.cargaHoraria(8, 30,17,30);
    }
}


/* CLASSE PAI -> HERDAR: MÉTODOS E ATRIBUTOS A CLASSE FILHO
 *  CLASSE PAI -> Super.
 *  HERANÇA MÚLTIPLA - NÃO EXISTE E NÃO É BOA PRÁTICA.
 *  INTERFACE NO LIGAR DE HERANÇA MÚLTIPLA
 * */