class PilhaDinamica : Empilhavel {
    private var topo: NoDuplo? = null
    private var tamanho: Int = 0

    override fun empilhar(dado: Any?) {
        val novoNo = NoDuplo(dado)
        if (topo != null) {
            novoNo.proximo = topo
            topo?.anterior = novoNo
        }
        topo = novoNo
        tamanho++
    }

    override fun desempilhar(): Any? {
        if (estaVazia()) {
            println("A pilha está vazia!")
            return null
        }
        val dadoRemovido = topo?.dado
        topo = topo?.proximo
        topo?.anterior = null
        tamanho--
        return dadoRemovido
    }

    override fun espiar(): Any? {
        if (estaVazia()) {
            println("A pilha está vazia!")
            return null
        }
        return topo?.dado
    }

    override fun atualizar(dado: Any?) {
        if (estaVazia()) {
            println("A pilha está vazia!")
            return
        }
        topo?.dado = dado
    }

    override fun estaCheia(): Boolean {
        // Como é dinâmica, não existe limite de tamanho, logo nunca está cheia.
        return false
    }

    override fun estaVazia(): Boolean {
        return topo == null
    }

    override fun imprimir(): String {
        if (estaVazia()) {
            return "A pilha está vazia!"
        }
        var resultado = "Pilha: "
        var atual = topo
        while (atual != null) {
            resultado += "${atual.dado} "
            atual = atual.proximo
        }
        return resultado.trim()
    }
}
