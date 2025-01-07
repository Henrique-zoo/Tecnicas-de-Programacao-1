#include <iostream>
#include <vector>

using namespace std;

int i = 1;

class Circulo {
private:
    int x, y, raio;
public:
    static constexpr double PI = 3.14159;
    Circulo() {
        x = 0;
        y = 0;
        raio = 0;
    }
    Circulo(int x, int y, int raio) {
        this->x = x;
        this->y = y;
        this->raio = raio;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    int getRaio() {
        return raio;
    }

    void setRaio(int raio) {
        this->raio = raio;
    }

    double cincunferencia() {
        return 2 * PI * raio;
    }
};

void imprimirVetor(vector<Circulo>& vetor) {
    cout << "vetor" << i << ":\n";
    for (Circulo& circulo : vetor) {
        cout << circulo.getX() << " " << circulo.getY() << " " << circulo.getRaio() << endl;
    }
    i++;
}

int main() {
    vector<Circulo> vetor1(3);

    for (int i = 0; i < 3; ++i) {
        int x, y, raio;
        cin >> x >> y >> raio;
        Circulo tempCirculo(x, y, raio);
        vetor1[i] = tempCirculo;
    }
    vector<Circulo>& vetor2 = vetor1;

    vector<Circulo> vetor3(3);
    for (int i = 0; i < 3; ++i) {
        vetor3[i] = vetor1[i];
    }

    for (int i = 0; i < 3; ++i) {
        int novoRaio;
        cin >> novoRaio;
        vetor1[i].setRaio(novoRaio);
    }

    imprimirVetor(vetor1);
    imprimirVetor(vetor2);
    imprimirVetor(vetor3);
}