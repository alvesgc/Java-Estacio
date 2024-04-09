package POO;

public class Funcionario {
    // Atributos e Métodos
    private float saldo = 10;

    public void setDepostio(float deposito) {
        saldo+= deposito;
    }
    public void setSaque(float saque){
        saque-= saque;
    }
    public void ola(String nome) { // Método vem de Função
        System.out.println("Funcionario criado");
    }
    public void salario(float salario, String nome) {
        System.out.println("O sálario de " +nome+ "é : " + salario);
    }
}


/*
* Abstração
* Polimorfismo
* Herança
* Encapsulamento - Ok
*       MODIFICADORES DE ACESSO.
*  1) Public - Não tem restriçoes de acesso no projeto.
*  2) Protect - Fica restrito somente a package.
*  3) Private - Fica resrtito somente a classe.
* */