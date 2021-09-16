fun main(){
    val dao = WrvrDAO()
    val derlys = Funcionario()
    derlys.nome = "Derlys"
    val mario = Funcionario()
    mario.nome = "Mario"
    val valeria = Funcionario()
    valeria.nome = "Valeria"
    dao.post(derlys)
    dao.post(mario)
    dao.post(valeria)
    println(dao.get())



}