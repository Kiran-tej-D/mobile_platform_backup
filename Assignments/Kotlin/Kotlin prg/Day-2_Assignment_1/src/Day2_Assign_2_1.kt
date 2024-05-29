import java.time.LocalDate

class TransactionList {
    val transactions = mutableListOf<Transaction>()

    fun addTransaction(transaction: Transaction) {
        transactions.add(transaction)
    }

    fun deleteTransaction(transaction: Transaction) {
        transactions.removeIf { it.id == transaction.id }
    }

    fun editTransaction(oldTransaction: Transaction, newTransaction: Transaction) {
        val index = transactions.indexOfFirst { it.id == oldTransaction.id }
        if (index >= 0) {
            transactions[index] = newTransaction
        }
    }

    fun printTransactions() {
        println("Transactions:")
        for (transaction in transactions) {
            println(transaction)
        }
    }
}

data class Transaction(
    val id: String,
    val date: LocalDate,
    val amount: Double,
    val description: String
)

fun main() {
    val transactionList = TransactionList()

    println("Add transactions")
    transactionList.addTransaction(Transaction("1", LocalDate.of(2022, 1, 1), 100.0, "Rent"))
    transactionList.addTransaction(Transaction("2", LocalDate.of(2022, 2, 1), 50.0, "Groceries"))
    println("")
    println("Print the initial transaction list")
    transactionList.printTransactions()

    println("")
    println("Delete a transaction")
    val transactionToDelete = Transaction("1", LocalDate.of(2022, 1, 1), 100.0, "Rent")
    transactionList.deleteTransaction(transactionToDelete)
    transactionList.printTransactions()

    println("")
    println("Edit a transaction")
    val transactionToEdit = Transaction("2", LocalDate.of(2022, 2, 1), 50.0, "Groceries")
    val newTransaction = Transaction("2", LocalDate.of(2022, 2, 1), 75.0, "Groceries and more")
    transactionList.editTransaction(transactionToEdit, newTransaction)
    println("")
    println("Print the updated transaction list")
    transactionList.printTransactions()
}
