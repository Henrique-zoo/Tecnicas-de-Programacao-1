package Atividades.Lista_6.SitesDeRelacionamento.models;

public abstract class Contato {
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
