package special.pregunta3;
import java.io.InvalidClassException;

public class Pregunta3 {

    public static int getID(int number) {
        try {
            if (number % 2 == 0) {
                Thread.sleep(1000);
            } else {
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * number;
    }

    /**
     * number accepted : pares
     *
     * @param number
     * @return
     */
    public static String validateNumber(int number) throws Exception {
        String msg = "";
        if (number==0)
            throw new NullPointerException("valor es nulo o cero");
        if (number < 0)
            throw new Exception("Numero negativo no es valido");

        if (number % 2 == 0)
            msg = "valor correcto :" + number;
        else
            throw new InvalidClassException("numeros impares son invalidos");

        return msg;
        //abc
    }
 }
