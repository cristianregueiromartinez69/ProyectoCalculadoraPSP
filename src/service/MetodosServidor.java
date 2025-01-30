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
            case "%" -> porcentajeNumeros(operacion);
            case "^" -> potenciaNumeros(operacion);
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

        try{
            return Integer.parseInt(operando1) / Integer.parseInt(operando2);
        }catch(ArithmeticException e){
            return 0;
        }
    }

    public int porcentajeNumeros(String[] operacion) {
        String operando1 = operacion[0];
        String operando2 = operacion[2];
        float resultado = (Float.parseFloat(operando1) / 100) * Float.parseFloat(operando2);
        return (int) resultado;
    }


    public int potenciaNumeros(String[] operacion) {
        String operando1 = operacion[0];
        String operando2 = operacion[2];

        float resultado = (float) Math.pow(Float.parseFloat(operando1), Float.parseFloat(operando2));
        return (int) resultado;
    }

}
