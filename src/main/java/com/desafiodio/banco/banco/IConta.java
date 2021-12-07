package com.desafiodio.banco.banco;

public interface IConta {

    public void sacar (Double valor);

    public void depositar (Double valor);

    public void transferir (IConta contaDestino, Double valor);

    public  void imprimirExtrato();
}
