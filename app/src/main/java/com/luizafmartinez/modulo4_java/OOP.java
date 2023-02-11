/*

1) Programação Linear
=====================

permite ao usuário digitar numero 1
permite ao usuário digitar numero 2

somar numero 1 com numero 2

exibir o resultado da soma


2) Programação Estruturada
===========================

funcao somar
    permite ao usuário digitar numero 1
    permite ao usuário digitar numero 2

    somar numero 1 com numero 2
    exibir o resultado da soma

------------------------------------------

processo 01
funcao somar
processo 02
funcao somar

3) Programação Modular
=======================

Módulo Usuario

    funcao logar
        recebe e-mail e senha
        verifica se o usuário existe
        envia esse usuário a tela principal

    funcao deslogar
        sair do sistema
        vai para tela inicial

--------------------------------------------------

** Tela inicial do sistema
--------------------------
Botão -> logar

** Tela principal do sistema
----------------------------
Botao -> deslogar

** tela de fornecedores
----------------------------
deslogar
logar

3) Programação Orientada a Objetos
===================================

Classe fornecedor, cliente, produto...

Classe Usuario

    funcao logar
        recebe e-mail e senha
        verifica se o usário existe
        envia esse usuário a tela principal

    funcao deslogar
        sair do sistema
        vai para tela inicial

===================================================================

Lower Camel Case
-----------------
jogoMarioKart

Upper Camel Case
-----------------
JogoMarioKart

Snake Case
-----------------
jogo_mario_kart

Kebabe Case
-----------------
jogo-mario-kart

==========================================================================
*/
/*class Jogador {

    String kart;
    String pneu;
    String planador;

    void acelerar() {
        System.out.println("Acelerar: " + pneu );
    }
}*/
package com.luizafmartinez.modulo4_java;

class Funcionario {

    // Atributo
    double salario = 0.0;

    // Método void (Vazio -> Sem Retorno)
    // Método com Retorno
    // Método com Parâmetro
    double calcularSalarioComDesconto(double bonus) {

        double totalComDesconto = salario - 20.0 + bonus;
        return totalComDesconto;
    }
}

class Scratch2 {
    public static void main(String[] args) {

       /* Jogador jamilton = new Jogador();
        jamilton.kart = "Normal";
        jamilton.planador = "paraquedas";
        jamilton.pneu = "cross";

        Jogador computer = new Jogador();
        computer.pneu = "Avançado";

        jamilton.acelerar();
        computer.acelerar();*/
        // Tela de Funcionario
        Funcionario jamilton = new Funcionario();

        jamilton.salario = 1000.0;
        double salarioTotal= jamilton.calcularSalarioComDesconto(80.0);

        System.out.println("Total Salário: " + salarioTotal);

    }
}