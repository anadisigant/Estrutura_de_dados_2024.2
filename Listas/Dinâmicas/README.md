# LISTAS DINÂMICAS

## O que é uma Lista Dinâmica?

É uma estrutura de dados linear que pode crescer ou diminuir durante a execução do programa. Diferente das listas estáticas (arrays), as listas dinâmicas alocam memória conforme necessário, permitindo maior flexibilidade no gerenciamento de dados.

## Características da Lista Dinâmica

**Tamanho variável**: A lista pode crescer ou diminuir conforme os elementos são adicionados ou removidos.<br>
**Alocação dinâmica de memória**: Os elementos não precisam estar em locais contíguos na memória.<br>
**Facilidade em inserções e remoções**: Como não há tamanho fixo, é possível adicionar ou remover elementos sem a necessidade de realocação de memória.<br>
**Acesso sequencial**: Diferente de arrays, o acesso a um elemento pode exigir percorrer a lista até encontrá-lo.<br>

## Tipos de Listas Dinâmicas

1. **Lista Encadeada Simples**: Cada nó possui um ponteiro para o próximo elemento.
2. **Lista Duplamente Encadeada**: Cada nó possui ponteiros para o próximo e o anterior.
3. **Lista Circular**: O último elemento aponta para o primeiro, formando um ciclo.

## Complexidade das Operações

| Operação       | Lista Encadeada Simples | Lista Duplamente Encadeada |
|---------------|-----------------------|---------------------------|
| Acesso        | \(O(n)\)              | \(O(n)\)                  |
| Busca         | \(O(n)\)              | \(O(n)\)                  |
| Inserção no início | \(O(1)\)              | \(O(1)\)                  |
| Inserção no fim    | \(O(n)\) (sem ponteiro para o fim) | \(O(1)\) (se houver ponteiro para o fim) |
| Remoção do início  | \(O(1)\)              | \(O(1)\)                  |
| Remoção do fim     | \(O(n)\) (sem ponteiro para o fim) | \(O(1)\) (se houver ponteiro para o fim) |

**Acesso e Busca**: Como os elementos não estão armazenados de forma contígua, pode ser necessário percorrer a lista para encontrar um elemento, resultando em \(O(n)\).<br>
**Inserção e Remoção**: No início da lista, essas operações são \(O(1)\), pois basta alterar os ponteiros. No fim, a eficiência depende da implementação (se há um ponteiro para o último nó).

## Quando Usar Listas Dinâmicas?

- Quando o tamanho da estrutura de dados precisa ser flexível.
- Quando há necessidade de múltiplas inserções e remoções frequentes.
- Quando a realocação de memória de arrays pode ser custosa.

Listas dinâmicas oferecem flexibilidade ao permitir alocação dinâmica de memória, facilitando inserções e remoções. No entanto, possuem maior custo de acesso e busca em comparação com arrays. A escolha entre listas estáticas e dinâmicas depende dos requisitos do problema a ser resolvido.