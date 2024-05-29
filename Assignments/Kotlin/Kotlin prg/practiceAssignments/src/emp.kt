data class emp(val name: String, val salary: Double, val role:String)

fun getEmp(name: String, salary: Double, role: String): emp {
    return emp(name, salary, role)
}

fun main() {
    val emp1 = emp("Kiran", 120.0, "Trainer")
    val emp2 = emp("Sreedhar", 110.0, "Developer")
    val emp3 = emp("Somu", 100.0, "Tester")

    val (name, salary, role) = getEmp("Kiran", 120.0, "Trainer");
    println("$name, $salary, $role")

}