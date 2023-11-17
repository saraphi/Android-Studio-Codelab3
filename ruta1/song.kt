class Song(
    val title: String, 
    val artist: String,
    val date: Int,
    val reproductions: Int
) {
    var isPopular = if (reproductions < 1000) false
    				else true
    
    fun printDescription() {
        println("$title, interpretada por $artist, se lanzó en $date")
    }
}

fun main() {
    val song = Song("Ancient Dreams in a Modern Land", "MARINA", 2021, 10000000)
    song.printDescription()
}