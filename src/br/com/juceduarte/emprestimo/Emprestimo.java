package br.com.juceduarte.emprestimo;

public class Emprestimo {
    public static void main(String[] args) {

        System.out.println("Exercicio empréstimo");
        MetodoEmprestimo.calcular(1000,MetodoEmprestimo.getDuasParcelas()); //chamando método dentro do parâmetro
        MetodoEmprestimo.calcular(1000,MetodoEmprestimo.getTresParcelas());
        MetodoEmprestimo.calcular(1000,1);
    }
}
