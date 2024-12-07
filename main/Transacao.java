package com.mycompany.banco;

public class Transacao {

    private ContaCorrente conta;
    private String tipoTransacao;
    private double valor;

    public Transacao(ContaCorrente conta, String tipoTransacao, double valor) {
        this.conta = conta;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
    }

    public ContaCorrente getConta() {
        return this.conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public String getTipoTransacao() {
        return this.tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void realizarTransacao(String tipoTransacao, double valor) {
        switch (tipoTransacao.toLowerCase()) {
            case "depositar" -> {
                conta.depositar(valor);
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            }

            case "sacar" -> {
                if (conta.getSaldo() >= valor) {
                    conta.sacar(valor);
                    System.out.println("Saque de R$" + valor + " realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }

            case "transferir" -> {
                if (conta.getSaldo() >= valor) {
                    conta.transferir(conta, valor);
                    System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
        }
    }

}
