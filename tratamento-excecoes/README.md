## Tratamento de exceções em Java

**Exceção:** é um evento que interrompe o fluxo normal do processamento de uma classe.

- O uso correto de exceções torna o programa mais robusto e confiável.
- Com o tratamento de exceções, o programa pode continuar executando depois de lidar com um problema.
- Incorpore sua estratégia de tratamento de exceções no sistema desde o princípio do projeto.

**Classificação:**

- **Error:** usado pela JVM, e serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar. São erros não checados pelo compilador (eventos irrecuperáveis).
- **Exceptions:** são condições excepcionais checadas pelo compilador (eventos recuperáveis).
    - **Unchecked (Runtime):** exceptions que PODEM ser evitadas se forem tratados e analisados pelo desenvolvedor. (geralmente erros de lógica)
    - **Checked Exception:** exceptions que DEVEM ser evitadas e tratados pelo desenvolvedor para o programa funcionar

**Hierarquia:**

Throwable → Error e Exception

**Palavras reservadas:**

- **try, catch, finally:** cada uma dessas palavras, juntas, definem bocos para o tratamento de exceções
- **throws:** declara que um método pode lançar uma ou várias exceções
- **throw:** lança explicitamente uma exceção