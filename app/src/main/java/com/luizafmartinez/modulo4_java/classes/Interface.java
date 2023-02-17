/*
abstract class Pessoa {

    int idade;
    String nome;

    void comer(){
        System.out.println("Comer");
    }

    //abstract void respirar();
    //abstract void candidatarSeCargoPolitico();
}
//===================================================================

interface Presidente {
    void candidatarSeCargoPolitico();
}
//===================================================================

class DesenvolvedorAndroid extends Pessoa {

    void Programar() { }

}
//====================================================================

class DesenvolvedorWeb extends Pessoa {

}
//====================================================================

class Jornalista extends Pessoa implements Presidente {

    void escreverNoticia() {   }

    @Override
    public void candidatarSeCargoPolitico() {
        System.out.println("Candidatar-se a cargo político");
    }
}
//===================================================================

class Endereco {
    String rua;

}
//=====================================================================

class Usuario {

    void finalizarCompra(Endereco endereco) {
        System.out.println("Antes: " + endereco.rua);
        endereco.rua = "Rua 02"; // Muda apenas aqui dentro do método
    }

}

//===================================================================

class Scratch {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.rua = "Rua 01";

        Usuario usuario = new Usuario();
        usuario.finalizarCompra(endereco); // objeto endereco
        endereco.rua = "Rua 03";
        System.out.println("Depois: " + endereco.rua);


//        DesenvolvedorAndroid devAndroid = new DesenvolvedorAndroid();
//        //devAndroid.candidatarSeCargoPolitico();
//
//        Jornalista jornalista = new Jornalista();
//        jornalista.candidatarSeCargoPolitico();

    }
}*/
