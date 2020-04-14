package special.pregunta_4_5;

public class PreguntaMock {
    Util util=new Util();
    public PreguntaMock(){}

    /**
     * metodo para cambiar Bolivianos a otra moneda
     * @param amount
     * @param typeMoney
     * @return
     */
    public String convertBolivianosToOther(int amount, String typeMoney){
          String msg;
          if (amount > 0){
              // X Bolivianos = 1 Dolars
              int tipoDeCambio = util.getTypeMoney("Bolivianos",typeMoney);
              msg=" tipo de cambio a ["+typeMoney +"] es : "+ amount/tipoDeCambio;
          }else{
              msg ="ERROR ! la cantidad es incorrecta";
          }
          return msg;
    }
}
