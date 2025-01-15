package Atividades.Lista_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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

abstract class Contato {
    protected String nome, apelido, email, aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String imprimirBasico() {
        return String.format(
            "Nome: %s\nApelido: %s\nEmail: %s\nAniversário: %s\n",
            nome, apelido, email, aniversario
        );
    }

    public abstract String imprimirContato();
}

class Amigo extends Contato {
    protected int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
    
    public String imprimirContato() {
        HashMap<Integer, String> nivelAmizade = new HashMap<>();
        nivelAmizade.put(1, "Melhor Amigo");
        nivelAmizade.put(2, "Amigo");
        nivelAmizade.put(3, "Conhecido");

        return imprimirBasico() + String.format("Grau: %s\n", nivelAmizade.get(grau));
    }
}

class Familia extends Contato {
    protected String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String imprimirContato() {
        return imprimirBasico() + String.format("Parentesco: %s\n", parentesco);
    }
}


class ColegasDeTrabalho extends Contato {
    protected String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String imprimirContato() {
        return imprimirBasico() + String.format("Relacionamento de trabalho: %s\n", tipo);
    }
}
