enum class days(var color: String) {
    Sunday("yellow"),
    Monday("black"),
    Tuesday("red"),
    Wednesday("blue"),
    Thursday("orange"),
    Friday("white"),
    Saturday("green")
}
fun main(){
    var color = days.Sunday.color;
    println(color)
}