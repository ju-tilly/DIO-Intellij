package br.com.juceduarte.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        /*
        // Exemplo de uso métodos na prórpia classe - aula do curso dominando IDEs Java

        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Divisão: " + dividir);

    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;

    }

    public static double multiplicar(double a, double b) {
        return a * b;

    }

    public static double dividir(double a, double b) {
        return a / b;

    }
    */
    //-------------------------------------------------------------------------------------
     /*
     Classe principal dos exercícios da aula de Métodos
     */
        System.out.println("Exercício calculadora usando métodos fora da classe principal");
        CalculadoraMetodos.somar(3,6);
        CalculadoraMetodos.subtrair(9,1.8);
        CalculadoraMetodos.multiplicar(7,8);
        CalculadoraMetodos.dividir(5,2);
    }
}