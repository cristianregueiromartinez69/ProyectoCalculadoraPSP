package pruebas;

import service.MetodosCliente;

public class Prueba {

    public static void main(String[] args) {
        String [] datosOperar = new String [3];

        MetodosCliente metodosCliente = new MetodosCliente();
        metodosCliente.operacionParaServidor(datosOperar);

        for(String str : datosOperar) {
            System.out.println(str);
        }
    }

}
