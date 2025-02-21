class ListaDinamica : Listavel {

    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0

    override fun estaCheia(): Boolean {
        return false  // Como a lista é dinâmica, ela nunca estará "cheia".
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun anexar(dado: Any?) { // Inserção no final
        if (dado != null) {
            val novoNo = NoDuplo(dado)
            novoNo.anterior = ponteiroFim
            if (!estaVazia()) 
                ponteiroFim?.proximo = novoNo
            else 
                ponteiroInicio = novoNo

            ponteiroFim = novoNo
            quantidade++
        } else {
            println("Dado inválido!")
        }
    }

    override fun selecionarTodos(): Array<Any?> { 
        val dadosAux: Array<Any?> = arrayOfNulls(quantidade)
        if (!estaVazia()) {
            var ponteiroAuxiliar = ponteiroInicio
            for (i in 0 until quantidade) {
                dadosAux[i] = ponteiroAuxiliar?.dado
                ponteiroAuxiliar = ponteiroAuxiliar?.proximo
            }
        } else {
            println("Lista Vazia!")
        }
        return dadosAux
    }

    override fun selecionar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0 until posicao) {
                    ponteiroAux = ponteiroAux?.proximo
                }
                dadoAux = ponteiroAux?.dado
            } else {
                println("Posição Inválida")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoAux
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0 until posicao) {
                    ponteiroAux = ponteiroAux?.proximo
                }
                ponteiroAux?.dado = dado
            } else {
                println("Posição Inválida")
            }
        } else {
            println("Lista Vazia!")
        }
    }

    override fun apagar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAuxiliar = ponteiroInicio
                for (i in 0 until posicao)
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo

                dadoAux = ponteiroAuxiliar?.dado

                val ponteiroAnterior = ponteiroAuxiliar?.anterior
                val ponteiroProximo = ponteiroAuxiliar?.proximo

                if (ponteiroAnterior != null)
                    ponteiroAnterior.proximo = ponteiroProximo
                else
                    ponteiroInicio = ponteiroInicio?.proximo

                if (ponteiroProximo != null)
                    ponteiroProximo.anterior = ponteiroAnterior
                else
                    ponteiroFim = ponteiroFim?.anterior

                quantidade--
            } else {
                println("Índice Inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoAux
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if (dado != null) {
            if (posicao >= 0 && posicao <= quantidade) {
                val noTemp = NoDuplo(dado)

                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo = ponteiroInicio

                for (i in 0 until posicao) {
                    ponteiroAnterior = ponteiroProximo
                    ponteiroProximo = ponteiroProximo?.proximo
                }

                if (ponteiroAnterior != null)
                    ponteiroAnterior.proximo = noTemp
                else
                    ponteiroInicio = noTemp

                if (ponteiroProximo != null)
                    ponteiroProximo.anterior = noTemp
                else
                    ponteiroFim = noTemp

                noTemp.proximo = ponteiroProximo
                noTemp.anterior = ponteiroAnterior

                quantidade++
            } else {
                println("Índice Inválido!")
            }
        } else {
            println("Dado inválido!")
        }
    }

    override fun imprimir(): String {
        var ponteiroAuxiliar = ponteiroInicio
        var resultado = "["
        for (i in 0 until quantidade) {
            resultado += ponteiroAuxiliar?.dado
            if (i != quantidade - 1)
                resultado += ", "

            ponteiroAuxiliar = ponteiroAuxiliar?.proximo
        }
        return "$resultado]"
    }
}