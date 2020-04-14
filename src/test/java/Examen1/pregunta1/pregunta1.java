package Examen1.pregunta1;

import special.pregunta1.Pregunta1;
import org.junit.*;

public class pregunta1 {

    Pregunta1 datos;
    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @Before
    public void before(){
        System.out.println("@Before");
        datos = new Pregunta1("Sergio",24);
    }
    @After
    public void after(){
        System.out.println("@After");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass");
    }

    @Test(expected = ArithmeticException.class)
    public void Testdatos1(){
        int actualResult=datos.getEdad();
        int expectedResult=24;
        System.out.println("Testdatos1");
        Assert.assertEquals("ERROR! el resultado es incorrecto",expectedResult,actualResult);

    }

}
