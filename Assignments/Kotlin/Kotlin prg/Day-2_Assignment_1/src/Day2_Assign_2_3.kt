import java.util.*

data class Transac(val id: Int, val amount: Double, val date: Date, val category: String)

class TransacList {
    private val transactions = mutableListOf<Transac>()
    private var nextId = 1

    fun addTransaction(amount: Double, date: Date, category: String) {
        val transaction = Transac(nextId++, amount, date, category)
        transactions.add(transaction)
        println("Transaction added successfully.")
    }

    fun filterTransactions(predicate: (Transac) -> Boolean): List<Transac> {
        return transactions.filter(predicate)
    }

    fun sortTransactions(comparator: Comparator<Transac>) {
        transactions.sortWith(comparator)
    }

    fun printTransactions() {
        println("\nTransactions:")
        transactions.forEach { println(it) }
    }
}

fun main() {
    val transactionList = TransacList()

    // Add some transactions
    transactionList.addTransaction(100.0, Date(1621234567890), "Groceries")
    transactionList.addTransaction(50.0, Date(1622345678901), "Entertainment")
    transactionList.addTransaction(80.0, Date(1623456789012), "Utilities")

    // Filter transactions by category "Groceries"
    println("\nFiltering transactions by category 'Groceries':")
    val groceriesTransactions = transactionList.filterTransactions { it.category == "Groceries" }
    groceriesTransactions.forEach { println(it) }

    // Sort transactions by date
    println("\nSorting transactions by date:")
    transactionList.sortTransactions(compareBy { it.date })
    transactionList.printTransactions()

    // Sort transactions by amount in descending order
    println("\nSorting transactions by amount (descending):")
    transactionList.sortTransactions(compareByDescending { it.amount })
    transactionList.printTransactions()
}
