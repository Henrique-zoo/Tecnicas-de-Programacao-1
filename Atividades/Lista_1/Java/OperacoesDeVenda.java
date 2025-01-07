package Atividades.Lista_1.Java;

import java.util.Scanner;
import java.util.ArrayList;

public class OperacoesDeVenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();
        int n = Integer.parseInt(str1);

        ArrayList<Produto> produtos = new ArrayList<Produto>(n); 

        for (int i = 0; i < n; i++) {
            String[] temp = input.nextLine().split(" ");


            Produto produto = new Produto(temp[0], Integer.parseInt(temp[1]));
            produtos.add(produto);
        }

        while (true) {
            String vendaN = input.nextLine();

            if (vendaN.equals("fim"))
                break;

            boolean found = false;
            for (Produto produto : produtos) {
                if (produto.getNome().equals(vendaN)) {
                    found = true;
                    String strAux = input.nextLine();
                    int qtdVendida = Integer.parseInt(strAux);

                    produto.setQtd(produto.getQtd()- qtdVendida);
                    System.out.println(vendaN + " " + strAux);
                }
            }

            if (!found)
                System.out.println(vendaN + " produto não encontrado");
        }

        for (Produto produto : produtos)
            System.out.println(produto.toString());

        input.close();
    }   
}

class Produto {
    private String nome;
    private int qtd;

    public Produto (String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }
    public int getQtd() {
        return qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return nome + " " + qtd;
    }
}