package com.mycompany.banco;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta{
    private List<Transacao> transacoes;
 
    public ContaCorrente(int numero, int agencia, double saldo, Cliente proprietario) {
        super(numero, agencia, saldo, proprietario);
        this.transacoes = new ArrayList<>();
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public List<Transacao> getTransacoes() {
        return this.transacoes;
    }

    public void registrarTransacao(String tipoTransacao, double valor) {
        Transacao transacao = new Transacao(this, tipoTransacao, valor);
        transacoes.add(transacao);
    }
    
    public void depositar(double valor){
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            registrarTransacao("Deposito", valor);
            System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor invalido!");
        }
    }
    
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            registrarTransacao("Saque", valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(ContaCorrente destinatario, double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            destinatario.receberTransferencia(valor);
            registrarTransacao("Transferencia", valor);
            System.out.println("Transferencia de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    } 
    
    public void receberTransferencia(double valor){
        setSaldo(getSaldo() + valor);
        registrarTransacao("Recebimento de Transferencia", valor);
    }
    
    public void emitirExtrato(){
        System.out.println("=== Extrato da Conta ===");
        System.out.println("Numero da Conta: " + getNumero());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Saldo Atual: R$" + getSaldo());
        System.out.println("------------------------");

        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transacao realizada.");
        } else {
            for (Transacao transacao : this.transacoes) {
                System.out.println("Tipo: " + transacao.getTipoTransacao() + " | Valor: R$" + transacao.getValor());
            }
        }
        System.out.println("========================");
    }
    
}