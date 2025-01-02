package Atividades.Lista4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InterfaceGrafica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Táxi");
        frame.setSize(2000, 1125); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        JPanel painel = new JPanel();
        painel.setPreferredSize(new Dimension(2000, 50));
        painel.setBackground(Color.ORANGE);

        JButton button = new JButton("Cadastrar-se");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);

        JPanel caixaDeCadastro = new JPanel();
        caixaDeCadastro.setPreferredSize(new Dimension(100, 100));
        caixaDeCadastro.setBackground(Color.CYAN);
        caixaDeCadastro.setLayout(new BoxLayout(caixaDeCadastro, BoxLayout.Y_AXIS));

        JPanel area;
        JTextField input;
        JLabel label;

        area = new JPanel();
        input = new JTextField(20);
        label = new JLabel("Nome: ");
        area.add(label);
        area.add(input);
        caixaDeCadastro.add(area);

        input = new JTextField(20);
        label = new JLabel("RG: ");
        caixaDeCadastro.add(label);
        caixaDeCadastro.add(input);

        input = new JTextField(20);
        label = new JLabel("CPF: ");
        caixaDeCadastro.add(label);
        caixaDeCadastro.add(input);

        input = new JTextField(20);
        label = new JLabel("telefone: ");
        caixaDeCadastro.add(label);
        caixaDeCadastro.add(input);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.add(caixaDeCadastro, BorderLayout.CENTER);

                // Atualiza a interface gráfica
                frame.revalidate();
                frame.repaint();
            }
        });

        // Adiciona o botão ao painel com FlowLayout
        painel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painel.add(button);

        // Adiciona o painel ao frame
        frame.add(painel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
