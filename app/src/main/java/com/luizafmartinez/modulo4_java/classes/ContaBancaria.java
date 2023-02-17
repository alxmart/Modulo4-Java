package com.luizafmartinez.modulo4_java.classes;

public class ContaBancaria {

    // Atributos
    protected double saldo = 0.0;

    // Métodos

    private void recuperarSaldo() {

    }

    public void sacar() {
        // Recuperar o saldo atual da pessoa
        this.saldo = 100;
        this.recuperarSaldo();
    }

    public void transferir() {
    }

}

