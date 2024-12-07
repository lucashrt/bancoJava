package com.mycompany.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<ContaCorrente> contasCorrente = new ArrayList<>();
    List<ContaInvestimento> contasInvestimento = new ArrayList<>();

    public List<ContaCorrente> getContasCorrente() {
        return this.contasCorrente;
    }
    
    public List<ContaInvestimento> getContasInvestimento() {
        return this.contasInvestimento;
    }

    public void adicionarContaInvestimento(ContaInvestimento conta) {
        contasInvestimento.add(conta);
    }
    
    public void adicionarContaCorrente(ContaCorrente conta) {
        contasCorrente.add(conta);
    }

    public void removerContaCorrente(ContaCorrente conta) {
        if (contasCorrente.remove(conta)) {
            System.out.println("Conta numero " + conta.getNumero() + " removida com sucesso.");
        } else {
            System.out.println("Conta nao encontrada.");
        }
    }
    
    public void removerContaInvestimento(ContaInvestimento conta) {
        if (contasInvestimento.remove(conta)) {
            System.out.println("Conta numero " + conta.getNumero() + " removida com sucesso.");
        } else {
            System.out.println("Conta nao encontrada.");
        }
    }

    public void listarContasCorrente() {
        for (Conta conta : this.contasCorrente) {
            conta.Informacoes();
            System.out.println("-------------------------------");
        }
    }
    
    public void listarContasInvestimento() {
        for (Conta conta : this.contasInvestimento) {
            conta.Informacoes();
            System.out.println("-------------------------------");
        }
    }

}