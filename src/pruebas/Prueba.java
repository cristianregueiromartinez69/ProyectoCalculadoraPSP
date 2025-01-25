package pruebas;

import service.MetodosCliente;
import service.MetodosServidor;

public class Prueba {

    public static void main(String[] args) {
        MetodosServidor metodosServidor = new MetodosServidor();
        String[] operacion = {"100", "-", "-20"};
        String[] mensajeDevuelto = metodosServidor.devolverResultado(operacion, metodosServidor.elegirOperacion(operacion));

        for(String str : mensajeDevuelto) {
            System.out.println(str);
        }

    }

}
