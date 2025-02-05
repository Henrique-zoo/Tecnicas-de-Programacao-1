package Atividades.Lista_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numProduto, numCliente, numServico, codigo;
        double preco;
        String cpf, nome, endereco, data, tipoServico;
        Classificavel classificavel;
        Classificador classificador = new Classificador();
        
        numProduto = input.nextInt();
        numCliente = input.nextInt();
        numServico = input.nextInt();
        input.nextLine();

        Produto[] produtos = new Produto[numProduto];
        Cliente[] clientes = new Cliente[numCliente];
        Servico[] servicos = new Servico[numServico];

        for (int i = 0; i < numProduto; i++) {
            String partes[] = input.nextLine().split(" ");
            codigo = Integer.parseInt(partes[0]);
            nome = partes[1];
            preco = Double.parseDouble(partes[2]);
            classificavel = new Produto(codigo, nome, preco);
            produtos[i] = (Produto) classificavel;
        }
        for (int i = 0; i < numCliente; i++) {
            cpf = input.next().trim();
            nome = input.next().trim();
            endereco = input.nextLine().trim();
            classificavel = new Cliente(cpf, nome, endereco);
            clientes[i] = (Cliente) classificavel;
        }
        for (int i = 0; i < numServico; i++) {
            String partes[] = input.nextLine().split(" ");
            tipoServico = partes[0];
            preco = Double.parseDouble(partes[1]);
            data = partes[2];
            classificavel = new Servico(preco, data, tipoServico);
            servicos[i] = (Servico) classificavel;
        }

        classificador.ordena(produtos);
        classificador.ordena(clientes);
        classificador.ordena(servicos);

        for (Produto produto : produtos) {
            System.out.printf("%d %s %.2f\n",
                produto.getCodigo(),
                produto.getNome(),
                produto.getPreco()
            );
        }
        for (Cliente cliente : clientes) {
            System.out.printf("%s %s %s\n",
                cliente.getCpf(),
                cliente.getNome(),
                cliente.getEndereco()
            );
        }
        for (Servico servico : servicos) {
            System.out.printf("%s %.2f %s\n",
                servico.getTipoServico(),
                servico.getPreco(),
                servico.getData()
            );
        }

        input.close();
    }
}

class Classificador {
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

interface Classificavel {
    public boolean menorElemento(Classificavel obj);
}

class Cliente implements Classificavel {
    private String cpf, nome, endereco;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        return this.nome.compareTo(((Cliente) obj).nome) < 0;
    }
}

class Produto implements Classificavel {
    private int codigo;
    private String nome;
    private double preco;

    public Produto (int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        return this.codigo < ((Produto) obj).codigo;
    }
}

class Servico implements Classificavel {
    private double preco;
    private String data, tipoServico;

    public Servico(double preco, String data, String tipoServico) {
        this.preco = preco;
        this.data = data;
        this.tipoServico = tipoServico;
    }
    
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getTipoServico() {
        return tipoServico;
    }
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        return this.preco < ((Servico) obj).preco;
    }
}