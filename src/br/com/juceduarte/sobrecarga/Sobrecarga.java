package br.com.juceduarte.sobrecarga;

//Exercício para criar uma aplicação que calcula a área dos 3 quadriláteros
//notáveis: quadrado, retângulo e trapézio.
//Usando Sobrecarga

public class Sobrecarga {
    public static void main(String[] args) {

        //quadrilátero
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f ,5f);
    }
}
