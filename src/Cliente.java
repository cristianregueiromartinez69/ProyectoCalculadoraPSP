import java.io.*;
import java.net.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Cliente {

    public static void main(String[] args) {

        int puerto = 6666;
        String [] datosOperar = new String [2];

        try(Socket socket = new Socket("localhost", puerto)){

            System.out.println("Conexion establecida con el servidor");

            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());



        }catch(IOException e){
            System.out.println("Ups, error al conectarse al socket del servidor");
        }

    }
}
