package Atividades.Lista_1.Java;

import java.util.Scanner;

public class CalculoDoIPTU {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tipo = input.nextInt();
        input.nextLine();
        int area = input.nextInt();
        input.nextLine();

        if (tipo == 1 && area > 0)
            System.out.printf("%.2f", area < 200 ? area*1.0 : area*1.2);
        else if (tipo == 2 && area > 0)
            System.out.printf("%.2f", area < 200 ? area*1.1 : area*1.3);
        else
            System.out.println("Entrada inválida!");
        input.close();
    }
}
