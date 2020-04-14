package Examen1.pregunta3;

import junit.framework.Assert;
import org.junit.Test;
import special.pregunta3.Pregunta3;

import java.io.InvalidClassException;

public class pregunta3 {

    @Test(expected = NullPointerException.class)
    public void pregunta3Test1() throws Exception {
        Pregunta3 id1 = new Pregunta3();
        id1.validateNumber(0);
    }

    @Test(expected = InvalidClassException.class)
    public void pregunta3Test2() throws Exception {
        Pregunta3 id2 = new Pregunta3();
        id2.validateNumber(7);
    }

    @Test(timeout = 2500)
    public void pregunta1Test3(){
        Pregunta3 id = new Pregunta3();
        int expectedResult=16;
        int actualResult=id.getID(4);
        Assert.assertEquals("ERROR!",expectedResult,actualResult);
    }
}