package Atividades.Lista2.Java;

import java.util.Scanner;

public class Formas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c1 = input.nextInt();
        int l1 = input.nextInt();
        input.nextLine();
        int c2 = input.nextInt();
        int l2 = input.nextInt();
        input.nextLine();

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        r1.setComprimento(c1);
        r1.setLargura(l1);
        r2.setComprimento(c2);
        r2.setLargura(l2);


        System.out.printf("%d %d %d %d\n", r1.getComprimento(), r1.getLargura(), r1.calculaPerimetro(), r1.calculaArea());

        System.out.printf("%d %d %d %d\n", r2.getComprimento(), r2.getLargura(), r2.calculaPerimetro(), r2.calculaArea());

        input.close();
    }
}

class Retangulo {
    private int comprimento = 1;
    private int largura = 1;

    
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        if (comprimento > 0 && comprimento < 20)
            this.comprimento = comprimento;
    }
    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        if (largura > 0 && largura < 20)
            this.largura = largura;
    }

    public int calculaPerimetro() {
        return 2 * (comprimento + largura);
    }

    public int calculaArea() {
        return comprimento * largura;
    }
}