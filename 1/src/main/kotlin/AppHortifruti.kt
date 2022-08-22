class AppHortifruti (

    var nome: String,
    var email: String,
    var senha: String

) {


    //Construtores Secundários
    var cuponsDeDesconto = false
    var saldoCuponsDeDesconto = 0.0

    constructor(
        nome: String,
        email: String,
        senha: String,
        cuponsDeDesconto: Boolean,
        valorCuponsDeDesconto: Double
    ) : this(nome, email, senha) {
        this.cuponsDeDesconto = cuponsDeDesconto
        this.saldoCuponsDeDesconto = saldoCuponsDeDesconto
    }

    fun adicionarAoCarrinho(){
        println("Adicione os produtos ao carrinho: ")
        val produtos = readln()
    }

    fun efetuarPagamento(valor: Double){
        println("Insira o pagamento: ")
        val pagamento = readln().toDouble()
        if(pagamento > 0.0) {
            println("Pagamento efetuado. Compra realizada com sucesso!")
        }else{
            println("valor inválido! Compra não realizada.")
        }
    }
}
