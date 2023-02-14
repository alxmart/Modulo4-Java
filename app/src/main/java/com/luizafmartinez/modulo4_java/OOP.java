/*

1) Programação Linear

permite ao usuário digitar numero 1
permite ao usuário digitar numero 2

somar numero 1 com numero 2

exibir o resultado da soma


2) Programação Estruturada

funcao somar
    permite ao usuário digitar numero 1
    permite ao usuário digitar numero 2

    somar numero 1 com numero 2
    exibir o resultado da soma


processo 01
funcao somar
processo 02
funcao somar


3) Programação Modular

Módulo Usuario
    funcao logar
        recebe e-mail e senha
        verifica se o usário existe
        envia esse usuário a tela principal

    funcao deslogar
        sair do sistema
        vai para tela inicial

** Tela inicial do sistema
Botão -> logar


** Tela principal do sistema
botao -> deslogar


** tela de fornecedores
deslogar
logar

3) Programação Orienta a objetos
Classe fornecedor, cliente, produto...
Classe Usuario
    funcao logar
        recebe e-mail e senha
        verifica se o usário existe
        envia esse usuário a tela principal

    funcao deslogar
        sair do sistema
        vai para tela inicial

Lower Camel Case
jogoMarioKart

Upper Camel Case
JogoMarioKart

Snake Case
jogo_mario_kart

Kebabe Case
jogo-mario-kart


* */
/*class Jogador {//Modelo utilizar Upper Camel Case

    //Atributos (utilizam Lower Camel Case)
    String kart;
    String pneu;
    String planador;

    //Métodos (ações)
    void acelerar(){
        System.out.println("Acelerar: " + pneu );
    }

}*/

/*class Funcionario {

    // Atributo
    double salario = 0;

    //Método void (vazio -> Método sem retorno)
    // Método com retorno
    // Método com parâmetro
    double calcularSalarioComDesconto( double bonus ){

        */
/*
        1000 até 2000 (8%)
        2000 até 3000 (9%)
        ...
        * */
/*
        double totalComDesconto = salario - 20 + bonus;

        return totalComDesconto;
        //System.out.println("Total com desconto: " + totalComDesconto);

    }






}*/
/*class CarrinhoCompras {


    double calcularValorFrete( String cep ){

        //Calculo do frete
        return 20;

    }

}*/

/*
class ContaBancaria {

    ContaBancaria(String conta, String senha){

    }

    void transferencia(){}
    void saque(){}

}*/



class Usuario {

    // Atributos:
    String email;
    String senha;

    // Construtor:
    Usuario(String email, String senha) {
        System.out.println("Construtor Chamado");
        this.email = email;
        this.senha = senha;
    }

    // Método:
    void verificarUsuarioLogado() {
    }
}

class Scratch {
    public static void main(String[] args) {

        Usuario usuario = new Usuario
                ("homer@springfield.com","GoToMoes");

        System.out.println("Email: " + usuario.email +
                " \nSenha: " + usuario.senha);

//    usuario.email = "homer@springfield.com";
//    usuario.senha = "GoToMoes";
        usuario.verificarUsuarioLogado();
    }

}