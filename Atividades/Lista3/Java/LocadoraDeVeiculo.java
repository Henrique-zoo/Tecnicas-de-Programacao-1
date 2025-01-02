package Atividades.Lista3.Java;

import java.util.Scanner;

public class LocadoraDeVeiculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] veiculoStr = input.nextLine().split(" ");
        String[] motoristaStr = input.nextLine().split(" ");
        String[] clienteStr = input.nextLine().split(" ");
        String[] chamadoStr = input.nextLine().split(" ");

        Veiculo veiculo = new Veiculo(veiculoStr[0], veiculoStr[1], veiculoStr[2], veiculoStr[3], Integer.parseInt(veiculoStr[4]));

        Motorista motorista = new Motorista(Integer.parseInt(motoristaStr[0]), motoristaStr[1], motoristaStr[2], motoristaStr[3]);

        Cliente cliente = new Cliente(Integer.parseInt(clienteStr[0]), clienteStr[3], clienteStr[4], clienteStr[1], clienteStr[2]);

        Chamado chamado = new Chamado(Integer.parseInt(chamadoStr[0]), chamadoStr[1], chamadoStr[2], chamadoStr[3], chamadoStr[4], Float.parseFloat(chamadoStr[5]), Float.parseFloat(chamadoStr[6]), Double.parseDouble(chamadoStr[7]), Double.parseDouble(chamadoStr[8]), Double.parseDouble(chamadoStr[9]), cliente, motorista, veiculo);

        System.out.printf("%d\n%s\n%s\n%s\n%s\n",
            chamado.getId(),
            chamado.getDestino(),
            chamado.getVeiculo().getPlaca(),
            chamado.getCliente().getRg(),
            chamado.getMotorista().getNome()
        );
        input.close();
    }
}
class Cliente {
    private int id;
    private String rg, cpf, nome, telefone;

    public Cliente(int id, String rg, String cpf, String nome, String telefone) {
        this.id = id;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class Motorista {
    private int id;
    private String nome, telefone, cnh;

    public Motorista(int id, String nome, String telefone, String cnh) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cnh = cnh;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}

class Veiculo {
    private String placa, marca, modelo, cor;
    private int ano;
    
    public Veiculo(String placa, String marca, String modelo, String cor, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}

class Chamado {
    private int id;
    private String data, tipo, origem, destino;
    private float horarioPartida, horarioRetorno;
    private double quilometragemIn, quilometragemFin, valorTotal;
    private Cliente cliente;
    private Motorista motorista;
    private Veiculo veiculo;

    public Chamado(int id, String data, String tipo, String origem, String destino, float horarioPartida, float horarioRetorno, double quilometragemIn, double quilometragemFin, double valorTotal, Cliente cliente, Motorista motorista, Veiculo veiculo) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.origem = origem;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.horarioRetorno = horarioRetorno;
        this.quilometragemIn = quilometragemIn;
        this.quilometragemFin = quilometragemFin;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.motorista = motorista;
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(float horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public float getHorarioRetorno() {
        return horarioRetorno;
    }

    public void setHorarioRetorno(float horarioRetorno) {
        this.horarioRetorno = horarioRetorno;
    }

    public double getQuilometragemIn() {
        return quilometragemIn;
    }

    public void setQuilometragemIn(double quilometragemIn) {
        this.quilometragemIn = quilometragemIn;
    }

    public double getQuilometragemFin() {
        return quilometragemFin;
    }

    public void setQuilometragemFin(double quilometragemFin) {
        this.quilometragemFin = quilometragemFin;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}