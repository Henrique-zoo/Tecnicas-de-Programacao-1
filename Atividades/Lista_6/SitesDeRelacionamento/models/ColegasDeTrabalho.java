package Atividades.Lista_6.SitesDeRelacionamento.Models;

public class ColegasDeTrabalho extends Contato {
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
