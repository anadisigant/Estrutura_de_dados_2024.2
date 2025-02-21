# FILAS ESTÁTICAS

## O que é uma Fila Estática?

É uma estrutura de dados linear que segue a política **FIFO** (First In, First Out), ou seja, o primeiro elemento a ser inserido será o primeiro a ser retirado. A diferença principal entre uma fila estática e uma dinâmica é que a fila estática possui um tamanho fixo, definido no momento da criação. Ou seja, seu número de elementos não pode exceder o tamanho predefinido.

## Como Funciona?

Em uma fila estática:
- **Inserção (Enfileirar)**: Quando um novo elemento é adicionado à fila, ele é colocado no final.
- **Remoção (Desenfileirar)**: Quando um elemento é removido, ele é retirado do início da fila.
- **Espiar**: Permite verificar o primeiro elemento da fila sem removê-lo.

Por ser estática, a fila tem um tamanho fixo, e caso a capacidade máxima seja atingida, qualquer tentativa de inserir um novo elemento resultará em erro.

## Estrutura

Uma fila estática é geralmente implementada usando um **vetor** ou **array**. O vetor tem uma capacidade fixa definida no momento da criação e armazena os elementos da fila. 

## Operações Principais

Aqui estão as operações comuns realizadas em filas estáticas e suas respectivas complexidades:

| Operação             | Fila Estática (Vetor) |
|----------------------|-----------------------|
| **Inserção (Enfileirar)**   | \(O(1)\)             |
| **Remoção (Desenfileirar)** | \(O(1)\)             |
| **Espiar (Olhar o primeiro)** | \(O(1)\)             |
| **Verificar se está vazia** | \(O(1)\)             |

**Inserção**: Adicionar um elemento ao final da fila (enfileirar) é uma operação constante \(O(1)\), desde que a fila não tenha atingido sua capacidade máxima.

**Remoção**: Remover um elemento do início da fila (desenfileirar) também é uma operação constante \(O(1)\), já que a remoção ocorre no primeiro índice do vetor.

**Espiar**: Obter o primeiro elemento da fila sem removê-lo também é feito em tempo constante \(O(1)\), acessando diretamente o primeiro índice do vetor.

**Verificar se está vazia**: Verificar se a fila está vazia é uma operação constante \(O(1)\), checando se o índice do primeiro elemento é maior do que o índice do último elemento.

## Tipos de Implementação

Filas estáticas podem ser implementadas de diferentes formas, dependendo de como o vetor é estruturado:

**Fila Simples**:
   - Os elementos são armazenados em um vetor, e os índices de inserção e remoção são controlados por variáveis de controle.

**Fila Circular**:
   - A fila pode ser implementada de maneira circular, onde, ao atingir o final do vetor, a inserção de novos elementos pode continuar a partir do início do vetor, desde que existam espaços disponíveis.

## Vantagens das Filas Estáticas

**Simplicidade**: A implementação de uma fila estática é mais simples em comparação com a fila dinâmica, já que não há manipulação de ponteiros ou alocação dinâmica de memória.

**Acesso rápido**: Como a fila é implementada usando um vetor, o acesso a qualquer elemento pode ser feito rapidamente, e as operações de enfileirar e desenfileirar são eficientes.

**Previsibilidade de memória**: Como a fila tem tamanho fixo, a quantidade de memória necessária para sua implementação é bem definida desde o início, o que pode ser útil em sistemas com recursos limitados.

## Desvantagens das Filas Estáticas

**Limitação de capacidade**: A principal desvantagem das filas estáticas é que o tamanho da fila é fixo. Se o número de elementos crescer além da capacidade pré-definida, a fila não poderá armazenar mais elementos.

**Desperdício de memória**: Se a fila não for completamente preenchida, a memória alocada para a fila pode ser desperdiçada, pois o tamanho máximo é fixo, independentemente do número de elementos armazenados.

## Quando Usar uma Fila Estática?

**Usar uma fila estática** quando:
  - O número de elementos na fila é conhecido de antemão ou não vai variar muito ao longo do tempo.
  - A implementação simples e eficiente é uma prioridade, sem a necessidade de ajustar o tamanho da fila.
  - O gerenciamento de memória precisa ser previsível, sem a sobrecarga de alocação dinâmica.

As **filas estáticas** são ideais para cenários em que a quantidade de dados a ser armazenada é previsível ou limitada, e a simplicidade de implementação é um fator importante. Elas oferecem um bom desempenho em termos de tempo de execução e uso de memória, mas têm limitações quanto ao tamanho fixo e ao desperdício de espaço se não forem totalmente utilizadas.