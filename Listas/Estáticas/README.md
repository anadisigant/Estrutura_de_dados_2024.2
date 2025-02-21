# LISTAS ESTÁTICAS

## O que é uma Lista Estática?

É uma estrutura de dados linear que armazena elementos em um bloco contíguo de memória. O tamanho da lista é definido no momento da alocação e não pode ser alterado durante a execução do programa.

## Características da Lista Estática

**Acesso direto aos elementos**: Cada elemento pode ser acessado diretamente pelo seu índice.<br>
**Tamanho fixo**: O tamanho deve ser definido no momento da criação.<br>
**Eficiência no acesso**: Como os elementos são armazenados em posições contíguas de memória, o acesso é rápido. <br>
**Dificuldade em inserções e remoções**: Como o tamanho é fixo, operações que exigem realocação podem ser custosas.<br>

## Complexidade das Operações

| Operação       | Complexidade |
|---------------|-------------|
| Acesso (A[i]) | \(O(1)\)    |
| Busca         | \(O(n)\)    |
| Inserção no início | \(O(n)\)    |
| Inserção no fim    | \(O(1)\) (se houver espaço) |
| Remoção do início  | \(O(n)\)    |
| Remoção do fim     | \(O(1)\)    |

**Acesso**: O acesso direto a um elemento é \(O(1)\), pois basta calcular o endereço na memória.<br>
**Busca**: Como os elementos não estão organizados de forma a facilitar buscas rápidas, a busca linear \(O(n)\) é necessária na maioria dos casos.<br>
**Inserção e Remoção**: Operações no início exigem deslocamento de todos os elementos subsequentes, resultando em \(O(n)\). No final, se houver espaço disponível, podem ser feitas em \(O(1)\). <br>

## Quando Usar Listas Estáticas?

- Quando o número de elementos é conhecido previamente.
- Quando há necessidade de acesso rápido a elementos específicos.
- Quando há poucas inserções e remoções dinâmicas.

Listas estáticas são eficientes para acesso direto e manipulação de dados quando o tamanho é fixo e bem definido. No entanto, para operações frequentes de inserção e remoção, outras estruturas como listas encadeadas podem ser mais adequadas.