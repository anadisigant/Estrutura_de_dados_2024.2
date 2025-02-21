# Pilhas

## O que é uma Pilha?

É uma estrutura de dados linear que segue a regra **LIFO** (Last In, First Out - O último a entrar é o primeiro a sair). Ela é amplamente utilizada em várias áreas da computação, como na implementação de chamadas de funções, navegação em histórico, undo/redo em aplicativos, entre outros.

### Características da Pilha

**Top (Topo)**: O elemento mais recentemente adicionado à pilha.
**Bottom (Base)**: O elemento mais antigo na pilha.<br>

**Operações principais**:
  - **Push**: Adiciona um elemento no topo da pilha.
  - **Pop**: Remove o elemento do topo da pilha.
  - **Peek/Top**: Retorna o elemento do topo sem removê-lo.
  - **isEmpty**: Verifica se a pilha está vazia.
  - **isFull**: Verifica se a pilha está cheia (no caso de pilha estática).

## Tipos de Pilhas

As pilhas podem ser implementadas de diferentes maneiras, sendo as mais comuns:

### 1. **Pilha Estática**
A pilha estática tem um tamanho fixo, determinado no momento da criação. Ela é comumente implementada usando um array ou lista mutável, e o número de elementos que ela pode armazenar é limitado.

### 2. **Pilha Dinâmica**
A pilha dinâmica pode crescer ou diminuir conforme a necessidade, ou seja, seu tamanho não é fixo. Ela é geralmente implementada com listas encadeadas, permitindo que elementos sejam adicionados ou removidos facilmente.

## Complexidade das Operações

| Operação    | Complexidade |
|-------------|--------------|
| **Push**    | \(O(1)\)     |
| **Pop**     | \(O(1)\)     |
| **Peek**    | \(O(1)\)     |
| **isEmpty** | \(O(1)\)     |
| **isFull**  | \(O(1)\) (somente em pilhas estáticas) |


**Push** e **Pop**: São operações de tempo constante (\(O(1)\)) porque envolvem apenas modificações no topo da pilha, seja empilhando ou desempilhando elementos.<br>
**Peek**: Também é uma operação de tempo constante (\(O(1)\)) porque não envolve a alteração de elementos, apenas a leitura do topo.<br>
**isEmpty** e **isFull**: São verificações simples que podem ser feitas em tempo constante.

## Quando Usar uma Pilha?

A pilha é útil quando o objetivo é gerenciar dados de maneira sequencial, mas de forma controlada, onde o último dado inserido é o primeiro a ser removido.

**Usar uma Pilha quando:**
- A ordem de processamento dos dados deve ser inversa (último a entrar, primeiro a sair).
- O histórico de operações deve ser mantido (exemplo: navegação em páginas da web, controle de desfazer/refazer).
- A estrutura de dados precisa ser simples, sem a necessidade de indexação direta.

**Evitar uma Pilha quando:**
- A estrutura de dados precisa de acesso rápido a elementos específicos em posições arbitrárias (neste caso, outras estruturas como listas ou filas podem ser mais adequadas).
- O número de elementos a ser armazenado é muito grande ou imprevisível, especialmente em pilhas estáticas, onde o tamanho é fixo.

A pilha é uma estrutura de dados fundamental em muitos algoritmos e aplicações de software. Sua principal característica é o acesso sequencial baseado na regra LIFO, onde o último elemento adicionado é o primeiro a ser removido. A escolha entre pilha estática e dinâmica depende do contexto em que ela será usada e das limitações de tamanho e flexibilidade necessárias. As operações em pilhas são eficientes, com a maioria das operações principais ocorrendo em tempo constante \(O(1)\).