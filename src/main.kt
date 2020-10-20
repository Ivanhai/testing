fun main(){
    println("заходите на peertube.yourfreedom.click")
    println("1: нет ты кто")
    println("2: нет")
    println("3: да")
    println("4: пока")
    var da = readLine()!!.toInt()
    when (da){
        1 -> {
            println("а ты кто")
            println("хз")
            println("а ну ладно")
        }
        2 -> {
            println("блиииин")
        }
        3 -> {
            println("аеееееее")
        }
        4 -> {
            println("пока")
        }
    }
}