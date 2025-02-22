package com.mycompany.banco;

import java.util.ArrayList;
import java.util.List;

public class ContaInvestimento extends Conta{
    private List<ProdutoInvestimentos> investimentos = new ArrayList<>();
    
    public ContaInvestimento(int numero, int agencia, double saldo, Cliente proprietario) {
        super(numero, agencia, saldo, proprietario);
        this.investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(ProdutoInvestimentos produto) {
        investimentos.add(produto);
    }
    
    public void sacarInvestimento(ProdutoInvestimentos produto, int tempo) {
        if (produto.getValorInvestido() > 0) {
            double retornoPrevisto = produto.getValorInvestido() * produto.getTaxaRetorno() * tempo;
            double retornoInvestimento = produto.getValorInvestido() + retornoPrevisto;
            setSaldo(getSaldo() + retornoInvestimento);
            produto.setValorInvestido(0);
            investimentos.remove(produto);
            System.out.println("Investimento em " + produto.getProduto() + " retirado com sucesso, obteve o total de R$" + retornoInvestimento);
        } else {
            System.out.println("Nao possui valor investido neste Produto.");
        }
    }
    
    public void investir(ProdutoInvestimentos produto, double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            produto.setValorInvestido(produto.getValorInvestido() + valor);
            adicionarInvestimento(produto);
            System.out.println("Voce investiu R$" + valor + " no produto " + produto.getProduto());
        } else {
            System.out.println("Saldo insuficiente para fazer o investimento.");
        }
    }
    
    public void calcularRendimento(ProdutoInvestimentos produto, double valor, int tempo) {
        double rendimento = valor * produto.getTaxaRetorno() * tempo;
        System.out.println("Produto de Investimento: " + produto.getProduto());
        System.out.println("Valor Investido: R$" + valor);
        System.out.println("Tempo Investido: " + tempo + " meses");
        System.out.println("Rendimento: R$" + rendimento);
        System.out.println("Valor Final: R$" + (valor + rendimento));
    }
    
    public void listarInvestimentos() {
        if (investimentos.isEmpty()) {
            System.out.println("Nenhum investimento registrado nesta conta.");
        } else {
            System.out.println("Lista de Investimentos da Conta:");
            for (ProdutoInvestimentos investimento : this.investimentos) {
                System.out.println("- Produto: " + investimento.getProduto() + " | Valor Investido: R$" + investimento.getValorInvestido());
            }
        }
    }
    
}