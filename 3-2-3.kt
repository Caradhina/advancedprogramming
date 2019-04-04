fun main(){
    val superheroes = arrayListOf("Superman","Spiderman","Wonderwoman","Thor","Black Panther","Batman","Catwoman","InvisibleWoman","Iron man","Hulk", "Aquaman")
    val power = arrayListOf(100, 85, 90, 95, 80 ,92 ,75 ,92, 97, 85, 75)
    val gender = arrayListOf("M","M","F","M","M","M","F","F","M","M","M")
    
    val a: Int = 5
    println("Details of Batman")
    println()
    println("Name:${superheroes[a]}")
    println("Power:${power[a]}")
    println("Gender:${gender[a]}")
    println()
    
    
    val b: Int=100
    var c: Int
    c = 0
    for(i in power){
        if(power[c] == b){
            println("Hero who has the power $b is ${superheroes[c]}")
            break
        }
        else{
            c++
        }
        
    }
}