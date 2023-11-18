fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    /*
     * Name: Amanda
     * Age: 33
     * Likes to play tennis. Doesn't have a referrer.
     * 
     * Name: Atiqah
     * Age: 28
     * Likes to climb. Has a referrer named Amanda, who likes to play tennis.
    */
    fun showProfile() {
       val likes = "Likes to $hobby." ?: "Doesn't have a hobby." 
 	   val refername = referrer?.name 
       val referhobby = referrer?.hobby
       val refer = if (refername != null) "Has referrer named $refername, who"
        		   else "Doesn't have a referrer."
       val referlikes = if (referhobby != null) "likes to $referhobby."
        				else ""
        
       println("Name: $name")
       println("Age: $age")
       println("$likes $refer $referlikes\n")
    }
}