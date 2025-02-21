# FILAS DINÂMICAS

## O que é uma Fila Dinâmica?

É uma estrutura de dados linear que segue a política **FIFO** (First In, First Out), ou seja, o primeiro elemento a ser inserido será o primeiro a ser retirado. O termo "dinâmico" refere-se à capacidade da fila de crescer e diminuir de tamanho automaticamente conforme necessário, sem a necessidade de definir seu tamanho previamente.

As filas dinâmicas geralmente são implementadas usando **listas encadeadas**, onde cada elemento (ou **nó**) armazena um valor e um ponteiro para o próximo nó na fila. Isso permite que a fila cresça e diminua de maneira eficiente.

## Como Funciona?

Em uma fila dinâmica:
- **Inserção (Enfileirar)**: Quando um novo elemento é adicionado à fila, ele é colocado no final.
- **Remoção (Desenfileirar)**: Quando um elemento é removido, ele é retirado do início da fila.
- **Espiar**: Permite verificar o primeiro elemento da fila sem removê-lo.

Por ser dinâmica, a fila pode crescer ou encolher conforme a necessidade, sem que o usuário precise se preocupar com o tamanho máximo ou alocação de memória.

## Estrutura

Uma fila dinâmica é composta por uma sequência de **nós**. Cada nó possui duas partes:<br>

**Valor**: O dado armazenado no nó.<br>
**Ponteiro**: Um link que aponta para o próximo nó da fila.

O último nó, por convenção, aponta para **null** (ou `null` em algumas linguagens), indicando que não há mais elementos na fila.

## Operações Principais

Aqui estão as operações comuns realizadas em filas dinâmicas e suas respectivas complexidades:

| Operação             | Fila Dinâmica (Encadeada) |
|----------------------|---------------------------|
| **Inserção (Enfileirar)**   | \(O(1)\)                  |
| **Remoção (Desenfileirar)** | \(O(1)\)                  |
| **Espiar (Olhar o primeiro)** | \(O(1)\)                  |
| **Verificar se está vazia** | \(O(1)\)                  |

**Inserção**: Adicionar um elemento ao final da fila (enfileirar) é uma operação constante \(O(1)\), pois basta adicionar um nó ao final da lista encadeada.
  
**Remoção**: Remover um elemento do início da fila (desenfileirar) também é uma operação constante \(O(1)\), já que a remoção ocorre no primeiro nó.

**Espiar**: Obter o primeiro elemento da fila sem removê-lo também é feito em tempo constante \(O(1)\), acessando diretamente o primeiro nó.

**Verificar se está vazia**: Verificar se a fila está vazia é uma operação constante \(O(1)\), checando se o ponteiro do primeiro nó é `null`.

## Tipos de Implementação

Existem diferentes formas de implementar uma fila dinâmica, dependendo de como a lista encadeada é estruturada:

**Fila Simplesmente Encadeada**:
   - Cada nó aponta para o próximo nó na fila.
   - O último nó tem o ponteiro para `null`, indicando o fim da fila.

**Fila Circular**:
   - O último nó aponta para o primeiro nó, formando um ciclo.
   - Utilizada para otimizar o uso de memória, especialmente em implementações de fila com capacidade limitada.

## Vantagens das Filas Dinâmicas

**Flexibilidade**: O tamanho da fila pode crescer ou diminuir conforme necessário. Não há limite fixo para a quantidade de elementos.<br>
**Eficiência de memória**: A memória é alocada de forma dinâmica, o que significa que a fila não precisa ter uma capacidade pré-definida ou desperdiçar espaço.<br>
**Facilidade nas operações**: As operações de enfileirar e desenfileirar são eficientes (\(O(1)\)), permitindo que os elementos sejam processados rapidamente.<br>

## Desvantagens das Filas Dinâmicas

**Complexidade**: A implementação de filas dinâmicas é mais complexa do que filas estáticas, já que envolve manipulação de ponteiros e alocação dinâmica de memória.<br>

**Uso de memória extra**: Cada nó precisa de memória para armazenar o valor e o ponteiro, o que pode resultar em overhead de memória adicional em comparação com filas estáticas.

## Quando Usar uma Fila Dinâmica?

**Usar uma fila dinâmica** quando:
  - O número de elementos na fila não é conhecido de antemão ou pode variar ao longo do tempo.
  - A flexibilidade é importante e não há necessidade de um tamanho fixo para a fila.
  - A aplicação precisa de filas que crescem ou encolhem conforme a demanda, sem limites rígidos.


As **filas dinâmicas** são eficientes para armazenar e processar elementos de forma sequencial quando o número de elementos pode variar. Elas oferecem flexibilidade e economia de memória, já que o tamanho da fila não é fixo e a memória é alocada de forma dinâmica. Embora sua implementação seja mais complexa do que a de filas estáticas, elas são ideais para cenários em que a flexibilidade e o gerenciamento dinâmico de memória são necessários.
