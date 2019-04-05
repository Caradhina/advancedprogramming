interface Grade{
    var a: Int
    var b: Int
    var c: Int
    
    fun total(){
        println("Total grade is: ${a + b + c}")
    }
    fun ave(){
        println("Average grade is: ${(a + b + c)/3}")
    }
    fun max(){
        if(a > b){
            if(a > c){
                println("Max value of CS is $a")
            }
            else{
                println("Max value of CS is $c")
            }
        }
        else{
            if(b > c){
                println("Max value of CS is $b")
            }
            else{
                println("Max value of CS is $c")
            }
        }
    }
    fun min(){
        if(a < b){
            if(a < c){
                println("Min value of CS is $a")
            }
            else{
                println("Min value of CS is $c")
            }
        }
        else{
            if(b < c){
                println("Min value of CS is $b")
            }
            else{
                println("Min value of CS is $c")
            }
        }
    }
}
class CS: Grade{
    override var a: Int = 100
    override var b: Int = 70
    override var c: Int = 85
    
}
class EE: Grade{
    override var a: Int = 85
    override var b: Int = 71
    override var c: Int = 70
}
fun main(){
    var grade1 = CS()
    var grade2 = EE()
	grade1.total()
    grade1.ave()
    grade1.max()
    println()
    grade2.total()
    grade2.ave()
    grade2.min()
    
}