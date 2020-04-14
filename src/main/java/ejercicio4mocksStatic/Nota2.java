package ejercicio4mocksStatic;

import ejercicio3static.ValidatorStatic;


public class Nota2 {

    public Nota2(){

    }

    public String reconocimiento(int nota){
        String msg="Regular Rendimiento";
        if (ValidatorUtilStatic.isValid(nota,1,100)){

            if (nota >= 80 && nota < 90){
             msg="Bueno ";
            }
            if (nota >= 90 && nota < 100){
                msg="Muy Bueno ";
            }
            if (nota == 100){
                msg="Excelente ";
            }

        }
        return msg + nota;
    }
}
