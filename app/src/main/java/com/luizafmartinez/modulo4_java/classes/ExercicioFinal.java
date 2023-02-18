/*
abstract class Veiculo {

    String nome;
    int qtdRodas;

    public Veiculo() {
    }

    public Veiculo(String nome, int qtdRodas) {
        this.nome = nome;
        this.qtdRodas = qtdRodas;
    }

    abstract void acelerar();
}

//=======================================================================

interface Eletrificado {

    void motorEletrico();
}

//=======================================================================

class Carro extends Veiculo {

    public Carro() {
    }

    public Carro(String nome, int qtdRodas) {
        super(nome, qtdRodas);
    }

    @Override
    void acelerar() {
        System.out.println("Acelerar " + nome + " com " + qtdRodas +
                " rodas.");
    }

    public void acelerar(int intensidade) {
        System.out.println("\nAcelerar " + nome + " com " + qtdRodas +
                " rodas.");
        System.out.println("Intensidade da aceleração: " + intensidade);
    }
}

//=======================================================================

class Moto extends Veiculo implements Eletrificado {

    public Moto() {
    }

    public Moto(String nome, int qtdRodas) {
        super(nome, qtdRodas);
    }

    @Override
    void acelerar() {
        System.out.println("\nAcelerar " + nome + " com " + qtdRodas +
                " rodas.");
        motorEletrico();
    }

    public void acelerar(int intensidade) {
        System.out.println("\nAcelerar " + nome + " com " + qtdRodas +
                " rodas.");
        motorEletrico();
        System.out.println("Intensidade da aceleração: " + intensidade);
    }

    @Override
    public void motorEletrico() {
        System.out.println("Rodando com motor elétrico.");
    }
}

class Scratch {
    public static void main(String[] args) {

        Carro carro = new Carro("Hummer H1", 4);
        //carro.acelerar();
        carro.acelerar(4);

        Moto moto = new Moto("Harley Davidson ", 2);
        //moto.acelerar();
        moto.acelerar(4);

    }
}*/
