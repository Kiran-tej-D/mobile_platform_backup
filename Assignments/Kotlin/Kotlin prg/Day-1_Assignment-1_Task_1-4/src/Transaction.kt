import java.time.LocalDate

data class transaction(val amount: Double, val Date: LocalDate, val category: String)

fun main() {
    val bill = transaction(amount = 1000.0, Date = LocalDate.now(), category = "Groceries");
    println(bill)
}


//OUTPUT
//transaction(amount=1000.0, Date=2024-05-16, category=Groceries)