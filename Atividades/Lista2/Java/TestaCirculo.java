package Atividades.Lista2.Java;

import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circulo[] vetor1 = new Circulo[3];
        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int raio = scanner.nextInt();
            vetor1[i] = new Circulo(x, y, raio);
        }

        Circulo[] vetor2 = vetor1;

        Circulo[] vetor3 = new Circulo[3];
        for (int i = 0; i < 3; i++) {
            vetor3[i] = new Circulo(vetor1[i].getX(), vetor1[i].getY(), vetor1[i].getRaio());
        }

        for (int i = 0; i < 3; i++) {
            int novoRaio = scanner.nextInt();
            vetor1[i].setRaio(novoRaio);
        }

        imprimirVetor("vetor1", vetor1);
        imprimirVetor("vetor2", vetor2);
        imprimirVetor("vetor3", vetor3);

        scanner.close();
    }

    private static void imprimirVetor(String nome, Circulo[] vetor) {
        System.out.println(nome + ":");
        for (Circulo circulo : vetor) {
            System.out.println(circulo.getX() + " " + circulo.getY() + " " + circulo.getRaio());
        }
    }
}

class Circulo {
    private int x, y, raio;
    public static final double PI = 3.14159;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double circunferencia() {
        return 2 * PI * raio;
    }
}