package Atividades.Lista_2.Java;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] str1 = input.nextLine().split(" ");
        String[] str2 = input.nextLine().split(" ");

        Conta conta1 = new Conta(Integer.parseInt(str1[0]), str1[2], Double.parseDouble(str1[3]), Integer.parseInt(str1[1]));

        Conta conta2 = new Conta(Integer.parseInt(str2[0]), str2[2], Double.parseDouble(str2[3]), Integer.parseInt(str2[1]));

        boolean executando = true;

        while(executando) {
            int op = input.nextInt();
            int senha;
            input.nextLine();

            switch (op) {
                case 1:
                    senha = input.nextInt();
                    input.nextLine();
                    double saldo = conta1.getSaldo(senha);
                    System.out.println((saldo > 0.0) ? String.format("%.2f", saldo) : "senha incorreta");
                    break;
                case 2:
                    double saque = input.nextDouble();
                    senha = input.nextInt();
                    input.nextLine();
                    System.out.println(conta1.sacar(saque, senha) ? "saque realizado" : "saque não realizado");
                    break;
                case 3:
                    double deposito = input.nextDouble();
                    senha = input.nextInt();
                    input.nextLine();
                    System.out.println(conta1.depositar(deposito, senha) ? "depósito realizado" : "depósito não realizado");
                    break;
                case 4:
                    String nome = input.nextLine();
                    if (nome.equals(str1[2]) || nome.equals(str2[2])) {
                        double valor = input.nextDouble();
                        senha = input.nextInt();
                        input.nextLine();
                        System.out.println(conta1.transferir(valor, senha, conta2) ? "transferência realizada" : "transferência não realizada");
                    } else {
                        System.out.println("nenhum usuário encontrado");
                    }
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    break;
            }
        }
        input.close();
    }
}

class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;

    public Conta(int numeroConta, String nomeCliente, double saldo, int senha) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo(int senha) {
        if (this.senha == senha)
            return saldo;
        return -1.0;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double saque, int senha) {
        if ((this.senha == senha) && (saque > 0) && (saque < saldo)) {
            saldo -= saque;
            return true;
        }
        return false;
    }

    public boolean depositar(double deposito, int senha) {
        if ((this.senha == senha) && (deposito > 0)) {
            saldo += deposito;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, int senha, Conta conta2) {
        if ((this.senha == senha) && (valor > 0) && (valor < saldo)) {
            saldo -= valor;
            conta2.depositar(valor, conta2.senha);
            return true;
        }
        return false;
    }
}