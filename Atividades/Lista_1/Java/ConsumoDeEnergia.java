package Atividades.Lista_1.Java;

import java.util.Scanner;

public class ConsumoDeEnergia {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String str1 = entrada.nextLine();
        float consumo = Float.parseFloat(str1);
        float taxa;

        if (consumo <= 500) {
            taxa = (float) (consumo * 0.02);
        } else if (consumo <= 1000) {
            taxa = (float) (50 + (consumo - 500) * 0.05);
        } else {
            taxa = (float) (350 + (consumo - 1000) * 0.1);
        }

        System.out.printf("%.2f 5.00 %.2f\n", taxa, taxa + 5.00);

        entrada.close();
    }
}