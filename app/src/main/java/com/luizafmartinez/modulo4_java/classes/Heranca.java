/*

abstract class Animal { // Classe Pai  =>  SUPER Classe, Abstrata

    String cor;
    int tamanho;
    int quantidadePatas;
    double peso;

    public Animal() {
    }

    public Animal(String cor, int tamanho, int qtdPatas, double peso) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidadePatas = qtdPatas;
        this.peso = peso;
    }

    void correr() {
        System.out.println("Correr como um ");
    }

    void dormir() {
        System.out.println("Dormir");
    }
}

// DRY - Don't repeat yourself

//========================================================================

// Classe Filha ou SUBclasse

class Cachorro extends Animal {

    // Atributos específicos para o cachorro

    // Construtor
    public Cachorro() {
    }

    public Cachorro(String cor, int tamanho, int qtdPatas, double peso) {
        super(cor,tamanho,qtdPatas,peso);
    }

    void latir() {
        System.out.println("Latir");
    }

    void latir(String pessoa) {
        System.out.println("Latir para " + pessoa);
    }

    // Sobrescrita de método => Sobreposição

    @Override   // Sobrescrito da classe pai
    void correr() {
        super.correr();
        System.out.println("cachorro com patas: " + this.quantidadePatas);
    }
}
//========================================================================

// Classe Filha ou SUBclasse

class Passaro extends Animal {

    public Passaro() {
    }

    public Passaro(String cor, int tamanho, int qtdPatas, double peso) {
        super(cor,tamanho,qtdPatas,peso);
    }

    void voar() {
        System.out.println("Voar");
    }

    @Override
    void correr() {
        super.correr();
        System.out.println("pássaro utilizando as asas e com patas: " +
                this.quantidadePatas);
    }
}

//=========================================================================

class Scratch {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro(
                "Marrom",8,4,1.5
        );
        cachorro.correr();

        Passaro passaro = new Passaro(
                "Azul",3,2,0.5
        );
        passaro.correr();


//        cachorro.quantidadePatas = 4;
//        cachorro.correr();

//        System.out.println("-----------------------------------");
////
//        Passaro passaro = new Passaro();
//        passaro.quantidadePatas = 2;
//        passaro.correr();

    }
}*/
