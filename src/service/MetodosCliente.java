package service;

import java.util.Scanner;

public class MetodosCliente {

    public void operacionParaServidor(String[] operacion){

        System.out.println("Introdudce el primer número de la operación: ");
        Scanner sc = new Scanner(System.in);
        String numero1 = sc.nextLine();

        while(comprobarDigitos(numero1)){
            System.out.println("Número incorrecto, por favor, introduce un número válido: ");
            numero1 = sc.nextLine();
        }

        System.out.println("Introduce una operación: ");
        String auxOperacion = sc.nextLine();

    }

    public boolean comprobarDigitos(String numero){
        String [] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (String s : numeros) {
            if (s.equals(numero)) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarOperacion(String operacion){
        String [] operaciones = {"+", "-", "/", "*"};
        for (String s : operaciones) {
            if (s.equals(operacion)) {
                return true;
            }
        }
        return false;
    }

}
