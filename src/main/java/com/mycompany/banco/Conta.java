package com.mycompany.banco;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente proprietario;

    public Conta(int numero, int agencia, double saldo, Cliente proprietario) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getProprietario() {
        return this.proprietario;
    }

    public void Informacoes() {
        System.out.println("==Dados da Conta do Cliente==");
        System.out.println("Numero da Conta: " + this.numero);
        System.out.println("Agencia da Conta: " + this.agencia);
        System.out.println("Saldo da Conta: R$" + this.saldo);
        System.out.println("==Informacoes do Cliente==");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCpf());
        System.out.println("Email: " + proprietario.getEmail());
        System.out.println("Telefone: " + proprietario.getTelefone());
    }

}