#include <iostream>

using namespace std;

class Retangulo {
private:
    int comprimento = 1;
    int largura = 1;

public:
    int getComprimento() {
        return comprimento;
    }
    int getLargura() {
        return largura;
    }
    void setComprimento(int comprimento) {
        if (comprimento > 0 && comprimento < 20)
            this->comprimento = comprimento;
    }
    void setLargura(int largura) {
        if (largura > 0 && largura < 20)
            this->largura = largura;
    }
    int calculaPerimetro() {
        return 2 * (comprimento + largura);
    }
    int calculaArea() {
        return comprimento * largura;
    }
};

int main() {
    int c1, l1, c2, l2;
    cin >> c1 >> l1 >> c2 >> l2;
    
    Retangulo r1, r2;

    r1.setComprimento(c1);
    r1.setLargura(l1);
    r2.setComprimento(c2);
    r2.setLargura(l2);

    cout << r1.getComprimento() << " " << r1.getLargura() << " " << r1.calculaPerimetro() << " " << r1.calculaArea() << endl;

    cout << r2.getComprimento() << " " << r2.getLargura() << " " << r2.calculaPerimetro() << " " << r2.calculaArea() << endl;

    return 0;
}