data class Transactions(val date: String, val amount: Double)

fun main() {
    val transactions = listOf(
        Transactions("2024-05-10", 100.0),
        Transactions("2024-05-12", 75.0),
        Transactions("2024-05-15", 150.0),
        Transactions("2024-05-08", 50.0),
        Transactions("2024-05-20", 200.0)
    )

    println("Original Transactions:")
    transactions.forEach { println(it) }

    val sortedByDate = sortTransactions(transactions) { it.date }
    println("\nTransactions Sorted by Date:")
    sortedByDate.forEach { println(it) }

    val sortedByAmount = sortTransactions(transactions) { it.amount }
    println("\nTransactions Sorted by Amount:")
    sortedByAmount.forEach { println(it) }
}

fun <T : Comparable<T>> sortTransactions(transactions: List<Transactions>, selector: (Transactions) -> T): List<Transactions> {
    return transactions.sortedBy(selector)
}
