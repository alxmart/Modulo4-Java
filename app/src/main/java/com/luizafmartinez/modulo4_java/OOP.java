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
class Jogador {

    String kart;
    String pneu;
    String planador;

    void acelerar() {
        System.out.println("Acelerar: " + pneu );
    }
}

class Scratch {
    public static void main(String[] args) {

        Jogador homer = new Jogador();
        homer.kart = "Normal";
        homer.planador = "paraquedas";
        homer.pneu = "cross";

        Jogador computer = new Jogador();
        computer.pneu = "Avançado";

        homer.acelerar();
        computer.acelerar();
    }
}
