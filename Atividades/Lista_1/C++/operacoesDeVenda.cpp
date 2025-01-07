#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int n, qtd;
    string nome;
    cin >> n;
    map<string, int> produtos;
    vector<string> ordem;

    while (n--) {
        cin >> nome >> qtd;
        produtos[nome] = qtd;
        ordem.push_back(nome);
    }

    while (true) {
        cin >> nome;
        if (nome == "fim")
            break;
        
        if (produtos.count(nome)) {
            cin >> qtd;
            cout << nome << " " << qtd << endl;
            produtos[nome] -= qtd;
        } else {
            cout << nome << " produto não encontrado\n";
        }
    }

    for (string& chave : ordem) {
        cout << chave << " " << produtos[chave] << endl;
    }

    return 0;
}