package Atividades.Lista1.Java;

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        float altura = Float.parseFloat(str1);
        char sexo = str2.charAt(0);


        if (altura <= 0 || (sexo != 'm' && sexo != 'f')) {
            System.out.println("Entrada inválida!");
        } else {
            System.out.printf("%.1f kg\n", sexo == 'm' ? ((72.7*altura)-58) : ((62.1*altura)-44.7));
        }
        scanner.close();

    }
    
}