#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int n;
    cin >> n;
    string palavra, chave, aux;

    unordered_set<string> dicionario;
    map<string, string> reserva;

    while (n--) {
        cin >> palavra;
        dicionario.insert(palavra);
        for (unsigned int i = 1; i < palavra.length(); i++) {
            aux = palavra;
            aux[i] = palavra[i-1];
            aux[i-1] = palavra[i];
            reserva[aux] = palavra;
        }
    }
    
    cin >> chave;
    if (dicionario.count(chave)) {
        cout << "palavra correta\n";
    } else {
        cout << "palavra incorreta\n";
        if (reserva.count(chave))
            cout << reserva[chave] << "?" << endl;
        else
            cout << "nenhuma sugestão\n";
    }
    return 0;
}