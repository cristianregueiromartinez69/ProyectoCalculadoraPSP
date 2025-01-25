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


            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            metodosCliente.operacionParaServidor(datosOperar);

            output.writeObject(datosOperar);

            String [] datosRecibidos = (String[]) input.readObject();

            for(String str : datosRecibidos){
                System.out.println(str);
            }

        }catch(IOException e){
            System.out.println("Ups, error al conectarse al socket del servidor");
        } catch (ClassNotFoundException e) {
            System.out.println("Ups, clase no encontrada");
        }

    }
}
