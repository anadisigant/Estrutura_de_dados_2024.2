# FILAS

## O que é uma Fila?

É uma estrutura de dados linear que segue a **política FIFO** (First In, First Out), ou seja, o primeiro elemento a ser inserido é o primeiro a ser retirado. Esse comportamento é muito utilizado em situações onde os dados precisam ser processados na ordem em que foram recebidos.

As filas podem ser implementadas de duas formas principais: **estática** e **dinâmica**. Cada tipo possui características próprias que determinam quando e como usá-las.

## Tipos de Filas

**Fila Estática**:
   - Implementada utilizando um array de tamanho fixo.
   - A fila tem um limite de capacidade determinado no momento da criação.
   - Ideal quando o número de elementos é previsível.

**Fila Dinâmica**:
   - Implementada utilizando uma lista encadeada.
   - A fila pode crescer ou diminuir de tamanho conforme necessário, sem a necessidade de especificar o tamanho antecipadamente.
   - Ideal para situações em que a quantidade de elementos pode variar ao longo do tempo.

## Operações Principais

Abaixo estão as operações comuns realizadas em filas e suas complexidades para ambos os tipos (estático e dinâmico):

| Operação             | Fila Estática (Array) | Fila Dinâmica (Encadeada) |
|----------------------|-----------------------|---------------------------|
| **Inserção (enfileirar)**   | \(O(1)\)              | \(O(1)\)                  |
| **Remoção (desenfileirar)** | \(O(1)\)              | \(O(1)\)                  |
| **Espiar (olhar o primeiro)** | \(O(1)\)             | \(O(1)\)                  |
| **Verificar se está vazia** | \(O(1)\)             | \(O(1)\)                  |


**Inserção**: Adicionar um novo elemento na fila (enfileirar) é uma operação eficiente em ambos os casos, com tempo constante \(O(1)\).
  
**Remoção**: Remover um elemento da fila (desenfileirar) também é uma operação eficiente, sendo \(O(1)\) para filas estáticas e dinâmicas.

**Espiar**: Verificar o primeiro elemento da fila sem removê-lo pode ser feito em tempo constante em ambas as implementações.

**Verificar se está vazia**: Verificar se a fila está vazia também é uma operação eficiente, sendo realizada em \(O(1)\) tanto em filas estáticas quanto dinâmicas.

## Diferença entre Filas Estáticas e Dinâmicas

### Fila Estática (Array):
**Vantagens**:
  - Implementação simples.
  - Acesso rápido e direto à posição do primeiro e último elemento.
  - Menor uso de memória, pois o tamanho é fixo.

**Desvantagens**:
  - Tamanho fixo, o que pode levar ao desperdício de memória ou à falta de espaço se a fila crescer além do limite.
  - Pode ser necessário realizar movimentações de elementos quando a fila é implementada de forma linear (não circular).

### Fila Dinâmica (Encadeada):
**Vantagens**:
  - O tamanho da fila pode crescer dinamicamente conforme necessário.
  - Não há desperdício de memória, pois a memória é alocada à medida que os elementos são adicionados.

**Desvantagens**:
  - A implementação é mais complexa, devido à necessidade de manipulação de ponteiros.
  - O acesso direto aos elementos não é possível, já que é necessário percorrer a lista encadeada.

## Quando Usar Cada Tipo de Fila?

**Usar uma fila estática** quando:
  - O número de elementos é conhecido de antemão ou não muda muito ao longo do tempo.
  - O desempenho de inserção e remoção precisa ser otimizado com memória fixa.
  
**Usar uma fila dinâmica** quando:
  - O número de elementos pode variar dinamicamente.
  - O sistema precisa de mais flexibilidade e não há necessidade de um limite de tamanho fixo.

Filas são estruturas fundamentais em muitas aplicações que exigem processamento em ordem de chegada. **Filas estáticas** (implementadas com arrays) são úteis quando o número de elementos é fixo ou previsível. **Filas dinâmicas** (implementadas com listas encadeadas) oferecem mais flexibilidade, permitindo o crescimento e diminuição do tamanho da fila conforme necessário.
