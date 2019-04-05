open class Grade(a: Int, b: Int, c: Int){
    init {
        println("Total grade is ${a + b + c}")
        println("Average grade is ${(a + b + c)/3}")
    }
}
class CS(java: Int, python: Int, web: Int): Grade(java, python, web){
    fun max(){
        val java = 100
        val python = 80
        val web = 90
        var max: Int = 0
        if(java > python && java > web){
            max = java
        }
        else{
            if(python > web){
                max = python
            }
            else{
                max = web
            }
        }
        println("Max value of CS is:$max")
    }
}
class EE(listening: Int, writing: Int, reading: Int): Grade(listening, writing, reading){
    fun min(){
        val listening = 80
        val writing = 75
        val reading = 90
        var min: Int = 0
        if(listening < writing && listening < reading){
            min = listening
        }
        else{
            if(writing < reading){
                min = writing
            }
            else{
                min = reading
            }
        }
       println("Min value of EE is $min")
    }
}
fun main(){
    val t1 = CS(100, 80 ,90)
    t1.max()
    println()
    
    val t2 = EE(80, 75, 90)
    t2.min()
}