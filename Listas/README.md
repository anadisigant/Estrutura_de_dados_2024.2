# LISTAS

## O que é uma Lista?

É uma estrutura de dados linear que armazena elementos em uma sequência ordenada. Cada elemento em uma lista tem uma posição (ou índice) associada a ele. As listas podem ser classificadas em:

**Listas Estáticas** (arrays): possuem tamanho fixo e são alocadas estaticamente.<br>
**Listas Dinâmicas** (listas encadeadas): podem crescer e diminuir dinamicamente conforme necessidade.

## Tipos de Listas

1. **Lista Estática (Array)**: Utiliza um bloco contíguo de memória para armazenar elementos. O acesso a um elemento é rápido, mas inserções e remoções podem ser custosas.
2. **Lista Encadeada**: Cada elemento (nó) armazena um valor e um ponteiro para o próximo nó. Existem variações:
   - **Lista simplesmente encadeada** (cada nó aponta para o próximo).
   - **Lista duplamente encadeada** (cada nó aponta para o próximo e o anterior).
   - **Lista circular** (o último nó aponta para o primeiro).

## Complexidade das Operações


| Operação       | Lista Estática (Array) | Lista Encadeada      |
|----------------|-------------------|-----------------|
| Acesso (
A[i]) | \(O(1)\)            | \(O(n)\)          |
| Busca        | \(O(n)\)            | \(O(n)\)        |
| Inserção no início | \(O(n)\)            | \(O(1)\)          |
| Inserção no fim    | \(O(1)\) (se espaço disponível) | \(O(n)\) (simples) / \(O(1)\) (duplamente encadeada) |
| Remoção do início | \(O(n)\)            | \(O(1)\)          |
| Remoção do fim    | \(O(1)\) (se espaço disponível) | \(O(n)\) (simples) / \(O(1)\) (duplamente encadeada) |


**Acesso**: Em arrays, acessar um elemento pelo índice é rápido \(O(1)\), pois o endereço é calculado diretamente. Em listas encadeadas, é necessário percorrer os nós até encontrar o desejado \(O(n)\).<br>
**Busca**: Como não há uma estrutura de busca otimizada, a busca linear é \(O(n)\) para ambos os casos.<br>
**Inserção e Remoção**: Em listas encadeadas, adicionar ou remover um elemento do início pode ser feito em tempo constante \(O(1)\), enquanto em arrays requer deslocamento de elementos \(O(n)\).

## Quando Usar Cada Tipo de Lista?

**Usar Arrays** quando:
  - O tamanho da lista é conhecido antecipadamente.
  - Acesso rápido a elementos específicos é necessário.
  - Poucas inserções e remoções são realizadas.

**Usar Listas Encadeadas** quando:
  - O tamanho da lista pode variar dinamicamente.
  - As operações de inserção e remoção são frequentes.
  - O custo de acesso direto a elementos não é uma prioridade.

Listas são uma estrutura fundamental na computação e sua escolha depende dos requisitos de cada aplicação. Arrays são eficientes para acesso rápido, enquanto listas encadeadas são mais flexíveis para inserções e remoções dinâmicas.