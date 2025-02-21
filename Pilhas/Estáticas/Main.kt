fun main() {
    val pilha = PilhaEstatica(5)

    println(pilha.imprimir()) // Pilha está vazia

    pilha.empilhar(10)
    pilha.empilhar(20)
    pilha.empilhar(30)

    println(pilha.imprimir()) // Pilha: 10 20 30

    println("Topo da pilha: ${pilha.espiar()}") // Topo: 30

    pilha.atualizar(99)
    println("Após atualizar o topo: ${pilha.imprimir()}") // Pilha: 10 20 99

    pilha.desempilhar()
    println("Após desempilhar: ${pilha.imprimir()}") // Pilha: 10 20

    println("Topo da pilha: ${pilha.espiar()}") // Topo: 20
}