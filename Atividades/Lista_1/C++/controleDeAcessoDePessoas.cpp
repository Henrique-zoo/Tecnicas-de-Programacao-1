#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    map<char, int> guests;
    guests['h'] = 0;
    guests['m'] = 0;

    while (true) {
        char gender;
        cin >> gender;
        if (gender == 'q')
            break;
        if (guests.count(gender))
            guests[gender]++;
    }
    int h = guests['h'];
    int m = guests['m'];
    float pH = 12.5 * h;
    float pM = 7.4 * m;
    cout << h << " " << m << endl;
    cout << fixed << setprecision(2) << pH << " " << pM << " " << pH + pM << endl;
    
    return 0;
}