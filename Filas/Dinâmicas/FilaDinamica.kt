class FilaDinamica : Enfileiravel {
    private var inicio: NoDuplo? = null
    private var fim: NoDuplo? = null
    private var tamanho: Int = 0

    // Método para inserir um elemento no final da fila (enfileirar)
    override fun enfileirar(dado: Any?) {
        val novoNo = NoDuplo(dado)
        if (fim == null) {
            // Se a fila estiver vazia, o novo nó é tanto o início quanto o fim
            inicio = novoNo
            fim = novoNo
        } else {
            // Caso contrário, adiciona o novo nó no final
            fim?.proximo = novoNo
            novoNo.anterior = fim
            fim = novoNo
        }
        tamanho++
    }

    // Método para remover e retornar o primeiro elemento da fila (desenfileirar)
    override fun desenfileirar(): Any? {
        if (estaVazia()) return null

        val dadoRemovido = inicio?.dado
        inicio = inicio?.proximo

        // Se o início ficou nulo após a remoção, a fila ficou vazia, então o fim também deve ser nulo
        if (inicio == null) {
            fim = null
        } else {
            inicio?.anterior = null
        }

        tamanho--
        return dadoRemovido
    }

    // Método para espiar o primeiro elemento da fila (sem removê-lo)
    override fun espiar(): Any? {
        return inicio?.dado
    }

    // Método para retornar o número de elementos na fila
    override fun tamanho(): Int {
        return tamanho
    }

    // Método para verificar se a fila está vazia
    override fun estaVazia(): Boolean {
        return tamanho == 0
    }

    // Método para imprimir todos os elementos da fila
    override fun imprimir(): String {
        val elementos = mutableListOf<Any?>()
        var atual = inicio
        while (atual != null) {
            elementos.add(atual.dado)
            atual = atual.proximo
        }
        return elementos.joinToString(" -> ")
    }

    override fun limpar() {
        inicio = null
        fim = null
        tamanho = 0
    }
}
