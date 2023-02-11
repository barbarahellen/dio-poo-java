# Trabalhando com Collections Java

# Trabalhando com Collections Java

**Collection:** é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade. Serve para armazenar e processar conjuntos de dados de forma eficiente

Composição:

- **Interfaces:** é um contrato que quando assumido por uma classe deve ser implementado
- **Implementações ou Classes:** são as materializações, codificação das interfaces
- **Algoritmos:** É uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema

### Coleções com iterações ordenadas:

### Listas:

A interface List fica dentro do pacote **java.util.list**

**características:** 

- permite elementos duplicados e garante ordem de inserção.

implementações:

- **Vector:** utilizada em threads
- **ArrayList:** implementa a interface List
- **LinkedList:** implementa as interfaces List e Queue

 e LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias.

**ArrayList:** Esta classe implementa a List Interface e deve ser usada quando a aplicação demanda o armazenamento e acesso de dados (onde mais operações de pesquisa são necessárias). Utiliza array dinâmico para armazenar elementos nele e suporta todos os tipos de objeto. Manipular ArryList pode ser mais custoso devido a implementação interna. Quando um elemento é removido, o array é percorrido e os bits da memória deslocados.

**LinkedList:** Esta classe implementa a List Interface e a Queue Interface e deve ser usada quando a aplicação demanda manipulação dos dados armazenados (onde mais operações de inserção e exclusão são necessárias). Utiliza listas duplamente encadeadas para armazenar elementos nela e suporta todos os tipos de objeto. Manipular a LinkedList leva menos tempo comparado ao ArrayList, pois na LinkedList não existe o conceito de deslocamento de bits de memória. A lista é percorrida e as referências são alteradas.

### Conhecendo os métodos List:

Possíveis formas de se criar uma lista:

```java
List notas = new ArrayList();  // antes do java 5

List<Double> notas = new ArrayList<Double>();   // generics (jdk 5) - Diamond operator <> (jdk 6)

ArrayList<Double> notas = new ArrayList<>();    // não é recomendável 

List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));     

List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);   // forma válida, porém limitada pois não se pode mais adicionar ou retirar elementos.  
          
List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);        // a lista também fica imutável
```

**Melhor forma:** 

```java
List<Double> notas = new ArrayList<Double>();
```

**Métodos List:**

```java
notas.add(7.0);                       // adiciona elemento
notas.toString();                     // serve para retornar uma representação string de um objeto
notas.indexOf(5.0);                   // método indexOf serve para mostrar a posição
notas.set(notas.indexOf(5.0), 6.0);   // método set altera o elemento em determinada posição
notas.contains(5.0)                   // verifica se contém determinado elemento na lista
```

.