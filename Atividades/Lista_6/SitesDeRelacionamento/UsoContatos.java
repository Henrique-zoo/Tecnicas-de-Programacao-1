package Atividades.Lista_6.SitesDeRelacionamento;

import java.util.ArrayList;
import java.util.Scanner;

import Atividades.Lista_6.SitesDeRelacionamento.Models.Amigo;
import Atividades.Lista_6.SitesDeRelacionamento.Models.ColegasDeTrabalho;
import Atividades.Lista_6.SitesDeRelacionamento.Models.Contato;
import Atividades.Lista_6.SitesDeRelacionamento.Models.Familia;

public class UsoContatos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        boolean executando = true;
        
        while (executando) {
            int acao = input.nextInt();
            switch (acao) {
                case 1:
                    contatos = inserirContato(input, contatos);
                    break;
                
                case 2:
                    imprimirContatos(contatos, acao-1);
                    break;

                case 3:
                    imprimirContatos(contatos, acao-1);
                    break;

                case 4:
                    imprimirContatos(contatos, acao-1);
                    break;

                case 5:
                    imprimirContatos(contatos, acao-1);
                    break;

                case 6:
                    imprimirEspecifico(contatos);
                    break;
                
                case 7:
                    ArrayList<Contato> aux = new ArrayList<>();
                    int i = input.nextInt();
                    input.nextLine();
                    aux.add(contatos.get(i-1));
                    imprimirContatos(aux, 1);
                    break;
                
                case 8:
                    executando = false;
                    break;
            
                default:
                    break;
            }
        }
        input.close();
    }

    private static ArrayList<Contato> inserirContato(Scanner input, ArrayList<Contato> contatos) {
        int tipo = input.nextInt();
        String nome = input.next();
        String apelido = input.next();
        String email = input.next();
        String aniversario = input.next();
        Contato contato;
        if (tipo == 1) {
            int grau = input.nextInt();
            input.nextLine();
            contato = new Amigo(nome, apelido, email, aniversario, grau);
        } else if (tipo == 2) {
            String parentesco = input.next();
            input.nextLine();
            contato = new Familia(nome, apelido, email, aniversario, parentesco);
        } else {
            String type = input.next();
            input.nextLine();
            contato = new ColegasDeTrabalho(nome, apelido, email, aniversario, type);
        }
        contatos.add(contato);

        return contatos;
    }

    public static void imprimirContatos(ArrayList<Contato> contatos, int caso) {
        for (Contato contato : contatos) {
            if (contato instanceof Amigo && (caso == 1 || caso == 3)) {
                Amigo amigo = (Amigo) contato;
                System.out.printf("%s", amigo.imprimirContato());
            } else if (contato instanceof Familia && (caso == 1 || caso == 2)) {
                Familia familia = (Familia) contato;
                System.out.printf("%s", familia.imprimirContato());
            } else if (contato instanceof ColegasDeTrabalho && (caso == 1 || caso == 4)) {
                ColegasDeTrabalho colegaDeTrabalho = (ColegasDeTrabalho) contato;
                System.out.printf("%s", colegaDeTrabalho.imprimirContato());
            }
        }
    }

    public static void imprimirEspecifico(ArrayList<Contato> contatos) {
        for (Contato contato : contatos) {
            if (contato instanceof Amigo) {
                Amigo amigo = (Amigo) contato;
                if (amigo.getGrau() == 1)
                    System.out.printf("%s", amigo.imprimirContato());
            } else if (contato instanceof Familia) {
                Familia familia = (Familia) contato;
                if (familia.getParentesco().equals("irmão"))
                    System.out.printf("%s", familia.imprimirContato());
            } else {
                ColegasDeTrabalho colegaDeTrabalho = (ColegasDeTrabalho) contato;
                if (colegaDeTrabalho.getTipo().equals("colega"))
                    System.out.printf("%s", colegaDeTrabalho.imprimirContato());
            }
        }
    }
}