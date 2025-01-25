package clienteservidor;

import service.MetodosCliente;

import java.io.*;
import java.net.*;

public class Cliente {

    public static void main(String[] args) {

        int puerto = 6666;
        String [] datosOperar = new String [3];
        MetodosCliente metodosCliente = new MetodosCliente();

        try(Socket socket = new Socket("localhost", puerto)){

            System.out.println("Conexion establecida con el servidor");

            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

            metodosCliente.operacionParaServidor(datosOperar);

            output.writeObject(datosOperar);


        }catch(IOException e){
            System.out.println("Ups, error al conectarse al socket del servidor");
        }

    }
}
