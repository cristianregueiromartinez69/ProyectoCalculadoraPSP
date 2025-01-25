package pruebas;

import service.MetodosCliente;
import service.MetodosServidor;

public class Prueba {

    public static void main(String[] args) {
        MetodosServidor metodosServidor = new MetodosServidor();
        String [] operacion = {"2", "+", "3"};
        metodosServidor.elegirOperacion(operacion);
    }

}
