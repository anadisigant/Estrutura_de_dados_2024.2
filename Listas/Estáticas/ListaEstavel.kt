class ListaEstatica(private val tamanho: Int = 10) : Listavel {
    private val dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0

    override fun estaCheia(): Boolean = quantidade == tamanho

    override fun estaVazia(): Boolean = quantidade == 0

    override fun anexar(dado: Any?) {
        if (!estaCheia()) {
            dados[quantidade] = dado
            quantidade++
        } else {
            println("Lista Cheia!")
        }
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if (!estaCheia() && posicao in 0..quantidade) {
            for (i in quantidade downTo posicao + 1) {
                dados[i] = dados[i - 1]
            }
            dados[posicao] = dado
            quantidade++
        } else {
            println("Índice inválido ou lista cheia!")
        }
    }

    override fun selecionar(posicao: Int): Any? {
        return if (posicao in 0 until quantidade) dados[posicao] else null.also { println("Posição inválida!") }
    }

    override fun selecionarTodos(): Array<Any?> = dados.copyOfRange(0, quantidade)

    override fun atualizar(posicao: Int, dado: Any?) {
        if (posicao in 0 until quantidade) {
            dados[posicao] = dado
        } else {
            println("Posição inválida!")
        }
    }

    override fun apagar(posicao: Int): Any? {
        return if (posicao in 0 until quantidade) {
            val removido = dados[posicao]
            for (i in posicao until quantidade - 1) {
                dados[i] = dados[i + 1]
            }
            dados[quantidade - 1] = null
            quantidade--
            removido
        } else {
            println("Posição inválida!")
            null
        }
    }

    override fun imprimir(): String = dados.copyOfRange(0, quantidade).joinToString(prefix = "[", postfix = "]")
}