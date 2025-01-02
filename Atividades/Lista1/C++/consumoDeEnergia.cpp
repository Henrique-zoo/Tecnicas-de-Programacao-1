#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    float consumo, preco;
    cin >> consumo;

    bool a = (consumo <= 500), b = (consumo  > 500 && consumo <= 1000), c = (consumo > 1000);

    preco = (0.02 * a * consumo + 0.1 * b * 500) + (0.05 * (consumo - 500) * b + 0.35 * 1000 * c) + (0.1 * (consumo - 1000) * c);

    cout << fixed << setprecision(2) << preco << " 5.00 " << preco + 5.00 << endl;

    return 0;
}