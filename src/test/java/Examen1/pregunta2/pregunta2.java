package Examen1.pregunta2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import special.pregunta2.Pregunta2;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class pregunta2 {
    private int parameter1;
    private String expectedResult;

    public pregunta2(int parameter1, String expectedResult) {
        this.parameter1 = parameter1;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{-10, "EDAD NO EXISTE"});
        objects.add(new Object[]{-5, "EDAD NO EXISTE"});
        objects.add(new Object[]{0, "NO RECIBE BONO"});
        objects.add(new Object[]{35, "NO RECIBE BONO"});
        objects.add(new Object[]{40, "NO RECIBE BONO"});
        objects.add(new Object[]{55, "RECIBE BONO, EDAD : 55"});
        objects.add(new Object[]{60, "RECIBE BONO, EDAD : 60"});
        objects.add(new Object[]{70, "NO RECIBE BONO, TIENE RENTA"});
        objects.add(new Object[]{85, "NO RECIBE BONO, TIENE RENTA"});
        return objects;
    }

    @Test
    public void titleTestParameter() {
        Pregunta2 otro = new Pregunta2();
        String actualResult=otro.getBono(this.parameter1);
        System.out.println("pregunta2Parametrizado");
        Assert.assertEquals("ERROR! el resultado es incorrecto",this.expectedResult,actualResult);

    }
}
