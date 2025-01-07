package Atividades.Lista_1.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SiglasInternet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        Map<String, String> dicio = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] rel = input.nextLine().split(" ");
            dicio.put(rel[0], rel[1]);
        }

        String[] frase = input.nextLine().split(" ");
        String fraseFinal = "";

        for (String palavra : frase) {
            String palavra2 = palavra.toLowerCase();
            if (dicio.containsKey(palavra) || dicio.containsKey(palavra2)) {
                palavra = palavra.toLowerCase();
                fraseFinal += dicio.get(palavra) + " ";
            } else {
                fraseFinal += palavra + " ";
            }
        }

        System.out.println(fraseFinal);

        input.close();
    }
}