class FilaEstatica(private val capacidade: Int) : FilaDinamica {
    private var fila: Array<Any?> = Array(capacidade) { null }
    private var inicio: Int = 0
    private var fim: Int = 0
    private var tamanho: Int = 0

    override fun enfileirar(dado: Any?) {
        if (estaCheia()) {
            println("Fila cheia! Não é possível enfileirar o elemento.")
            return
        }
        fila[fim] = dado
        fim = (fim + 1) % capacidade
        tamanho++
    }

    override fun desenfileirar(): Any? {
        if (estaVazia()) {
            println("Fila vazia! Não há elementos para desenfileirar.")
            return null
        }
        val dadoRemovido = fila[inicio]
        fila[inicio] = null // Limpar a posição
        inicio = (inicio + 1) % capacidade
        tamanho--
        return dadoRemovido
    }

    override fun espiar(): Any? {
        return if (estaVazia()) {
            println("Fila vazia!")
            null
        } else {
            fila[inicio]
        }
    }

    override fun tamanho(): Int {
        return tamanho
    }

    override fun estaVazia(): Boolean {
        return tamanho == 0
    }

    override fun estaCheia(): Boolean {
        return tamanho == capacidade
    }

    override fun imprimir(): String {
        if (estaVazia()) return "Fila vazia"
        val elementos = mutableListOf<Any?>()
        var i = inicio
        for (j in 0 until tamanho) {
            elementos.add(fila[i])
            i = (i + 1) % capacidade
        }
        return elementos.joinToString(" -> ")
    }

    override fun limpar() {
        fila.fill(null) // Limpa todos os elementos do array
        inicio = 0
        fim = 0
        tamanho = 0
    }
}
