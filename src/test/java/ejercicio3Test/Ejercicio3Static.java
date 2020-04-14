package ejercicio3Test;
import ejercicio3static.Nota2;
import ejercicio3static.ValidatorStatic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ValidatorStatic.class)
public class Ejercicio3Static {

    @Test
    public void testing(){
        PowerMockito.mockStatic(ValidatorStatic.class);
        Mockito.when(ValidatorStatic.isValid(80,1, 100)).thenReturn(true);
        Mockito.when(ValidatorStatic.isValid(96,1, 100)).thenReturn(true);
        Mockito.when(ValidatorStatic.isValid(100,1, 100)).thenReturn(true);
        Nota2 nota = new Nota2();
        String expectedResult= "Bueno 80";
        String actualResult=nota.reconocimiento(80);
        Assert.assertEquals("ERROR en factorial",expectedResult,actualResult);
        String expectedResult1= "Muy Bueno 96";
        String actualResult1=nota.reconocimiento(96);
        Assert.assertEquals("ERROR en factorial",expectedResult1,actualResult1);
        String expectedResult2= "Excelente 100";
        String actualResult2=nota.reconocimiento(100);
        Assert.assertEquals("ERROR en factorial",expectedResult2,actualResult2);
    }
}