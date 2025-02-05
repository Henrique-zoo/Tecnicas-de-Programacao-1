package Atividades.Lista_7.Empresa.Models;

public class Classificador {
    public void ordena(Classificavel[] a) {
        Classificavel elem, menor;
        int pos;

        for (int i = 0; i < a.length - 1; i++) {
            elem = a[i];
            menor = a[i+1];
            pos = i + 1;
            // Percorremos a lista a partir de i + 2, se algum dos elementos a partir daí for menor do que o elemento em i + 1, guardamos ele como o menor
            for (int j = i + 2; j < a.length; j++) {
                if (a[j].menorElemento(menor)) {
                    menor = a[j];
                    pos = j;
                }
            }
            // Se o menor elemento entre [i+1, n] for menor do que o elemento em i, trocamos eles de lugar
            if (menor.menorElemento(elem)) {
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
    }
}
