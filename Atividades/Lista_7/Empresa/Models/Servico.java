package Atividades.Lista_7.Empresa.Models;

public class Servico implements Classificavel {
    private double preco;
    private String data, tipoServico;

    public Servico(double preco, String data, String tipoServico) {
        this.preco = preco;
        this.data = data;
        this.tipoServico = tipoServico;
    }
    
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getTipoServico() {
        return tipoServico;
    }
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        return this.preco < ((Servico) obj).preco;
    }
}
