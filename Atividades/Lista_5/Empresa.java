package Atividades.Lista_5;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, cidade, mes, nomeFuncionario, dataNascimento, departamento;
        float salario, floatDaClasse;
        int intDaClasse;

        nome = input.next();
        cidade = input.next();
        mes = input.next();
        input.nextLine();

        nomeFuncionario = input.next();
        dataNascimento = input.next();
        salario = input.nextFloat();
        departamento = input.nextLine().trim();

        Funcionario chefe = new Chefe(nomeFuncionario, dataNascimento, salario, departamento);

        nomeFuncionario = input.next();
        dataNascimento = input.next();
        salario = input.nextFloat();
        floatDaClasse = input.nextFloat();
        intDaClasse = input.nextInt();
        input.nextLine();

        Funcionario vendedor = new Vendedor(nomeFuncionario, dataNascimento, salario + floatDaClasse*intDaClasse, floatDaClasse, intDaClasse);

        nomeFuncionario = input.next();
        dataNascimento = input.next();
        salario = input.nextFloat();
        floatDaClasse = input.nextFloat();
        intDaClasse = input.nextInt();
        input.nextLine();

        Funcionario operario = new Operario(nomeFuncionario, dataNascimento, salario + floatDaClasse*intDaClasse, floatDaClasse, intDaClasse);

        nomeFuncionario = input.next();
        dataNascimento = input.next();
        salario = input.nextFloat();
        floatDaClasse = input.nextFloat();
        intDaClasse = input.nextInt();
        input.nextLine();

        Funcionario horista = new Horista(nomeFuncionario, dataNascimento,  salario + floatDaClasse*intDaClasse, floatDaClasse, intDaClasse);

        Funcionario[] funcionarios = {chefe, vendedor, operario, horista};

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.mostrarPagamentos(nome, cidade, mes, funcionarios);

        input.close();
    }
}

class FolhaPagamento {
    public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario[] funcionarios) {
        System.out.printf("Nome da Empresa: %s\nEndereço: %s\nMês: %s\n\n",
        nome, cidade, mes);
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("Nome: %s\nData de Nascimento: %s\nSalário: R$%.1f\n", funcionario.getNome(), funcionario.getDataNascimento(), funcionario.getSalario());
            
            if (funcionario instanceof Chefe) {
                Chefe chefe = (Chefe) funcionario;
                System.out.printf("Departamento: %s\nCargo: chefe\n\n", chefe.getDepartamento());
            } else if (funcionario instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) funcionario;
                System.out.printf("Cargo: vendedor\nComissão por Venda: R$%.1f\nNúmero de vendas: %d\n\n", vendedor.getComissaoVenda(), vendedor.getQuantidadeVendas());
            } else if (funcionario instanceof Operario) {
                Operario operario = (Operario) funcionario;
                System.out.printf("Cargo: Operário\nValor por Produção: R$%.1f\nQuantidade produzida: %d\n\n", operario.getValorProducao(), operario.getQuantidadeProduzida());
            } else {
                Horista horista = (Horista) funcionario;
                System.out.printf("Cargo: horista\nValor por Hora: R$%.1f\nTotal de horas: %d\n\n", horista.getValorHora(), horista.getTotalHoras());
            }
        }
    }
}

class Funcionario {
    private String nome;
    private String dataNascimento;
    private float salario;

    Funcionario() {
        nome = "";
        dataNascimento = "";
        salario = 0.0f;
    }

    Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

class Chefe extends Funcionario {
    private String departamento;

    Chefe() {
        super();
        departamento = "";
    }

    Chefe(String nome, String dataNascimento, float salario, String departamento) {
        super(nome, dataNascimento, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

class Vendedor extends Funcionario {
    private float comissaoVenda;
    private int quantidadeVendas;

    Vendedor() {
        super();
        comissaoVenda = 0.0f;
        quantidadeVendas = 0;
    }

    Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int quantidadeVendas) {
        super(nome, dataNascimento, salario);
        this.comissaoVenda = comissaoVenda;
        this.quantidadeVendas = quantidadeVendas;
    }

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
}

class Operario extends Funcionario {
    private float valorProducao;
    private int quantidadeProduzida;

    Operario() {
        super();
        valorProducao = 0.0f;
        quantidadeProduzida = 0;
    }

    Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, salario);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }
}

class Horista extends Funcionario {
    private float valorHora;
    private int totalHoras;

    Horista() {
        super();
        valorHora = 0.0f;
        totalHoras = 0;
    }

    Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras) {
        super(nome, dataNascimento, salario);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
}