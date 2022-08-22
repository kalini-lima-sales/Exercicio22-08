class PatineteEletrico (
    val nome: String,
    val marca: String,
    val modelo: String,
    val ano: Int,
    val cor: String,
    val numeroDoItem: String
    ) {

    var ligado = false

    fun ligarDesligar(){
        if(ligado) {
            ligado = false
            println("Patinete ligado!")
        }else{
            ligado = true
            println("Patinete desligado.")
        }
    }

}