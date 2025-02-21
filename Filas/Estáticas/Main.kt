fun main() {
    val fila = FilaEstatica(3)  // Fila com capacidade de 3 elementos

    fila.enfileirar("Primeiro")
    fila.enfileirar("Segundo")
    fila.enfileirar("Terceiro")

    // Imprimindo a fila
    println("Fila: ${fila.imprimir()}")

    fila.enfileirar("Quarto")

    println("Primeiro elemento: ${fila.espiar()}")

    println("Elemento desenfileirado: ${fila.desenfileirar()}")

    println("Fila após desenfileirar: ${fila.imprimir()}")

    println("Tamanho da fila: ${fila.tamanho()}")

    fila.limpar()
    println("Fila após limpar: ${fila.imprimir()}")
}
