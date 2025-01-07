package Atividades.Lista_1.Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ControleDeAcessoDePessoas {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> lucro = new ArrayList<Float>(3);

        for (int i = 0; i < 3; i++)
            lucro.add((float)(0));

        Map<String, Float> precoIngresso = new HashMap<>();
        precoIngresso.put("h", 12.5f);
        precoIngresso.put("m", 7.4f);

        while (true) {
            String gender = input.nextLine();

            if (gender.equals("q"))
                break;
            if (gender.equals("h"))
                lucro.set(0, lucro.get(0) + 1);
            else if (gender.equals("m"))
                lucro.set(1, lucro.get(1)+ 1);

            lucro.set(2, lucro.get(2) + precoIngresso.getOrDefault(gender,0.0f));
        }
        System.out.printf("%d %d\n%.2f %.2f %.2f\n",
        lucro.get(0).intValue(),
        lucro.get(1).intValue(),
        lucro.get(0) * precoIngresso.get("h"),
        lucro.get(1) * precoIngresso.get("m"),
        lucro.get(2)
        );

        input.close();
    }

}