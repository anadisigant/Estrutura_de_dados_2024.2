interface FilaDinamica {
    // Métodos principais
    fun enfileirar(dado: Any?)            
    fun desenfileirar(): Any?            
    fun espiar(): Any?                 

    // Métodos auxiliares
    fun tamanho(): Int                  
    fun estaVazia(): Boolean           
    fun imprimir(): String              

    // Método para limpar a fila
    fun limpar()                       
}
