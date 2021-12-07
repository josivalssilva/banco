package com.desafiodio.banco.banco;

public class Main {
    public static void main (String[] Args){
        Cliente josival = new Cliente();
        josival.setNome("Josival");

        IConta cc = new ContaCorrente(josival);
        IConta poupanca = new ContaPoupanca(josival);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(100.0);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.transferir( poupanca, 50.00);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
