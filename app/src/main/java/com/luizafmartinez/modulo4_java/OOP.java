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

/*class ContaBancaria {

    ContaBancaria(String conta, String senha){

    }

    void transferencia(){}
    void saque(){}

}*/

class Usuario {

    //Atributos

    String email;
    String senha;

    //Construtor
    // Assinatura de método: nome + parametro e tipo

    Usuario(String email, String senha){

        System.out.println("Autenticação por e-mail e senha");
        /*this.email = email;
        this.senha = senha;*/
    }

    Usuario(String telefone){
        System.out.println("Autenticação por telefone");
    }

    //Método
    void verificarUsuarioLogado(){

    }

}

class Scratch {
    public static void main(String[] args) {

        //Usuario usuario = new Usuario("jamilton@gmail.com", "123454");
        Usuario usuario = new Usuario("11965254545");

        //System.out.println("email: " + usuario.email + " senha: " + usuario.senha);

        /*usuario.email = "jamilton@gmail.com";
        usuario.senha = "123454";

        usuario.verificarUsuarioLogado();*/


        /*CarrinhoCompras carrinho = new CarrinhoCompras();
        double valorFrete = carrinho.calcularValorFrete( "05021-520" );*/

        //Tela de funcionário
       /* Funcionario jamilton = new Funcionario();
        jamilton.salario = 1000;// double bonus = 80
        double salarioTotal = jamilton.calcularSalarioComDesconto( 80 );

        System.out.println("total salario: " + salarioTotal );*/

        /*//Criar Instancia de um Objeto
        Jogador jamilton = new Jogador();
        jamilton.kart = "Normal";
        jamilton.pneu = "cross";
        jamilton.planador = "paraquedas";

        jamilton.acelerar();

        */
        /* Pista *//*
        Jogador computador = new Jogador();
        computador.pneu = "Avançado";

        computador.acelerar();

        String nome = "jamilton";*/


    }
}