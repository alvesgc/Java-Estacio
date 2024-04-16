package Heranca;

import static java.lang.Math.abs;

public class gerente extends funcionario{
    double bonus;
    /* OVERRIDE - SOBRESCRITA
     Pega um metodo de uma classe pai e
     alteramos os atributos dentro da classe filho */

    @Override
    public void cargaHoraria(int h1, int h2, int m1, int m2) {
        //super.cargaHoraria(h1, h2, m1, m2);
        int minuto = abs(m2%m1);
        int hora = abs(h2-h1);

        if(m1>m2) {
            hora--;
        }
        if(hora<=8) {
            System.out.println("Carga horaria não corresponde a função.");
        }else{
            System.out.println("Gerente sua carga horaria de trabalho foi de: "+hora+":" +(minuto>10 ? minuto : "0" + minuto));
        }
    }

    /*OVERLOAD - SOBRECARGA DE MÉTODOS
    *() => Parametros
    * Utilizo o mesmo nome para
    * metodos porem tenho parametros
    * diferentes para cada um deles.
    *
    * */
    public void trabalho(){

    }
    public void trabalho(int x){

    }
    public void trabalho(int x, int y){

    }
    public void trabalho(double c){

    }
}
