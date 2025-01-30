package service;

import java.util.Scanner;

public class MetodosCliente {

    public void mensajeRecibidoServidor(String [] resultado){
        System.out.println("El resultado es " + resultado[3]);
    }

    public void operacionParaServidor(String[] operacion){

        System.out.println("Introdudce el primer número de la operación: ");
        Scanner sc = new Scanner(System.in);
        String numero1 = sc.nextLine();

        while(!comprobarDigitos(numero1)){
            System.out.println("Número incorrecto, por favor, introduce un número válido: ");
            numero1 = sc.nextLine();
        }

        System.out.println("Introduce una operación: ");
        String auxOperacion = sc.nextLine();

        while(!comprobarOperacion(auxOperacion)){
            System.out.println("Operación incorrecta, por favor, introduce una operación válida: ");
            auxOperacion = sc.nextLine();
        }

        System.out.println("Introduce el segundo número de la operación: ");
        String numero2 = sc.nextLine();

        while(!comprobarDigitos(numero2)){
            System.out.println("Número incorrecto, por favor, introduce un número válido: ");
            numero2 = sc.nextLine();
        }

        operacion[0] = numero1;
        operacion[1] = auxOperacion;
        operacion[2] = numero2;

    }

    public boolean comprobarDigitos(String numero){
        for(char c : numero.toCharArray()){
            if(Character.isDigit(c)){
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
