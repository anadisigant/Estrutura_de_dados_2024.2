# Pilhas Estáticas

## O que é uma Pilha Estática?

Uma **pilha estática** é uma estrutura de dados linear que segue a regra **LIFO** (Last In, First Out - O último a entrar é o primeiro a sair). A principal característica de uma pilha estática é que ela tem um **tamanho fixo** definido no momento de sua criação. Isso significa que a quantidade de elementos que podem ser armazenados na pilha é limitada e não pode ser alterada durante a execução do programa, ao contrário de pilhas dinâmicas, que podem crescer ou diminuir conforme necessário.

As pilhas estáticas são geralmente implementadas usando **arrays** ou **vetores**, onde o espaço de memória é alocado de maneira contínua e os elementos são empilhados e desempilhados a partir do final (topo) do array.

A pilha estática pode ser implementada utilizando um **array** e uma variável para controlar o topo da pilha (ou seja, o índice do último elemento inserido).

## Características da Pilha Estática

**Tamanho fixo**: O número de elementos que a pilha pode armazenar é pré-determinado no momento da criação.<br>
**Acesso sequencial**: O acesso aos elementos é feito de maneira LIFO, ou seja, o último elemento inserido é o primeiro a ser removido.<br>

**Operações principais**:
  - **Push**: Adiciona um novo elemento ao topo da pilha.
  - **Pop**: Remove o elemento do topo da pilha.
  - **Peek/Top**: Retorna o elemento do topo da pilha sem removê-lo.
  - **isEmpty**: Verifica se a pilha está vazia.
  - **isFull**: Verifica se a pilha está cheia.

## Complexidade das Operações

As operações básicas em uma pilha estática têm complexidade **O(1)**, o que significa que todas as operações principais são realizadas em tempo constante.

| Operação    | Complexidade |
|-------------|--------------|
| **Push**    | \(O(1)\)     |
| **Pop**     | \(O(1)\)     |
| **Peek**    | \(O(1)\)     |
| **isEmpty** | \(O(1)\)     |
| **isFull**  | \(O(1)\)     |

**Push**: Adicionar um elemento ao topo da pilha é uma operação de tempo constante (\(O(1)\)), pois a inserção ocorre apenas no índice atual do topo.<br>
**Pop**: Remover um elemento do topo também é feito em tempo constante (\(O(1)\)), já que apenas o índice do topo é alterado.<br>
**Peek**: Retornar o valor do topo sem removê-lo também ocorre em tempo constante (\(O(1)\)).<br>
**isEmpty** e **isFull**: Ambas as verificações ocorrem em tempo constante (\(O(1)\)), pois envolvem apenas a verificação de um valor de índice.<br>

## Quando Usar uma Pilha Estática?

A pilha estática é uma boa escolha quando o número de elementos a ser armazenado é conhecido antecipadamente ou quando o tamanho da pilha não mudará durante a execução do programa.

**Usar uma Pilha Estática quando:**
- O tamanho da pilha é fixo e conhecido no início.
- A performance e o acesso rápido ao topo da pilha são importantes.
- O gerenciamento de memória é uma consideração importante, pois a alocação é feita de forma contígua.

**Evitar uma Pilha Estática quando:**
- O número de elementos que será armazenado não pode ser determinado com precisão.
- O tamanho da pilha pode variar durante a execução do programa (neste caso, uma pilha dinâmica seria mais apropriada).

A pilha estática é uma estrutura de dados eficiente e simples de implementar quando o número de elementos é fixo ou conhecido previamente. Sua implementação com um **array** permite que as operações principais (como empilhar e desempilhar elementos) sejam realizadas em tempo constante \(O(1)\). Porém, a principal limitação é a **falta de flexibilidade** quanto ao tamanho, o que torna essa estrutura menos adequada quando o número de elementos pode mudar de forma dinâmica durante a execução do programa.