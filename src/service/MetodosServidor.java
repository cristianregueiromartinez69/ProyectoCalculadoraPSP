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
        String operando1 = operacion[0];
        String operando2 = operacion[2];

        return Integer.parseInt(operando1) + Integer.parseInt(operando2);
    }

    public int restaNumeros(String[] operacion) {
        String operando1 = operacion[0];
        String operando2 = operacion[2];

        return Integer.parseInt(operando1) - Integer.parseInt(operando2);
    }

    public int multiplicarNumeros(String[] operacion) {
        String operando1 = operacion[0];
        String operando2 = operacion[2];

        return Integer.parseInt(operando1) * Integer.parseInt(operando2);
    }

    public int dividirNumeros(String[] operacion) {
        String operando1 = operacion[0];
        String operando2 = operacion[2];
        return Integer.parseInt(operando1) / Integer.parseInt(operando2);
    }

}
