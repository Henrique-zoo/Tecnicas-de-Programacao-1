package Atividades.Lista_2.Java;

import java.util.Scanner;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp = input.nextInt();
        input.nextLine();

        Temperatura temperatura = new Temperatura(temp);

        temperatura.toFahrenheit();

        System.out.printf("temperatura: %s graus fahrenheit\n", temperatura.toString());

        temperatura.toCelsius();

        System.out.printf("temperatura: %s graus celsius\n", temperatura.toString());

        input.close();
    }
}

class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String toString() {
        return "" + temperatura;
    }

    public void toFahrenheit() {
        temperatura = temperatura * 9.0/5.0 + 32;
    }

    public void toCelsius() {
        temperatura = (temperatura - 32) * 5.0/9.0;
    }
}