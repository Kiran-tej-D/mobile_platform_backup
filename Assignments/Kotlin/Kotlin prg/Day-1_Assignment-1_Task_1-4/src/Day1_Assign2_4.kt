import java.time.LocalDate
data class Event(
    val name: String,
    val date: LocalDate,
    val attendeeCount: Int
)
fun main() {
    println("Enter the event name:")
    val name = readLine()

    println("Enter the event date (yyyy-MM-dd):")
    val dateInput = readLine()
    val date = LocalDate.parse(dateInput)

    println("Enter the attendee count:")
    val attendeeCountInput = readLine()
    val attendeeCount = attendeeCountInput?.toIntOrNull() ?: 0

    val event = Event(name ?: "", date, attendeeCount)
    println("Created new event:\n$event")
}


//OUTPUT
//Enter the event name:
//kiran
//Enter the event date (yyyy-MM-dd):
//2024-05-22
//Enter the attendee count:
//500
//Created new event:
//Event(name=kiran, date=2024-05-22, attendeeCount=500)