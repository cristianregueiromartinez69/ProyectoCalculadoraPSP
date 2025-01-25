package service;

public class MetodosServidor {

    public void elegirOperacion(String [] operacion){
        String operando = operacion[1];

        switch(operando){
            case "+":
        }
    }

    public int sumaNumeros(String [] operacion){
        int suma = 0;
        String operando1 = operacion[0];
        String operando2 = operacion[2];

        suma = Integer.parseInt(operando1) + Integer.parseInt(operando2);
        return suma;
    }
}
