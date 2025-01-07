#include <iostream>

using namespace std;

class Cliente {
private:
    int id;
    string rg, cpf, nome, telefone;

public:
    Cliente(int id, string rg, string cpf, string nome, string telefone)
        : id(id), rg(rg), cpf(cpf), nome(nome), telefone(telefone) {}

    int getId() {
        return id;
    }
    string getRg() {
        return rg;
    }
    string getCpf() {
        return cpf;
    }
    string getNome() {
        return nome;
    }
    string getTelefone() {
        return telefone;
    }
    void setId(int id) {
        this->id = id;
    }
    void setRg(string rg) {
        this->rg = rg;
    }
    void setCpf(string cpf) {
        this->cpf = cpf;
    }
    void setNome(string nome) {
        this->nome = nome;
    }
    void setTelefone(string telefone) {
        this->telefone = telefone;
    }

};

class Motorista {
private:
    int id;
    string nome, telefone, cnh;

public:
    Motorista(int id, string nome, string telefone, string cnh)
        : id(id), nome(nome), telefone(telefone), cnh(cnh) {}

    int getId() {
        return id;
    }
    string getNome() {
        return nome;
    }
    string getTelefone() {
        return telefone;
    }
    string getCnh() {
        return cnh;
    }
    void setId(int id) {
        this->id = id;
    }
    void setNome(string nome) {
        this->nome = nome;
    }
    void setTelefone(string telefone) {
        this->telefone = telefone;
    }
    void setCnh(string cnh) {
        this->cnh = cnh;
    }
};

class Veiculo {
private:
    string placa, marca, modelo, cor;
    int ano;
    
public:
    Veiculo(string placa, string marca, string modelo, string cor, int ano)
        : placa(placa), marca(marca), modelo(modelo), cor(cor), ano(ano)
    {}

    string getPlaca() {
        return placa;
    }
    string getMarca() {
        return marca;
    }
    string getModelo() {
        return modelo;
    }
    string getCor() {
        return cor;
    }
    int getAno() {
        return ano;
    }
    void setPlaca(string placa) {
        this->placa = placa;
    }
    void setMarca(string marca) {
        this->marca = marca;
    }
    void setModelo(string modelo) {
        this->modelo = modelo;
    }
    void setCor(string cor) {
        this->cor = cor;
    }
    void setAno(int ano) {
        this->ano = ano;
    }
};

class Chamado {
private:
    int id;
    string data, tipo, origem, destino;
    float horarioPartida, horarioRetorno;
    double quilometragemIn, quilometragemFin, valorTotal;
    Cliente cliente;
    Motorista motorista;
    Veiculo veiculo;

public:
    Chamado(int id, string data, string tipo, string origem, string destino, float horarioPartida, float horarioRetorno, double quilometragemIn, double quilometragemFin, double valorTotal, Cliente& cliente, Motorista& motorista, Veiculo& veiculo)
        : id(id), data(data), tipo(tipo), origem(origem), destino(destino), horarioPartida(horarioPartida), horarioRetorno(horarioRetorno), quilometragemIn(quilometragemIn), quilometragemFin(quilometragemFin), valorTotal(valorTotal), cliente(cliente), motorista(motorista), veiculo(veiculo) {}

    int getId() {
        return id;
    }

    void setId(int id) {
        this->id = id;
    }

    string getData() {
        return data;
    }

    void setData(string data) {
        this->data = data;
    }

    string getTipo() {
        return tipo;
    }

    void setTipo(string tipo) {
        this->tipo = tipo;
    }

    string getOrigem() {
        return origem;
    }

    void setOrigem(string origem) {
        this->origem = origem;
    }

    string getDestino() {
        return destino;
    }

    void setDestino(string destino) {
        this->destino = destino;
    }

    float getHorarioPartida() {
        return horarioPartida;
    }

    void setHorarioPartida(float horarioPartida) {
        this->horarioPartida = horarioPartida;
    }

    float getHorarioRetorno() {
        return horarioRetorno;
    }

    void setHorarioRetorno(float horarioRetorno) {
        this->horarioRetorno = horarioRetorno;
    }

    double getQuilometragemIn() {
        return quilometragemIn;
    }

    void setQuilometragemIn(double quilometragemIn) {
        this->quilometragemIn = quilometragemIn;
    }

    double getQuilometragemFin() {
        return quilometragemFin;
    }

    void setQuilometragemFin(double quilometragemFin) {
        this->quilometragemFin = quilometragemFin;
    }

    double getValorTotal() {
        return valorTotal;
    }

    void setValorTotal(double valorTotal) {
        this->valorTotal = valorTotal;
    }

    Cliente getCliente() {
        return cliente;
    }

    void setCliente(Cliente cliente) {
        this->cliente = cliente;
    }

    Motorista getMotorista() {
        return motorista;
    }

    void setMotorista(Motorista motorista) {
        this->motorista = motorista;
    }

    Veiculo getVeiculo() {
        return veiculo;
    }

    void setVeiculo(Veiculo veiculo) {
        this->veiculo = veiculo;
    }
};

int main() {
    int ano, id;
    string placa, marca, modelo, cor, nome, telefone, cnh, rg, cpf, data, tipo, origem, destino;
    float horarioPartida, horarioRetorno;
    double quilometragemIn, quilometragemFin, valorTotal;

    cin >> placa >> marca >> modelo >> cor >> ano;

    Veiculo veiculo(placa, marca, modelo, cor, ano);

    cin >> id >> nome >> telefone >> cnh;

    Motorista motorista(id, nome, telefone, cnh);

    cin >> id >> nome >> telefone >> rg >> cpf;

    Cliente cliente(id, rg, cpf, nome, telefone);

    cin >> id >> data >> tipo >> origem >> destino >> horarioPartida >> horarioRetorno >> quilometragemIn >> quilometragemFin >> valorTotal;

    Chamado chamado(id, data, tipo, origem, destino, horarioPartida, horarioRetorno, quilometragemIn, quilometragemFin, valorTotal, cliente, motorista, veiculo);

    cout << chamado.getId() << endl << chamado.getDestino() << endl << chamado.getVeiculo().getPlaca() << endl << chamado.getCliente().getRg() << endl << chamado.getMotorista().getNome() << endl;

    return 0;
}