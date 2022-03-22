package br.com.juceduarte;

import br.com.juceduarte.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.setCor("Marrom");
        gato.setIdade(4);
        gato.setNome("Irmão do Jorel");

        System.out.println("Nome: " + gato.getNome() + "\nIdade: " + gato.getIdade() + " anos" +"\nCor: " + gato.getCor());

        Livros livro = new Livros("Meu livro Juce Duarte", 500);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a+b));*/
    }

    static class Livros {
        private String nome;
        private Integer nPaginas;

        public Livros(String nome, Integer nPaginas) {
            this.nome = nome;
            this.nPaginas = nPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getnPaginas() {
            return nPaginas;
        }

        public void setnPaginas(Integer nPaginas) {
            this.nPaginas = nPaginas;
        }

        @Override
        public String toString() {
            return "Livros{" +
                "nome='" + nome + '\'' +
                ", nPaginas=" + nPaginas +
            '}';
        }
    }
}