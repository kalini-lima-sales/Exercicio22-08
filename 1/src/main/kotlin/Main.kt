fun main() {

    /*1) Crie uma classe cliente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto cliente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.*/

    val maria = Pessoa()
    maria.nome = "Maria"
    maria.cpf = "000000000-00"
    maria.idade = 22
    maria.sexo = "Feminino"
    maria.cep = "00000-000"
    println(maria.nome)


    println("Digite o nome de usuário: ")
    val nome = readln()
    println("Digite o seu e-mail: ")
    val email = readln()
    println("Digite a sua senha: ")
    val senha = readln()
    println("Digite o valor de seu cupom de desconto: ")
    val saldoCuponsDeDesconto = readln().toDouble()

    val cliente1 = AppHortifruti(
        nome, email,
        senha, true, 150.0
    )

    while (true) {

        println()

        println("1 - Adicionar produtos ao carrinho")
        println("2 - Efetuar pagamento")
        println("3 - Sair\n")

        print("Opção: ")

        when (readln().toInt()) {
            1 -> cliente1.adicionarAoCarrinho()

            2 -> cliente1.efetuarPagamento(0.0)

            3 -> break

            else -> println("Opção inválida!")

        }
    }
}
