# Agência Bancária desenvolvida usando JAVA

Este é um projeto de uma Agência Bancária desenvolvido com foco em **Programação Orientada a Objetos (POO)**, utilizando a linguagem Java.

## Funcionalidades

O sistema implementa as seguintes operações bancárias:

- **Saque**: Permite realizar retiradas de dinheiro de contas.
- **Depósito**: Adiciona valores às contas bancárias.
- **Transferência**: Realiza transferências entre contas cadastradas no sistema.
- **Investimentos**: Disponibiliza produtos de investimento personalizados, com a criação de objetos específicos para cada tipo de investimento.

## Estrutura do Projeto

O projeto foi desenvolvido com uma abordagem modular e orientada a objetos, utilizando conceitos como **encapsulamento**, **herança**, **polimorfismo** e **abstração**.

### Classes Principais

- **Conta (Classe Mãe)**: Representa uma conta bancária genérica, com atributos como número da conta, agência, saldo e titular.
  - **Conta Corrente (Classe Filha)**: Extensão da classe `Conta`, com métodos específicos, como saque, transferência e depósito.
  - **Conta Investimentos (Classe Filha)**: Extensão da classe `Conta`, voltada para aplicações financeiras, integrando produtos de investimento.
- **Cliente**: Representa os clientes do banco, contendo informações como nome, CPF, email e telefone.
- **Banco**: Gerencia os clientes, contas e operações realizadas no sistema.
- **ProdutoInvestimentos**: Modela diferentes tipos de produtos de investimento, como renda fixa, trazendo um retorno no saldo dependendo do tempo investido.

## Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/lucashrt/bancoJava.git
