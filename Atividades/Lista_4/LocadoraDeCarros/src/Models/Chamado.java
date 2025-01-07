/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author henri
 */
public class Chamado {
    private int id;
    private LocalDate data;
    private String tipo, origem, destino;
    private float horarioPartida, horarioRetorno;
    private double quilometragemIn, quilometragemFin, valorTotal;
    private Cliente cliente;
    private Motorista motorista;
    private Veiculo veiculo;

    public Chamado(int id, LocalDate data, String tipo, String origem, String destino, float horarioPartida, float horarioRetorno, double quilometragemIn, double quilometragemFin, double valorTotal, Cliente cliente, Motorista motorista, Veiculo veiculo) {
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

    public Chamado(int id, LocalDate data, String origem, String destino, double valorTotal, Cliente cliente, Motorista motorista, Veiculo veiculo) {
        this.id = id;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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
