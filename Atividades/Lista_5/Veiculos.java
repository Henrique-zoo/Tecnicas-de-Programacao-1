package Atividades.Lista_5;

import java.util.Scanner;

public class Veiculos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String placa, cor;
        int nPortas, qtdeCilindradas;
        float preco;

        placa = input.next();
        nPortas = input.nextInt();
        preco = input.nextFloat();
        input.nextLine();

        Veiculo veiculo = new Veiculo(placa, nPortas, preco);

        placa = input.next();
        nPortas = input.nextInt();
        preco = input.nextFloat();
        cor = input.nextLine();

        Carro carro = new Carro(placa, nPortas, preco, cor);

        placa = input.next();
        nPortas = input.nextInt();
        preco = input.nextFloat();
        qtdeCilindradas = input.nextInt();
        input.nextLine();

        Moto moto = new Moto(placa, nPortas, preco, qtdeCilindradas);

        System.out.println(veiculo);
        System.out.println(carro);
        System.out.println(moto);
        
        input.close();
    }
}

class Veiculo {
    protected String placa;
    protected int numeroDePortas;
    protected float preco;

    Veiculo() {
        placa = "";
        numeroDePortas = 0;
        preco = 0.0f;
    }

    Veiculo(String placa, int numeroDePortas, float preco) {
        this.placa = placa;
        this.numeroDePortas = numeroDePortas;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Placa: " + placa
            + " Número de portas: " + numeroDePortas
            + " Preço: R$" + String.format("%.1f", preco);
    }    
}

class Carro extends Veiculo {
    private String cor;

    Carro() {
        super();
        cor = "";
    }

    Carro(String placa, int numeroDePortas, float preco, String cor) {
        super(placa, numeroDePortas, preco);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + " Cor:" + cor;
    }
}

class Moto extends Veiculo {
    private int qtdeCilindradas;

    Moto() {
        super();
        qtdeCilindradas = 0;
    }

    Moto(String placa, int numeroDePortas, float preco, int qtdeCilindradas) {
        super(placa, numeroDePortas, preco);
        this.qtdeCilindradas = qtdeCilindradas;
    }

    public int getQtdeCilindradas() {
        return qtdeCilindradas;
    }

    public void setQtdeCilindradas(int qtdeCilindradas) {
        this.qtdeCilindradas = qtdeCilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + " Quantidade de cilindradas: " + qtdeCilindradas;
    }
}