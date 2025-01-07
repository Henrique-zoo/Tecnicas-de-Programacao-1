#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    float height;
    char gender;
    cin >> height >> gender;

    if ((height < 0) || ((gender != 'm') && (gender != 'f')))
        cout << "Entrada inválida!\n";
    else
        cout << fixed << setprecision(1) << ((gender == 'm') ? (72.7 * height - 58) : (62.1 * height - 44.7)) << " kg\n";

    return 0;
}