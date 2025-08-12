package calculator;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 */
public class Calculator {

    /**
     * Soma dois números.
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtrai dois números.
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da subtração
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da multiplicação
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divide dois números.
     * @param a numerador
     * @param b denominador
     * @return resultado da divisão
     * @throws ArithmeticException se divisão por zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
