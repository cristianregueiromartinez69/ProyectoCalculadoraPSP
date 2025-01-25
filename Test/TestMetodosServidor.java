import org.junit.Assert;
import org.junit.Test;
import service.MetodosServidor;

public class TestMetodosServidor {

    MetodosServidor metodosServidor = new MetodosServidor();

    @Test
    public void testSumaServidor(){

        String[] operacion1 = {"5", "+", "3"};
        int resultado1 = metodosServidor.sumaNumeros(operacion1);
        Assert.assertEquals(8, resultado1);

        String[] operacion2 = {"-2", "+", "-4"};
        int resultado2 = metodosServidor.sumaNumeros(operacion2);
        Assert.assertEquals(-6, resultado2);

        String[] operacion3 = {"0", "+", "7"};
        int resultado3 = metodosServidor.sumaNumeros(operacion3);
        Assert.assertEquals(7, resultado3);

        String[] operacion4 = {"1000", "+", "2000"};
        int resultado4 = metodosServidor.sumaNumeros(operacion4);
        Assert.assertEquals(3000 , resultado4);
    }

    @Test
    public void testRestaServidor(){

        String[] operacion1 = {"5", "-", "3"};
        int resultado1 = metodosServidor.restaNumeros(operacion1);
        Assert.assertEquals(2, resultado1);

        String[] operacion2 = {"-2", "-", "-4"};
        int resultado2 = metodosServidor.restaNumeros(operacion2);
        Assert.assertEquals(2, resultado2);

        String[] operacion3 = {"0", "-", "7"};
        int resultado3 = metodosServidor.restaNumeros(operacion3);
        Assert.assertEquals(-7, resultado3);

        String[] operacion4 = {"2000", "-", "1732"};
        int resultado4 = metodosServidor.restaNumeros(operacion4);
        Assert.assertEquals(268 , resultado4);
    }

    @Test
    public void testDivisionServidor(){

        String[] operacion1 = {"5", "/", "3"};
        int resultado1 = metodosServidor.dividirNumeros(operacion1);
        Assert.assertEquals(1, resultado1);

        String[] operacion2 = {"10", "/", "2"};
        int resultado2 = metodosServidor.dividirNumeros(operacion2);
        Assert.assertEquals(5, resultado2);

    }

    @Test
    public void testMultiplicacionServidor(){

        String[] operacion1 = {"5", "*", "3"};
        int resultado1 = metodosServidor.multiplicarNumeros(operacion1);
        Assert.assertEquals(15, resultado1);

        String[] operacion2 = {"20", "*", "50"};
        int resultado2 = metodosServidor.multiplicarNumeros(operacion2);
        Assert.assertEquals(1000, resultado2);

        String[] operacion3 = {"0", "*", "7"};
        int resultado3 = metodosServidor.multiplicarNumeros(operacion3);
        Assert.assertEquals(0, resultado3);

    }
}
