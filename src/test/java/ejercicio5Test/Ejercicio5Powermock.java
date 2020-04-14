package ejercicio5Test;

import ejercicio5Static.AccountStatic;
import ejercicio5Static.ClientStatic;
import ejercicio5Static.DBConnectionStatic;
import ejercicio5Static.DBTransaccionStatic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DBConnectionStatic.class, DBTransaccionStatic.class})
public class Ejercicio5Powermock {
    @Test
    public void testing(){
        PowerMockito.mockStatic(DBConnectionStatic.class);
        PowerMockito.mockStatic(DBTransaccionStatic.class);
        Mockito.when(DBConnectionStatic.checkDBConnection("mysql")).thenReturn(true);
        Mockito.when(DBTransaccionStatic.QueryDBConvertResultEntity("SELECT * FROM client WHERE id=9")).thenReturn(new ClientStatic(9,"TEST",1000));
        Mockito.when(DBTransaccionStatic.updateEntity("UPDATE client SET amount = 600 WHERE id=9")).thenReturn(true);

        AccountStatic account = new AccountStatic();
        String expectedResult="transaccion realizada, saldo actual : 600";
        String actualResult=account.getCash(9,400);
        Assert.assertEquals("ERROR",expectedResult,actualResult);
    }
}