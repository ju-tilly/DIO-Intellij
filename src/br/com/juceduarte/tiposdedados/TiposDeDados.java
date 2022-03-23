package br.com.juceduarte.tiposdedados;

public class TiposDeDados {
    public static void main(String[] args) {
        //tipos de dados
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; //tamanho do short ultrapassou seu valor limite

        //int i1 = -10000000000; //tamanho do short ultrapassou seu valor limite para negativo
        int i2 = 28500;

        long l1 = 1000000000000000000L; //identificar números longos com L
        long l2 = 2004005000500055000L;

        //float f1 = 4.5; //é identificado como double, não compila
        float f2 = 4.5F;

        double d1 = 85.69;
        double d2 = 99.84D;

        char c1 = 'W';
        //char c2 = 'Tw'; //char é um caractere, não compila
        char c3 = '\u0057'; //código unicode de um caractere

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgd ses  er  KDJKSLJLKJ 345098)(&*((";

        String dt1 = "09/02/1988"; //não é boa prática, existe outro tipo para datas

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
