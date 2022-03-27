package br.com.juceduarte.calculadora;
/*
classe de exemplo de uso de métodos
*/

public class CalculadoraMetodos {

    public static void somar(double a, double b) {
        double resultado = a + b;
        System.out.println("A soma de " + a + " + " + b + "\nResultado = " + resultado);
    }

    public static void subtrair(double a, double b) {
        double resultado = a - b;
        System.out.println("A subtração de " + a + " - " + b + "\nResultado = " + resultado);

    }

    public static void multiplicar(double a, double b) {
        double resultado = a * b;
        System.out.println("A multiplicação de " + a + " * " + b + "\nResultado = " + resultado);

    }

    public static void dividir(double a, double b) {
        double resultado = a / b;
        System.out.println("A divisão de " + a + " / " + b + "\nResultado = " + resultado);

    }
}
