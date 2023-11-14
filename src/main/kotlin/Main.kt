import kotlin.concurrent.thread


fun main(){
//    Mensagem de boas vindas
    println("===================[ Auto escola Machado ]=======================")
    println("Seja bem vindo a nossa auto escola")

//    Colocando delay
    Thread.sleep(5000)

//    Começando o formulario
    println("Por favor para comerçarmos digite seu nome:")
     val nome = readLine()!!.toString()

    Thread.sleep(1000)

    println("Digite seu sobrenome")
    val sobrenome = readLine()!!.toString()

    Thread.sleep(1000)

    println("Digite sua idade:")
    val idade = readLine()!!.toInt()

    Thread.sleep(1000)

    println("Nome da sua mãe:")
    val nomeMae = readLine()!!.toString()

    Thread.sleep(1000)

    println("Nome do seu Pai:")
    val nomePai = readLine()!!.toString()

    Thread.sleep(1000)

    println("Cidade atual:")
    val cidade = readLine()!!.toString()

    Thread.sleep(1000)

    println("Cidade Natal:")
    val cidadeNatal = readLine()!!.toString()

    Thread.sleep(1000)

    println("Certo, Agora vamos conferir esses dados!")

    Thread.sleep(10000)

    verificarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
}


fun categorias(){
    println("[A] Motocicletas")
    println("[B] Automóveis")
    println("[C] Caminhões")
    println("[D] Ônibus")
    println("[E] Reboque")
    var categoria = readLine()!!.toString()

    if (categoria.equals("A", ignoreCase = true)){
        println("Que legal que você quer tirar habilitação de motocicletas!!")
        Thread.sleep(1000)
        println("A hablitação de motocicleta esta saindo por R$: 1.000,00")
        Thread.sleep(1000)
        println("Você gostaria de comprar? (Sim - Não)")
        val comprar = readLine()!!.toString()
    } else if (categoria.equals("B", ignoreCase = true)) {
        println("Que legal que você quer tirar habilitação de Automóveis!!")
        Thread.sleep(1000)
        println("A hablitação de motocicleta esta saindo por R$: 1.200,00")
        Thread.sleep(1000)
        println("Você gostaria de comprar? (Sim - Não)")
        val comprar = readLine()!!.toString()
    } else if (categoria.equals("C", ignoreCase = true)) {
        println("Que legal que você quer tirar habilitação de Caminhões!!")
        Thread.sleep(1000)
        println("A hablitação de motocicleta esta saindo por R$: 1.400,00")
        Thread.sleep(1000)
        println("Você gostaria de comprar? (Sim - Não)")
        val comprar = readLine()!!.toString()
    } else if (categoria.equals("D", ignoreCase = true)) {
        println("Que legal que você quer tirar habilitação de Ônibus!!")
        Thread.sleep(1000)
        println("A hablitação de motocicleta esta saindo por R$: 1.600,00")
        Thread.sleep(1000)
        println("Você gostaria de comprar? (Sim - Não)")
        val comprar = readLine()!!.toString()
    } else if (categoria.equals("E", ignoreCase = true)) {
        println("Que legal que você quer tirar habilitação de Reboque!!")
        Thread.sleep(1000)
        println("A hablitação de motocicleta esta saindo por R$: 2.000,00")
        Thread.sleep(1000)
        println("Você gostaria de comprar? (Sim - Não)")
        val comprar = readLine()!!.toString()
    }
}

fun verificarDados(nome: String, sobrenome: String, idade: Int, nomeMae: String, nomePai: String, cidade: String, cidadeNatal: String){

    println("")
    println("================================================")
    println("Seu nome: $nome $sobrenome")
    println("================================================")
    println("Sua idade: $idade")
    println("================================================")
    println("Nome da sua mãe: $nomeMae")
    println("================================================")
    println("Nome do seu pai: $nomePai")
    println("================================================")
    println("Cidade atual: $cidade")
    println("================================================")
    println("Cidade Natal: $cidadeNatal")
    println("================================================")

    Thread.sleep(2000)

    println("Esses dados estão corretos? (Sim - Não)")
    var verificar = readLine()!!.toString()


    if (verificar.equals("Sim", ignoreCase = true) || verificar.equals("S", ignoreCase = true)){
        println("Certo!!, agora vamos escolher uma categoria da sua habilitação.")
        Thread.sleep(5000)
        categorias()
    } else if (verificar.equals("Não", ignoreCase = true) || verificar.equals("N", ignoreCase = true)) {
        println("Certo!, Digite abaixo qual dado deseja alterar.")

        Thread.sleep(1000)

        alterarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    }
}

fun alterarDados(nome: String, sobrenome: String, idade: Int, nomeMae: String, nomePai: String, cidade: String, cidadeNatal: String){

    println("[1] Nome")
    println("[2] Sobrenome")
    println("[3] Idade")
    println("[4] Mãe")
    println("[5] Pai")
    println("[6] Cidade Atual")
    println("[7] Cidade Naal")
    var alterarDados = readLine()!!.toInt()

    if (alterarDados == 1){
        println("Digite o seu nome:")
        val nome = readLine()!!.toString()
        verificarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    } else if (alterarDados == 2){
        println("Digite o seu Sobrenome:")
        val sobrenome = readLine()!!.toString()
        verificarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    } else if (alterarDados == 3){
        println("Digite sua Idade:")
        val idade = readLine()!!.toInt()
        verificarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    } else if (alterarDados == 4){
        println("Digite o nome da sua mãe:")
        val nomeMae = readLine()!!.toString()
        verificarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    } else if (alterarDados == 5){
        println("Digite o nome do seu pai:")
        val nomePai = readLine()!!.toString()
        verificarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    } else if (alterarDados == 6){
        println("Digite sua cidade Atual:")
        val cidadeAtual = readLine()!!.toString()
        verificarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    } else if (alterarDados == 7){
        println("Digite sua cidade Natal:")
        val cidadeNatal = readLine()!!.toString()
        verificarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    } else {
        println("Opção Invalida!!")
        Thread.sleep(2000)
        alterarDados(nome, sobrenome, idade, nomeMae, nomePai, cidade, cidadeNatal)
    }
}