package Atividades.Lista_6.SitesDeRelacionamento.Models;

import java.util.HashMap;

public class Amigo extends Contato {
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
