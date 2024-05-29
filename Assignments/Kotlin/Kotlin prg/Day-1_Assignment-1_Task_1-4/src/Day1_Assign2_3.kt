import java.time.LocalDate

data class Values (
    val name: String,
    val date: LocalDate,
    val attendaceCount: Int
)

fun main(){
    val result = Values(
        "Kiran",
        LocalDate.now(),
        250
    )
    println("Name = ${result.name}\nDate = ${LocalDate.now()}\nAttendance Count = ${result.attendaceCount}")
}

//OUTPUT
//Name = Kiran
//Date = 2024-05-16
//Attendance Count = 250