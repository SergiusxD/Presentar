package special.pregunta2;

public class Pregunta2 {

    /**
     * Este metodo define si una persona con una edad recibe un bono o no
     * @param edad
     * @return
     */
    public static String getBono(int edad){
        String msg;
        if (edad < 0){
            msg="EDAD NO EXISTE";
        } else if (edad >= 0 && edad <55){
            msg="NO RECIBE BONO";
        } else if (edad>= 55 && edad <=65 ){
            msg="RECIBE BONO, EDAD : "+edad;
        } else {
            msg="NO RECIBE BONO, TIENE RENTA";
        }
        return msg;
    }

}
