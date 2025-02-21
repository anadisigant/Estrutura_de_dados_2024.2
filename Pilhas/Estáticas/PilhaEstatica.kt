class PilhaEstatica(private val capacidade: Int) : Empilhavel {
    private val pilha: Array<Any?> = Array(capacidade) { null }
    private var topo: Int = -1

    override fun empilhar(dado: Any?) {
        if (estaCheia()) {
            println("A pilha está cheia!")
            return
        }
        pilha[++topo] = dado
        println("Elemento $dado empilhado.")
    }

    override fun desempilhar(): Any? {
        if (estaVazia()) {
            println("A pilha está vazia!")
            return null
        }
        val dadoRemovido = pilha[topo]
        pilha[topo--] = null
        return dadoRemovido
    }

    override fun espiar(): Any? {
        if (estaVazia()) {
            println("A pilha está vazia!")
            return null
        }
        return pilha[topo]
    }

    override fun atualizar(dado: Any?) {
        if (estaVazia()) {
            println("A pilha está vazia!")
            return
        }
        pilha[topo] = dado
    }

    override fun estaCheia(): Boolean {
        return topo == capacidade - 1
    }

    override fun estaVazia(): Boolean {
        return topo == -1
    }

    override fun imprimir(): String {
        if (estaVazia()) {
            return "A pilha está vazia!"
        }
        var resultado = "Pilha: "
        for (i in 0..topo) {
            resultado += "${pilha[i]} "
        }
        return resultado.trim()
    }
}