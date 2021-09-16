class WrvrDAO {

    companion object{
        private val lista: MutableList<Funcionario> = arrayListOf()
        private var idCounter = 1
    }
    fun get():List<Funcionario>{
        return ArrayList(lista)
    }
    fun post(funcionario: Funcionario){
        funcionario.id = idCounter
        lista.add(funcionario)
        idCounter++
    }
    fun put(funcionario: Funcionario){

        var funcionarioEncontrado: Funcionario? = null

        for(a in lista){

            if (a.id == funcionario.id){
                funcionarioEncontrado = a
            }
            if (funcionarioEncontrado != null){
                val listPosition = lista.indexOf(funcionarioEncontrado)
                lista[listPosition] = funcionario
            }
        }

    }
}