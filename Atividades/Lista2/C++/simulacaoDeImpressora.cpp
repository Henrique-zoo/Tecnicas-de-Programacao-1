#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

class Impressora {
public:
    string modelo, cor, tipoPapel;
    bool bluetooth, wifi, colorida, ligada, papel, digitalizadora, copiadora;

    void ligar() {
        if (!ligada) {
            cout << "ligando..." << endl;
            ligada = true;
        }
    }

    void desligar() {
        if (ligada) {
            cout << "desligando..." << endl;
            ligada = false;
        }
    }

    void imprimir() {
        if (ligada) {
            if (papel)
                cout << "imprimindo..." << endl;
            else
                cout << "sem papel" << endl;
        } else {
            cout << "impressora desligada" << endl;
        }
    }

    void digitalizar() {
        if (ligada) {
            if (digitalizadora)
                cout << "digitalização sendo realizada..." << endl;
            else
                cout << "não é possível digitalizar" << endl;
        } else {
            cout << "impressora desligada" << endl;
        }
    }

    void copiar() {
        if (ligada) {
            if (copiadora)
                cout << "cópia sendo realizada..." << endl;
            else
                cout << "não é possível copiar" << endl;
        } else {
            cout << "impressora desligada" << endl;
        }
    }

    void status() {
        unordered_map<bool, string> onOff = {
            {true, "on"},
            {false, "off"}
        };

        cout << modelo << endl << cor << endl << tipoPapel << endl;

        cout << "bluetooth " << onOff[bluetooth] << endl;
        cout << "wifi " << onOff[wifi] << endl;
        cout << "impressão " << (colorida ? "colorida" : "preto e branco") << endl;
        cout << "impressora " << onOff[ligada] << endl;
        cout << (papel ? "" : "não ") << "tem papel" << endl;
        cout << "digitalizadora " << onOff[digitalizadora] << endl;
        cout << "copiadora " << onOff[copiadora] << endl;

        ligar();
        digitalizar();
        copiar();
        desligar();
        imprimir();
    }
};

int main() {
    Impressora impressora;

    impressora.bluetooth = true;
    impressora.wifi = true;
    impressora.colorida = true;
    impressora.ligada = false;
    impressora.papel = true;
    impressora.digitalizadora = true;
    impressora.copiadora = false;

    cin >> impressora.modelo;
    cin >> impressora.cor;
    cin >> impressora.tipoPapel;

    impressora.status();

    return 0;
}