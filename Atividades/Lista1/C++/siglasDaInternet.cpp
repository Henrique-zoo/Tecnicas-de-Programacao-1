#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    string sigla, sigla2, palavra;
    map<string, string> dicionario;
    cin >> n;

    while (n--) {
        cin >> sigla >> palavra;
        dicionario[sigla] = palavra;
        sigla2 = sigla;
        sigla2[0] = sigla[0] - ('a' - 'A');
        dicionario[sigla2] = palavra;
    }
    
    cin.ignore(); 
    string frase;
    getline(cin, frase);
    istringstream iss(frase);
    string word, stringFinal = "";

    while (iss >> word) {
        if (dicionario.count(word)) {
            stringFinal += dicionario[word] + " ";
        } else {
            stringFinal += word + " ";
        }
    }
    cout << stringFinal << endl;

    return 0;
}