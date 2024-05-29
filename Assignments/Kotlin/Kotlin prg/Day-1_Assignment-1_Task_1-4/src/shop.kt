import java.time.LocalDate

data class TransactionRecord(val amount: Double, val date: LocalDate)

fun categorizeTransaction(transaction: TransactionRecord): String {

    return when {
        transaction.amount < 0.0 -> "Invalid transaction amount"
        transaction.amount <= 100.0 -> "Food"
        transaction.amount <= 150.0 -> "Utilities"
        transaction.amount <= 500.0 -> "Entertainment"
        else -> "Other"
    }
}
fun main() {

    val transactions = listOf(
        TransactionRecord (90.00, LocalDate.now()),
        TransactionRecord (100.0, LocalDate.now()),
        TransactionRecord (150.0, LocalDate.now()),
        TransactionRecord (-10.0, LocalDate.now()),
        TransactionRecord (450.0, LocalDate.now())
    )
    transactions.forEachIndexed { index, transaction ->
        val category = categorizeTransaction(transaction)
        val ind: Int = index + 1
        println("DATE ${LocalDate.now()} Transaction ${ind} categorized as:   $category ")
    }
}


//OUTPUT
//DATE 2024-05-16 Transaction 1 categorized as:   Food
//DATE 2024-05-16 Transaction 2 categorized as:   Food
//DATE 2024-05-16 Transaction 3 categorized as:   Utilities
//DATE 2024-05-16 Transaction 4 categorized as:   Invalid transaction amount
//DATE 2024-05-16 Transaction 5 categorized as:   Entertainment