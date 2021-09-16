abstract class Funcionario{
    var nome: String = ""
    var cpf: String = ""
    var salario: Double = 0.0
    var tipo: Int = 0
    var id: Int =0
    override fun toString(): String {
        return id.toString()
    }
    //0 funcionario, 1 gerente, 2 diretor
    fun bonificacao(): Double {
        //return salario * 0.1
        when (tipo) {
            0 -> {
                return salario * 0.1
            }
            1 -> {
                return salario * 0.2
            }
            else -> {
                return salario * 0.3
            }
        }
    }
    fun autentica(senha: Int){
        if(tipo == 1){
            // pode autenticar
        }
    }
}