#include <iostream>
#include <string>
#include <iomanip>
#include <unordered_set>

using namespace std;

class Conta {
private:
    int numeroConta, senha;
    double saldo;
    string nomeCliente;

public:
    Conta(int numeroConta, string nomeCliente, double saldo, int senha) {
        (*this).numeroConta = numeroConta;
        this->nomeCliente = nomeCliente;
        this->saldo = saldo;
        this->senha = senha;
    }

    int getNumeroConta() {
        return numeroConta;
    }

    string getNomeCliente() {
        return nomeCliente;
    }

    double getSaldo(int senha) {
        if (this->senha == senha)
            return saldo;
        return -1.0;
    }

    void setNumeroConta(int numeroConta) {
        this->numeroConta = numeroConta;
    }

    void setNomeCliente(string nomeCliente) {
        this->nomeCliente = nomeCliente;
    }

    void setSaldo(double saldo) {
        this->saldo = saldo;
    }

    bool sacar(double saque, int senha) {
        if ((this->senha == senha) && (saque > 0) && (saque < saldo)) {
            saldo -= saque;
            return true;
        }
        return false;
    }

    bool depositar(double deposito, int senha) {
        if ((this->senha == senha) && (deposito > 0)) {
            saldo += deposito;
            return true;
        }
        return false;
    }

    bool transferir(double valor, int senha, Conta conta2) {
        if ((this->senha == senha) && (valor > 0) && (valor < saldo)) {
            saldo -= valor;
            conta2.depositar(valor, conta2.senha);
            return true;
        }
        return false;
    }
};

int main() {
    int nConta, senha;
    string nome;
    double saldo;
    unordered_set<string> nomes;

    cin >> nConta >> senha >> nome >> saldo;
    nomes.insert(nome);

    Conta conta1(nConta, nome, saldo, senha);

    cin >> nConta >> senha >> nome >> saldo;
    nomes.insert(nome);

    Conta conta2(nConta, nome, saldo, senha);

    bool executando = true;
    while (executando) {
        int op;
        cin >> op;

        switch (op) {
            case 1: {
                int senha;
                cin >> senha;
                double saldo = conta1.getSaldo(senha);
                if (saldo > 0.0)
                    cout << fixed << setprecision(2) << saldo << endl;
                else
                    cout << "senha incorreta" << endl;
                break;
            }
            case 2: {
                double saque;
                int senha;
                cin >> saque >> senha;
                cout << (conta1.sacar(saque, senha) ? "saque realizado" : "saque não realizado") << endl;
                break;
            }
            case 3: {
                double deposito;
                int senha;
                cin >> deposito >> senha;
                cout << (conta1.depositar(deposito, senha) ? "depósito realizado" : "depósito não realizado") << endl;
                break;
            }
            case 4: {
                string nome;
                cin >> nome;
                if (nomes.count(nome)) {
                    double valor;
                    int senha;
                    cin >> valor >> senha;
                    cout << (conta1.transferir(valor, senha, conta2) ? "transferência realizada" : "transferência não realizada") << endl;
                } else {
                    cout << "nenhum usuário encontrado" << endl;
                }
                break;
            }
            case 5:
                executando = false;
                break;
            default:
                break;
        }
    }


    return 0;
}