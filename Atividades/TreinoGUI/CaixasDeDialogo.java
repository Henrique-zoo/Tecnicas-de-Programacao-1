package Atividades.TreinoGUI;

import javax.swing.JOptionPane;

public class CaixasDeDialogo {
    public static void main(String[] args) {
        String tSum = JOptionPane.showInputDialog("Quantos números você quer somar?");

        int n = Integer.parseInt(tSum);
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            String numero = JOptionPane.showInputDialog("Digite o " + i + "º número do somatório: ");

            sum += Integer.parseInt(numero);
        }

        JOptionPane.showMessageDialog(null, "A soma dos " + tSum + " inteiros digitados é " + sum + "!", "Soma de" + tSum + "inteiros", JOptionPane.PLAIN_MESSAGE);
    }
} 