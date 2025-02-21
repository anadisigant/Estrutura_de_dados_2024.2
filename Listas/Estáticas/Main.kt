fun main() {
    val lista = ListaEstatica(5) 

    lista.anexar("A")
    lista.anexar("B")
    lista.anexar("C")
    lista.anexar("D")
    lista.anexar("E")

    println("Lista após anexar: ${lista.imprimir()}") // Esperado: [A, B, C, D, E]

    lista.anexar("F") // Deve exibir "Lista Cheia!"

    println("Elemento na posição 2: ${lista.selecionar(2)}") 

    lista.atualizar(1, "Z")
    println("Lista após atualização: ${lista.imprimir()}") // Esperado: [A, Z, C, D, E]

    val removido = lista.apagar(3)
    println("Elemento removido: $removido") // Esperado: D
    println("Lista após remoção: ${lista.imprimir()}") // Esperado: [A, Z, C, E]

    lista.inserir(1, "X")
    println("Lista após inserção: ${lista.imprimir()}") // Esperado: [A, X, Z, C, E]
}
