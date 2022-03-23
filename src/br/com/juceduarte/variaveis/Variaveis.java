package br.com.juceduarte.variaveis;

/* Classe de exemplo para o exercício da Aula 1 sobre Variáveis, Tipos de dado e Operadores aritméticos. */

public class Variaveis {
    public static void main(String[] args) {

        int i;
        //int i;
        int I;
        //int 1a; erro de compilação
        int _1a; //não é uma boa prática
        int $aq; //não é uma boa prática

        //sempre inicializar as variáveis declaradas
        i=5;
        I=10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //variável constante (final)
        //j = 15; //definida anteriormente como constante não posso mudar seu valor
        int asrm12367md;
        //int asrm246 78md; //erro de compilação, espaço entre o nome da variável
        int asrn2$456987_md;
        //int asrn2$4569%87_md = 10; //erro de compilação, caractere inválido no nome (%)

        asrm12367md = 100;
        asrn2$456987_md = 10;

        //expressividade no nome da variável
        int quantidadeProduto = 50;
        //int QuantidadeProduto; //não segue boa prática
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; //não segue boas práticas
        int QUANTIDADE_OPCOES = 25; //não segue boas práticas, declarada como int e nome como final
        //int qtdProd; //sem expressividade no nome

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrm12367md);
        System.out.println(asrn2$456987_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
