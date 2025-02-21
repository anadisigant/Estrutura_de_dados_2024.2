fun main() {
    val lista = ListaDinamica<Int>()
    lista.anexar(10)
    lista.anexar(20)
    lista.anexar(30)
    println(lista.imprimir())  // Saída: [10, 20, 30]
}