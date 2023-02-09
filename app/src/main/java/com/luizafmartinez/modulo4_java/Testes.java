package com.luizafmartinez.modulo4_java;
class Scratch {
    public static void main(String[] args) {

        /*
        // Entrada
        String nome;

        //Processamento
        Integer idade = 35;
        nome = "Jamilton Damasceno";
        final Double PI = 3.14;
        final Integer QUANTIDADE_PESSOAS_COMPRA = 2000;

        idade = 20;
        // Operação 1 QUANTIDADE_PESSOAS_COMPRA
        //Operação 2 QUANTIDADE_PESSOAS_COMPRA
        */
        /*
        // tipos primitivos
        byte idade = 52;
        int numeroCasa = 360;
        float preco = 34.96f;
        double total = 456.9867;
        boolean visivel = false;// true(verdadeiro) false (falso)
        char caractere = 'M';

        // classes wrapper
        Byte idadeC = 52;
        Integer numeroCasaC = 360;
        Double totalC = 456.9867;
        String nome = "jamilton damasceno";
        */
        /*
        //String numero = 10 + " jamilton";
        int n1 = 10;
        int n2 = 2;

        int numero = n1 / n2;
        //int numero = (1 + 2) * 2;
        */

        // = Recebe , == Igual a
        // Testes lógicos (Verdade) ou (falso)
        //boolean retorno = 2 == 1;// Verdade
        //int idade = 15;
        //boolean retorno = 11 <= 10;//==, !=, >, <, >=, <=

        /*
         * Promoção 1 Mercado Livre
         * compras >= 300  OU idade >= 50
         * (30%) DESCONTO
         *
         * Promoção 2 Mercado Livre
         * compras >= 300  E idade >= 50
         * (30%) DESCONTO
         * */
        /*double compras = 50;
        byte idade = 55;
        boolean resultado = compras >= 300 || idade >= 50;
        System.out.println("resultado:" + resultado );
        if ( resultado ){// se
            System.out.println("DESCONTO DE 30%");
        }else {// Senão
            System.out.println("não tem desconto");
        }
         */
        /*
        int numero1 = 20;
        int numero2 = 10;

        if( numero1 > numero2 ){
            System.out.println("Número 1 é o maior");
        }else{
            System.out.println("Número 2 é o maior");
        }
         */
        /*
        < 200 - não tem desconto
        201 e 400 - 20%
        401 e 800 - 30%
        > 801 - 40%
        *
        double compras = 900;

        if( compras <= 200 ){
            System.out.println("Não tem desconto");
        }else if( compras >= 201 && compras <= 400 ){
            System.out.println("desconto de 20%");
        }else if( compras >= 401 && compras <= 800 ){
            System.out.println("desconto de 30%");
        }else if( compras >= 801 ){
            System.out.println("desconto de 40%");
        }*/
        /*int idade = 12;
        double compras = 100;
        //String texto = idade >= 18 ? "Maior idade" : "Menor idade";
        double desconto = compras >= 200 ? 20 : 0 ;
        System.out.println("resultado: " + desconto );*/
        /*if( idade >= 18 ){
            System.out.println("Maior idade" );
        }else {
            System.out.println("Menor idade: ");
        }*/
        /*int opcao = 3;
        switch ( opcao ){
            case 1 :
                System.out.println("Saldo atual");
                break;
            case 2 :
                System.out.println("Extrato");
                break;
            case 3 :
                System.out.println("cartões de crédito");
                break;
            default:
                System.out.println("Nenhuma opção selecionada");
        }*/

        /*String nome = "Jamilton";
        String[] nomes = {"Jamilton", "Maria", "Ana", "Pedro"};//0
        int[] numeros = {200, 500, 800, 1000};*/
        //String[] joao = {"João", "25"};
        /*String[][] conversas = {
                {"João", "Olá, tudo bem?"},//0
                {"Maria", "Tudo certo"},//1
                {"Pedro", "Não vi"},//2
        };*/
        /*
           0       1
        0  João    Olá, tudo bem?
        1  Maria   Tudo certo
        2  Pedro   Não vi

        * */

        //Loops
        //int numero = 10;
        //numero = numero / 2;
        //numero /= 2;
        //numero--;
        //numero--;

        /*int numero = 1;
        while( numero <= 5 ){//Verdade
            System.out.println("número: " + numero );
            numero++;//
        }*/
        String[] postagens = {
                "Fui a praia...",//0
                "Fazendo trilha",//1
                "Viagem para Nordeste",//2
                "Estudando Java e Kotlin"//3
        };

        int numero = 0;
        while( numero <= 3 ){
            System.out.println( " - " + postagens[numero] );
            System.out.println("-------------");
            numero++;
        }

    }
}