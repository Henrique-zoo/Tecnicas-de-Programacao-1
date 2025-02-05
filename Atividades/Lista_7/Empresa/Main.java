package Atividades.Lista_7.Empresa;

import java.util.Scanner;

import Atividades.Lista_7.Empresa.Models.Classificador;
import Atividades.Lista_7.Empresa.Models.Classificavel;
import Atividades.Lista_7.Empresa.Models.Cliente;
import Atividades.Lista_7.Empresa.Models.Produto;
import Atividades.Lista_7.Empresa.Models.Servico;

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