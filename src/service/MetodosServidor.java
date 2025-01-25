package service;

public class MetodosServidor {

    public String [] devolverResultado(String [] operacion, int resultado){
        String resultadoString = String.valueOf(resultado);
        return new String[]{operacion[0],operacion[1],operacion[2], resultadoString};
    }

    public int elegirOperacion(String[] operacion) {
        String operando = operacion[1];
        return switch (operando) {
            case "+" -> sumaNumeros(operacion);
            case "-" -> restaNumeros(operacion);
            case "*" -> multiplicarNumeros(operacion);
            case "/" -> dividirNumeros(operacion);
            default -> 0;
        };
    }

    public int sumaNumeros(String[] operacion) {
        int suma = 0;
        String operando1 = operacion[0];
        String operando2 = operacion[2];

        suma = Integer.parseInt(operando1) + Integer.parseInt(operando2);
        return suma;
    }

    public int restaNumeros(String[] operacion) {
        int resta = 0;
        String operando1 = operacion[0];
        String operando2 = operacion[2];

        resta = Integer.parseInt(operando1) - Integer.parseInt(operando2);
        return resta;
    }

    public int multiplicarNumeros(String[] operacion) {
        int multiplicacion = 0;
        String operando1 = operacion[0];
        String operando2 = operacion[2];

        multiplicacion = Integer.parseInt(operando1) * Integer.parseInt(operando2);
        return multiplicacion;
    }

    public int dividirNumeros(String[] operacion) {
        int dividir = 0;
        String operando1 = operacion[0];
        String operando2 = operacion[2];
        dividir = Integer.parseInt(operando1) / Integer.parseInt(operando2);
        return dividir;
    }

}
