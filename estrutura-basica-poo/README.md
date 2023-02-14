# Programação orientada a objetos:

### Por que usar?

- O paradigma **estruturado** tem uma representação mais simplista e foca em operações (funções) e dados. Foca mais no “como fazer”
- O paradigma **orientado a objeto** tem uma representação mais realista e foca na modelagem de entidades e nas interações entre estas. Foca mais no “o que fazer”

### Vantagens:

- **Melhor coesão** - as responsabilidades de cada unidade de código devem ser bem definidas.
- **Melhor acoplamento** - bons acoplamentos são flexíveis.
- **Diminuição do Gap semântico** - diminuição da diferença de representação do mundo real e do computacional
- **Coletor de lixo**

### O que é a POO?

A orientação a objetos é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos.

### Fundamentos:

- **Abstração:** processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos.
- **Reuso:** capacidade de criar novas unidades de código a partir de outras já existentes
- **Encapsulamento:** capacidade de esconder complexidades e proteger dados.

### Estrutura básica da OO:

- **Classe:** é uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.
    - exemplos: carro, bola, venda, comprador, viagem, computador
    - geralmente são substantivos → nomes significativos
    - criação:
    
    ```java
    class Carro{
    
    }
    ```
    
- **Atributo:** é o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a  partir da classe.
    - exemplos: Bola → diâmetro, Carro → cor, Viagem → distância, Computador → memória, Venda → valor, Comprador → nome.
    - **Atributo x Variável**: o atributo é o que é próprio e peculiar a alguém ou a alguma coisa. A variável é sujeita a variações ou mudanças.
    - geralmente substantivos e adjetivos; nomes significativos; abstração; tipos adequados
        
        ```java
        class Carro{
        	int qtdPortas;
        }
        ```
        

- **Método:** é uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento.
    - exemplos: Carro → ligar, Venda → calcular total, Comprador → realizar troca, Computador → desligar
    - **Criação**:
        - visibilidade
        - retorno
        - nome
        - parâmetros
    - **Dica:** os nomes precisam ser significativos e verbos
        
        ```java
        class Carro{
        	void frear(){
        		...
        	}
        }
        ```
        
    - **Métodos especiais:**
        - **Construtor:** constrói objetos e pode passar valores iniciais para os atributos.
            
            ```java
            class Carro{
            	Carro(){
            		...
            	}
            }
            ```
            
        - **Destrutor:** Auxilia a destruição de um objeto. Serve para liberar possíveis recursos que o objeto esteja usando.
            
            ```java
            class Carro{
            	void finalize()
            		...
            	}
            }
            ```
            
    - **Sobrecarga:** mudar a assinatura de acordo com a necessidade. → Assinatura = nome + parâmetros.
        - m1( );
        - m1(int i);
        - m1(float f);
        - m1(String s, long l)
        - m1(long l, String s)

- **Objeto:** é a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore, etc) ou conceitual (viagem, estoque, compra, etc) e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos.

```java
Carro carro = new Carro();
```

- **Mensagem:** é o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático.

```java
Carro carro = new Carro();
carro.<método>;  //chamada de método via objeto

Carro.<método>;  //chamada de método via classe
```

### As relações: Herança, Associação e Interface

- **Herança:** é o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada de superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.

```java
class A extends B{
	...
}
// A é um subtipo de B - herda os atributos e métodos definidos na classe B
```

- **Tipos de Herança:**
    - **Simples:** A classe filha tem só uma classe mãe
    - **Múltipla:** A classe filha tem uma ou mais classes mães.
- **Upcast:**
    
    ```java
    A a = new B(); // transforma B em A
    ```
    
- **Downcast:**
    
    ```java
    B a = (B) new A();  // transforma A em B e coloca na variável do tipo B
    ```
    

- **Polimorfismo:** é a  possibilidade de um mesmo método se comportar de maneira diferente.
    - exemplo: Pagamento - processar()
    Boleto - processar()
    Credito - processar()
    Debito - processar()
    Pix - processar()

- **Sobrescrita:** é a mesma ação se comportando diferente
    - exemplo: Conta → double saldo → exibirSaldo()
        
        Corrente 
        
        Poupança - exibirSaldo()
        
        Especial - exibirSaldo()
        
        Universitaria
        

- **Associação:** possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos.
    - Tipos:
        - Estrutural: se manifesta nos atributos das classes objetos
            - Composição: “com parte todo”
                
                ex: pessoa e endereço
                
                ```java
                class Pessoa{
                	Endereco endereco;
                }
                ```
                
            - Agregação: “sem parte todo”
                
                ex: disciplina e aluno (não existe relacionamento forte entre as partes)
                
            
            ```java
            class Disciplina{
            	Aluno aluno;
            }
            ```
            
        - Comportamental: tem a ver com os métodos
            - Dependência: “depende de”
            
             ex: compra e cupom
            
            ```java
            class Compra{
            	...
            	finalizar(Cupom cupom, ...)
            	...
            }
            ```
            
        - Herança x Associação:
            - herança é uma relação mais rígida — uma classe herda da outra
            - associação é uma relação mais flexível — pode ter os valores alterados
            
- **Interface:** define um contrato que deve ser seguido pela classe que a implemente. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza.
    
    ```java
    interface A{
    	..
    }
    
    class B implements A{
    	...
    }
    ```
    

### Organização de Pacotes e Visibilidades

**Pacotes:** são uma organização física ou lógica criada para separar classes com responsabilidades distintas. Com isso, espera-se que a aplicação fique mais organizada e seja possível separar classes de finalidades e representatividades diferentes.

```java
package nomeDaPasta; // separa as pastas

import nomeDaPasta;  // torna as pastas visíveis
```

**Visibilidades:** um modificador de acesso tem como finalidade determinar até que ponto uma classe, atributo ou método pode ser usado. A utilização de modificadores de acesso é fundamental para o uso efetivo da orientação a objetos.

- Tipos:
    - **Private:** métodos ****são visíveis apenas dentro da classe onde foram definidos.
    - **Protected:** métodos são visíveis dentro da classe, mesmo pacote e subclasses
    - **Public:** métodos são visíveis em qualquer lugar

