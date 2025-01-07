#include <iostream>
#include <string>
#include <sstream>
#include <iomanip>

using namespace std;

class Temperatura {
private:
    double temperatura;

public:
    Temperatura(double temperatura) {
        this->temperatura = temperatura;
    }

    string toString() const {
        ostringstream stream;
        stream << fixed << setprecision(1) << temperatura;
        return stream.str();
    }

    void toFahrenheit() {
        temperatura = temperatura * 9.0/5.0 + 32;
    }

    void toCelsius() {
        temperatura = (temperatura - 32) * 5.0/9.0;
    }
};

int main() {
    double temp;
    cin >> temp;

    Temperatura temperatura(temp);
    
    temperatura.toFahrenheit();
    cout << "temperatura: " << temperatura.toString() << " graus fahrenheit" << endl;

    temperatura.toCelsius();

    cout << "temperatura: " << temperatura.toString() << " graus celsius\n";

    return 0;
}