# Aula 1: Criação

# Métodos

## Objetivos

1. Entender o que é um Método
2. Saber como definir e utilizar Métodos.
3. Aplicar boas práticas em sua criação e uso

## Conceituação

"É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele.
São responsáveis por definir e realizar uma determinado comportamento."

## Padrão de definição:

<?visibilidade?> <?tipo?> <?modificador?> retorno nome(<?parâmetros?>)<?exceções?> corpo

# Criação

onde:
(*)=> subliados

* V:"public","protected" ou "private" orientação objeto
T: contcreto ou abstrato
M: "static" ou "final" O.objeto 
* R: tipo de dado ou "void" => é vasio
* N: nome que é fornecido ao método
* P: parâmetros que pode receber
E: exceções que pode lançar
* C: código que possui ou vazio

public String getNome(){...}
public String calcularTotalNota(){...}
public int verificarDistancia(int cordenada1, int cordenada2) {...}
public abstract void executar();
public void alterarFabricante(Fabricante Fabricante){...}
public relatorio gerarDadosAnaliticos(Cliente cliente
List<Compra> compra){...}

public static RN(P){...}

# Utilização

Passa-se uma mensagem através de uma classe ou objeto.
nome_da_classe.nome_do_metodo(); nome_da_classe.nome_do_metodo(...);

nome_da_objeto.nome_do_metodo(); nome_da_objeto.nome_do_metodo(...);

Math.random(); ou Math.sqrt(4);(sqrt=> rais quadrada)

usuario.getEmail(); ou usuario.alterarEndereco(endereco);

# Particularidades

* Assinatura: é a forma de identificar unicamente o método
 
 Ass = nome + parâmetros

 Método:
 public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3){...}

 Assinatura:
 calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)

 # Particularidades
 
 * Contrutor e Destrutor: são métodos especiais usadados na Orientação a Objetos.

 *Mensagem: é o ato de solicitar ao métdo que o mesmo execute. Esta pode ser direcionada a uma objeto ou a uma classe.
 
