package com.mycompany.banco;

public class ProdutoInvestimentos {
    String produto;
    double taxaRetorno;
    double valorInvestido;

   public ProdutoInvestimentos(String produto, double taxaRetorno, double valorInvestido){
       this.produto = produto;
       this.taxaRetorno = taxaRetorno;
       this.valorInvestido = valorInvestido;
   }

    public String getProduto() {
        return this.produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getTaxaRetorno() {
        return this.taxaRetorno;
    }

    public void setTaxaRetorno(double taxaRetorno) {
        this.taxaRetorno = taxaRetorno;
    }
    
    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }
    
    public double getValorInvestido() {
        return this.valorInvestido;
    }
    
}