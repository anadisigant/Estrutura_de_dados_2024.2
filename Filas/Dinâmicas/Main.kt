fun main() {
    val fila = FilaDinamicaImpl()

    fila.enfileirar("Primeiro")
    fila.enfileirar("Segundo")
    fila.enfileirar("Terceiro")

    println("Fila: ${fila.imprimir()}")

    println("Primeiro elemento: ${fila.espiar()}")

    println("Elemento desenfileirado: ${fila.desenfileirar()}")

    println("Fila após desenfileirar: ${fila.imprimir()}")

    println("Tamanho da fila: ${fila.tamanho()}")

    fila.limpar()
    println("Fila após limpar: ${fila.imprimir()}")
}
