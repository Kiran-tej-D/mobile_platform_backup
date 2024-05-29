import java.util.Scanner

data class Employee
    (
    val EmpId: Int,
    var Name: String,
    var Role: String,
    var Salary: Double
)

class empSys {
    private val employees = mutableListOf<Employee>()
    private var Id = 1

    fun addEmp(Name: String, Role: String, Salary: Double) {
        val employee = Employee(Id++, Name, Role, Salary)
        employees.add(employee)
        println()
        println("Employee added successfully in data.")
    }

    fun delEmp(EmpId: Int) {
        val employeeIndex = employees.indexOfFirst { it.EmpId == EmpId }
        if (employeeIndex != -1) {
            employees.removeAt(employeeIndex)
            println("Employee deleted successfully in data.")
        } else {
            println("Employee not found...!!")
        }
    }

    fun displayEmp() {
        if (employees.isEmpty()) {
            println("No employees found.")
        } else {
            println("Employee List:-")
            for (employee in employees) {
                println("ID: ${employee.EmpId}\nName: ${employee.Name}\nRole: ${employee.Role}\nSalary: ${employee.Salary}")
            }
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val empSystem = empSys()

    while (true) {
        println("\nEmployee Management System")
        println("1. Add Employee")
        println("2. Delete Employee")
        println("3. Display Employees")
        println("4. Exit")
        println()
        print("Enter your Choice: ")


        when (sc.nextInt()) {
            1 -> {
                print("Enter Employee Name: ")
                val Name = sc.next()
                print("Enter Employee Role: ")
                val Role = sc.next()
                print("Enter Employee Salary: ")
                val Salary = sc.nextDouble()
                empSystem.addEmp(Name, Role, Salary)
            }

            2 -> {
                print("Enter employee ID to delete: ")
                val id = sc.nextInt()
                empSystem.delEmp(id)
            }

            3 -> {
                empSystem.displayEmp()
            }

            4 -> {
                println("Exiting...")
                return
            }

            else -> {
                println("Invalid choice. Please try again and enter valid choice")
            }
        }
    }
}
