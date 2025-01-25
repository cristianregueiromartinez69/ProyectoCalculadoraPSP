package clienteservidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {

        int puerto = 6666;
        try(ServerSocket serverSocket = new ServerSocket(puerto)){
            System.out.println("Servidor iniciado, esperando a conexiones");
            Socket socket = serverSocket.accept();
            System.out.println("Conexión recibida");

            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

            String [] datosRecibidos = (String [])input.readObject();

            output.writeObject(datosRecibidos);


        }catch(IOException e){
            System.out.println("Ups, error al crear el servidor socket");
        } catch (ClassNotFoundException e) {
            System.out.println("Ups, clase no encontrada");
        }

    }
}