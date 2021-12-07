package com.desafiodio.banco.banco;

public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected Double saldo = 0.0;
    protected Cliente cliente;

    private static int SEQUENCIAL= 1;
    private static final int AGENCIA_PADRAO = 1;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(Double valor) {
    this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo  += valor;
    }

    @Override
    public void transferir(IConta contaDestino, Double valor) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}

