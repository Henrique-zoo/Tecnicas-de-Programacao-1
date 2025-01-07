package Atividades.Lista_2.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimulacaoDeImpressora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Impressora impressora = new Impressora();
        impressora.bluetooth = true;
        impressora.wifi = true;
        impressora.colorida = true;
        impressora.ligada = false;
        impressora.papel = true;
        impressora.digitalizadora = true;
        impressora.copiadora = false;

        impressora.modelo = input.next();
        impressora.cor = input.next();
        impressora.tipoPapel = input.next();

        impressora.status();

        input.close();
    }

}

class Impressora {
    public String modelo, cor, tipoPapel;
    public boolean bluetooth, wifi, colorida, ligada, papel, digitalizadora, copiadora;

    public void ligar() {
        if (!ligada) {
            System.out.println("ligando...");
            ligada = true;
        }
    }

    public void desligar() {
        if (ligada) {
            System.out.println("desligando...");
            ligada = false;
        }
    }

    public void imprimir() {
        if (ligada) {
            if (papel)
                System.out.println("imprimindo...");
            else
                System.out.println("sem papel");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void digitalizar() {
        if (ligada) {
            if (digitalizadora)
                System.out.println("digitalização sendo realizada...");
            else
                System.out.println("não é possível digitalizar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void copiar() {
        if (ligada) {
            if (copiadora)
                System.out.println("cópia sendo realizada...");
            else
                System.out.println("não é possível copiar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void status() {
        Map<Boolean, String> onOff = new HashMap<>();
        onOff.put(true, "on");
        onOff.put(false, "off");

        System.out.printf("%s\n%s\n%s\n",
            modelo, cor, tipoPapel
        );

        System.out.printf("bluetooth %s\nwifi %s\nimpressão %s\nimpressora %s\n%stem papel\ndigitalizadora %s\ncopiadora %s\n",
            onOff.get(bluetooth),
            onOff.get(wifi),
            colorida ? "colorida" : "preto e branco",
            onOff.get(ligada),
            papel ? "" : "não ",
            onOff.get(digitalizadora),
            onOff.get(copiadora)
        );
        
        ligar();
        digitalizar();
        copiar();
        desligar();
        imprimir();
    }

}