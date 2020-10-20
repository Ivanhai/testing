fun main(){
    println("калькулятор")
    println("какое 1 число")
    var chislo1 = readLine()!!.toInt()
    println("какое 2 число")
    var chislo2 = readLine()!!.toInt()
    println("1: сложить")
    println("2: умножить")
    println("3: разделить")
    println("4: разность")
    println("че сделать")
    var da = readLine()!!.toInt()
    when (da){
        1 -> {
            println(chislo1 + chislo2)
        }
        2 -> {
            println(chislo1 * chislo2)
        }
        3 -> {
            println(chislo1 / chislo2)
        }
        4 -> {
            println(chislo1 - chislo2)
        }
    }
}
