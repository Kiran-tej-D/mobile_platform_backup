import java.time.LocalDate

data class Transaction(
    val id: String,
    val date: LocalDate,
    val amount: Double,
    val description: String
)

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

class User(
    val username: String,
    val password: String,
    val transactionList: TransactionList
) {
    fun login(username: String, password: String): Boolean {
        return this.username == username && this.password == password
    }

    fun displayExpenseSummary() {
        val totalExpenses = transactionList.transactions.filter { it.amount < 0.0 }.sumByDouble { -it.amount }
        println("Total expenses: $totalExpenses")
    }
}

fun main() {
    // Create a TransactionList object
    val transactionList = TransactionList()
    transactionList.addTransaction(Transaction("1", LocalDate.of(2022, 1, 1), -100.0, "Rent"))
    transactionList.addTransaction(Transaction("2", LocalDate.of(2022, 2, 1), -50.0, "Groceries"))
    transactionList.addTransaction(Transaction("3", LocalDate.of(2022, 3, 1), 200.0, "Salary"))

    // Create a User object
    val user = User("kiran", "123", transactionList)

    // Test login
    if (user.login("kiran", "123")) {
        println("Login successful")

        // Display expense summary
        user.displayExpenseSummary()
    } else {
        println("Invalid username or password")
    }
}
