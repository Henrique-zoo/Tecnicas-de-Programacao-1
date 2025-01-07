package Atividades.Lista_1.Java;

import java.util.ArrayList;
import java.util.Scanner;

public class CorretorOrtografico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        String[] dicionario = new String[n];

        for (int i = 0; i < n; i++) {
            dicionario[i] = input.nextLine();
        }

        String chave = input.nextLine();

        boolean found = false;
        for (String palavra : dicionario) {
            Result resultado = compararStrings(chave, palavra);

            if (resultado.number == 0) {
                System.out.println("palavra correta");
                found = true;
            } else if ((resultado.number == 2) && (compararPar(resultado.pairs.get(0), resultado.pairs.get(1)))) {
                System.out.println("palavra incorreta");
                System.out.println(palavra + "?");
                found = true;
            }
        }
        if (!found) {
            System.out.println("palavra incorreta");
            System.out.println("nenhuma sugestão");
        }

        input.close();
    }

    private static Result compararStrings(String a, String b) {
        Result saida = new Result();
        if (a.length() != b.length())
            return saida;

        ArrayList<Pair> diferentes = new ArrayList<Pair>();

        int difChar = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                difChar++;
                Pair chars = new Pair(a.charAt(i), b.charAt(i));
                diferentes.add(chars);
            }
        }
        saida.number = difChar;
        saida.pairs = diferentes;
        return saida;
    }

    private static boolean compararPar(Pair a, Pair b) {
        if ((a.first == b.second) && (a.second == b.first))
            return true;
        return false;
    }
}

class Pair {
    public char first;
    public char second;

    public Pair(char a, char b) {
        first = a;
        second = b;
    }
}

class Result {
    public int number;
    public ArrayList<Pair> pairs;

    public Result() {
        this.number = -1;
        this.pairs = new ArrayList<Pair>();
    }

    public Result(int number, ArrayList<Pair> pairs) {
        this.number = number;
        this.pairs = pairs;
    }
}