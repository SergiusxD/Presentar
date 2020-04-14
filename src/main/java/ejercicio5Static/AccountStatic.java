package ejercicio5Static;


public class AccountStatic {

    public AccountStatic(){

    }

    public String getCash(int idClient, int amount){
        String msg;
        if (DBConnectionStatic.checkDBConnection("mysql")){
            ClientStatic entity=DBTransaccionStatic.QueryDBConvertResultEntity("SELECT * FROM client WHERE id="+idClient);
            if(amount <= entity.amountAvaiable){
                msg=DBTransaccionStatic.updateEntity("UPDATE client SET amount = "+(entity.amountAvaiable-amount)+" WHERE id="+idClient)?
                        "transaccion realizada, saldo actual : "+(entity.amountAvaiable-amount):
                        "no se puedo realizar la transaccion, intentelo mas tarde";
            }
            else{
                msg="transaccion no realizada, la cantidad solicita ["+amount+"] es superior al saldo actual :"+entity.amountAvaiable;

            }
        } else{
            msg= "ERROR! no hay conneccion a la base de datos";
        }
        return msg;
    }

    public static void main(String []args){
        AccountStatic accountManager= new AccountStatic();
        System.out.println(accountManager.getCash(123,100));
    }
}