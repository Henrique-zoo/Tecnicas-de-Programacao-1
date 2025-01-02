#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int tipo, area;
    cin >> tipo >> area;
    tipo--;

    bool a = area < 200;
    float iptu = area * 1.0 + area * tipo * 0.1 + area * 0.2 * !a;

    if ((tipo != 0 && tipo != 1) || area <= 0)
        cout << "Entrada inválida!\n";
    else
        cout << fixed << setprecision(2) << iptu << endl;

    return 0;
}