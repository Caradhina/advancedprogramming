fun main(){
    val superheroes = arrayListOf("Superman","Spiderman","Wonderwoman","Thor","Black Panther","Batman","Catwoman","InvisibleWoman","Iron man","Hulk", "Aquaman")
    val power = arrayListOf(100, 85, 90, 95, 80 ,92 ,75 ,92, 97, 85, 75)
    val gender = arrayListOf("M","M","F","M","M","M","F","F","M","M","M")
   /* val hero = ArrayList<HashMap<String, Any>>()
    val size: Int
    
    size = superheroes.size - 1
    for(i in 0..size){
        for(i in 0..size) hero.add(hashMapOf("name" to superheroes[i], "power" to power[i], "gender" to gender[i]))
    }
    */
    println("List of all superheroes")
    for(i in 0..10){
        println("${superheroes[i]}-${power[i]}-${gender[i]}")
    }
    println("List of all Male heroes")
    val a = "M"
    for(i in 0..10){
        if(gender[i] == a){
            println("${superheroes[i]}")
        }
    }
    println("List of superheroes who has above 90 power")
    for(i in 0..10){
        if(power[i] >= 90){
            println("${superheroes[i]}")
        }
    }
}