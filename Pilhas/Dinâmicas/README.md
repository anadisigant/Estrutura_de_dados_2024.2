# Pilhas Dinâmicas

## O que é uma Pilha Dinâmica?

É uma estrutura de dados linear que segue a regra **LIFO** (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido. A principal característica de uma pilha dinâmica é sua capacidade de **crescer ou diminuir** conforme necessário, sem um tamanho fixo, o que a torna mais flexível em comparação com a pilha estática.

Diferente da pilha estática, que tem um limite pré-definido, a pilha dinâmica pode adaptar seu tamanho de acordo com o número de elementos armazenados, o que a torna mais eficiente para situações em que o número de itens não é previsível ou varia durante a execução do programa.

A pilha dinâmica pode ser implementada usando uma **lista encadeada**, onde cada nó armazena um elemento e um ponteiro para o próximo nó. Isso permite que a pilha cresça e diminua conforme necessário.

## Características da Pilha Dinâmica

**Capacidade flexível**: O tamanho da pilha pode aumentar ou diminuir dinamicamente.<br>
**Armazenamento eficiente**: Utiliza uma estrutura de dados como **lista encadeada** ou **vetor redimensionável** para armazenar os elementos.<br>

**Operações principais**:
  - **Push**: Adiciona um novo elemento ao topo da pilha.
  - **Pop**: Remove o elemento do topo da pilha.
  - **Peek/Top**: Retorna o elemento do topo da pilha sem removê-lo.
  - **isEmpty**: Verifica se a pilha está vazia.

## Complexidade das Operações

As operações em uma pilha dinâmica são altamente eficientes, e todas as operações principais têm complexidade \(O(1)\):

| Operação    | Complexidade |
|-------------|--------------|
| **Push**    | \(O(1)\)     |
| **Pop**     | \(O(1)\)     |
| **Peek**    | \(O(1)\)     |
| **isEmpty** | \(O(1)\)     |


**Push** e **Pop**: Ambas as operações ocorrem em tempo constante, pois envolvem apenas a modificação do topo da pilha, sem necessidade de percorrer toda a estrutura de dados.<br>
**Peek**: Também é uma operação de tempo constante, pois não há modificação na estrutura; apenas lemos o valor do topo.<br>
**isEmpty**: Verifica se a pilha está vazia, o que também é feito em tempo constante.<br>

## Quando Usar uma Pilha Dinâmica?

A pilha dinâmica é ideal quando o número de elementos não pode ser determinado previamente ou pode mudar durante a execução do programa. Ela é especialmente útil em cenários onde o tamanho da pilha pode ser muito grande ou imprevisível.

**Usar uma Pilha Dinâmica quando:**
- O número de elementos a ser armazenado não é conhecido antecipadamente ou pode variar durante a execução.
- A estrutura de dados precisa crescer ou diminuir dinamicamente sem desperdício de memória.
- A flexibilidade é importante para o design do programa.

**Evitar uma Pilha Dinâmica quando:**
- O tamanho da pilha é fixo ou pode ser determinado facilmente, tornando o uso de uma pilha estática mais eficiente.
- A sobrecarga de gerenciamento de memória dinâmico (como alocação/desalocação de memória) pode ser um fator negativo em termos de desempenho.

A pilha dinâmica é uma solução eficiente e flexível para gerenciar dados de forma sequencial, especialmente quando o número de elementos varia durante a execução do programa. Sua implementação com lista encadeada permite que a pilha cresça e diminua sem a necessidade de alocar uma quantidade fixa de memória. As operações principais em pilhas dinâmicas são realizadas em tempo constante (\(O(1)\)), tornando-a uma escolha ideal para cenários que exigem flexibilidade e eficiência.