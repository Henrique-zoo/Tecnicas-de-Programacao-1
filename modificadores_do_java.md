<style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
        caption {
            font-weight: bold;
            margin-bottom: 10px;
        }
    </style>

## Modificadores de Acesso
<table>
    <thead>
        <tr>
            <th>Modificador</th>
            <th>Aplicável a</th>
            <th>Funcionamento</th>
            <th>Visibilidade</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>public</td>
            <td>Classe, método, variável</td>
            <td>Permite o acesso de qualquer lugar do código.</td>
            <td>Global</td>
        </tr>
        <tr>
            <td>protected</td>
            <td>Método, variável (não se aplica a classes de nível superior)</td>
            <td>Permite acesso dentro do mesmo pacote e por subclasses, mesmo em pacotes diferentes.</td>
            <td>Pacote e herança</td>
        </tr>
        <tr>
            <td>defaut(sem modificador explícito)</td>
            <td>Classe, método, variável</td>
            <td>Permite acesso apenas dentro do mesmo pacote.</td>
            <td>Pacote</td>
        </tr>
        <tr>
            <td>private</td>
            <td>Método, variável (não se aplica a classes de nível superior)</td>
            <td>Permite acesso apenas dentro da própria classe.</td>
            <td>Classe local</td>
        </tr>
    </tbody>
</table>

## Modificadores não Acessíveis
<table>
    <thead>
        <tr>
            <th>Modificador</th>
            <th>Classe</th>
            <th>Método</th>
            <th>Variável</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>final</td>
            <td>Não pode ser estendida</td>
            <td>Não pode ser sobrescrito</td>
            <td>Não podem ser inicializados mais de uma vez</td>
        </tr>
        <tr>
            <td>abstract</td>
            <td>Define uma classe que não pode ser instanciada diretamente, apenas estendida para outras classes que podem ser intanciadas.</td>
            <td>Define um método que deve ser implementado por subclasses.</td>
            <td>N/a</td>
        </tr>
        <tr>
            <td>static</td>
            <td>N/a</td>
            <td>Pertence à classe em vez de uma instância específica, compartilhado por todas as instâncias da classe e das subclasses.</td>
            <td>Pertence à classe em vez de uma instância específica, compartilhado por todas as instâncias da classe e das subclasses.</td>
        </tr>
        <tr>
            <td>synchronized</td>
            <td>N/a</td>
            <td>Garante que o método ou bloco seja acessado por apenas uma thread por vez.</td>
            <td>N/a</td>
        </tr>
        <tr>
            <td>volatile</td>
            <td>N/a</td>
            <td>N/a</td>
            <td>Indica que uma variável pode ser modificada por threads simultaneamente, garantindo a visibilidade correta para todas as threads.</td>
        </tr>
        <tr>
            <td>transient</td>
            <td>N/a</td>
            <td>N/a</td>
            <td>Exclui uma variável da serialização.</td>
        </tr>
        <tr>
            <td>native</td>
            <td>N/a</td>
            <td>Indica que o método é implementado em código nativo fora do ambiente Java (normalmente em linguagens como C ou C++).</td>
            <td>N/a</td>
        </tr>
        <tr>
            <td>strictfp</td>
            <td>Garante que os cálculos de ponto flutuante sigam as regras precisas do IEEE 754 para consistência entre plataformas.</td>
            <td>Garante que os cálculos de ponto flutuante sigam as regras precisas do IEEE 754 para consistência entre plataformas.</td>
            <td>N/a</td>
        </tr>
    </tbody>
</table>