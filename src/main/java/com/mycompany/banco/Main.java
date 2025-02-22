package com.mycompany.banco;

public class Main {

    private static int quantidadeContasCorrentes = 5;
    private static int nConta = 1;

    public static void main(String[] args) {

        Banco banco = new Banco();
               
        for (int i = 0; i < quantidadeContasCorrentes; i++) {
            Cliente cliente = new Cliente("Miguel", "123.456.789-66", "MIGUEL@GMAIL.COM", "5599453421");
            ContaCorrente conta = new ContaCorrente(nConta, 02, 4000, cliente);
            banco.adicionarContaCorrente(conta);
            nConta ++;
        }
           
        Cliente cliente2 = new Cliente("Lucas", "099.855.934-99", "LUCAS@GMAIL.COM", "55887694533");
        ContaInvestimento contaInvest = new ContaInvestimento(0007, 02, 4010, cliente2);
        banco.adicionarContaInvestimento(contaInvest);
              
        ProdutoInvestimentos LCA = new ProdutoInvestimentos("LCA", 0.008, 0.0);
        ProdutoInvestimentos LCI = new ProdutoInvestimentos("LCI", 0.005, 0.0);
        ProdutoInvestimentos CDB = new ProdutoInvestimentos("CDB", 0.009, 0.0);

        contaInvest.investir(LCI, 2000);
        contaInvest.investir(LCA, 2000);
        contaInvest.investir(CDB, 2000);
        contaInvest.listarInvestimentos();
        
        System.out.println(" ");
        
        contaInvest.Informacoes();
        
        System.out.println(" ");
        
        contaInvest.sacarInvestimento(LCI, 5);
        contaInvest.listarInvestimentos();
        
        System.out.println(" ");
        
        contaInvest.Informacoes();
        
        System.out.println(" ");
        
        contaInvest.calcularRendimento(LCI, 1000, 24);
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        banco.getContasCorrente().get(2).transferir(banco.getContasCorrente().get(4), 1000);
        banco.getContasCorrente().get(4).emitirExtrato();
        banco.getContasCorrente().get(2).emitirExtrato();
        banco.getContasCorrente().get(1).depositar(1000);
        banco.getContasCorrente().get(1).sacar(1000);
        banco.getContasCorrente().get(1).emitirExtrato();
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        banco.listarContasCorrente();
        banco.listarContasInvestimento();

    }
}