package Atividades.Lista_6.SitesDeRelacionamento.models;

public class Familia extends Contato {
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
