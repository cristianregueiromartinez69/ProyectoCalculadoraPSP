import org.junit.Assert;
import org.junit.Test;
import service.MetodosCliente;

public class TestMetodosCliente {

    MetodosCliente mCliente = new MetodosCliente();

    @Test
    public void testComprobarDigitos() {


        Assert.assertTrue(mCliente.comprobarDigitos("4"));
        Assert.assertTrue(mCliente.comprobarDigitos("412367"));

        Assert.assertFalse(mCliente.comprobarDigitos("g"));

    }

    @Test
    public void testComprobarOperaciones(){
        Assert.assertTrue(mCliente.comprobarOperacion("*"));
        Assert.assertFalse(mCliente.comprobarOperacion("g"));
    }


}
