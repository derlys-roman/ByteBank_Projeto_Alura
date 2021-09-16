fun main(){
    /*
    Caracteristicas do funcionario padrao:
    var nome: String = ""
    var cpf: String = ""
    var salario: Double = 0.0
    var tipo: Int = 0
    var id: Int =0
    tipos de funcionario: 0 funcionario, 1 gerente, 2 diretor

     */
    val dao = WrvrDAO()
    val derlys = Estagiario()
    derlys.cpf = "789238978-43"
    derlys.nome = "Derlys"
    derlys.salario = 1580.90
    derlys.tipo = 0
    val mario = Estagiario()
    mario.nome = "Mario"
    val valeria = Estagiario()
    valeria.nome = "Valeria"
    dao.post(derlys)
    dao.post(mario)
    dao.post(valeria)
    println(dao.get())



}