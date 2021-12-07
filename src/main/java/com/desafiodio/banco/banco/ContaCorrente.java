package com.desafiodio.banco.banco;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente:====> ");
        super.imprimirInfosComuns();
    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
}
