import java.util.Scanner;
fun main(){

    // Assigning the values
    println("enter the value of a & b")
    var sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = a + b
    println("the sum is : $c")
    println()


    // Switch case in Kotlin
    print("enter the day :")
    val day = sc.nextInt()
    val week = when(day){
        1-> "Sunday"
        2-> "Monday"
        3-> "Tuesday"
        4-> "Wednesday"
        5-> "Thursday"
        6-> "Friday"
        7-> "Saturday"

        else -> "invalid day"
    }
    println("The day is $week")
    println()

    //printing the characters
    print("Printing the Alphabets: ")
    for (ch in 'a'..'x'){
        print("$ch, ");
    }
    println()
    println()
    //Working with Strings
    val firstName: String = "Kiran "
    val lastName: String = "Tej. D"
    println("The first name is: $firstName")
    println("The last name is: $lastName")
    println("Full name is: ${firstName + lastName}")

    //For loop for multiplication
    println("")
    print("Enter the value you want to multiplication: ")
    var mul = sc.nextInt()
    println("the multiplication of $mul is")
    for(i in 1..10){
        println("$mul X $i = ${mul*i}");
    }
    println()

    //if condition
    var age = 25
    if(age >18){
        println("Eligible to vote")
    }else
        println("not eligible to vote")


    // working with arrays
    println()
    var cars = arrayOf("JAGUAR","LEXUS","AUDI","ROLLS ROYCE")
    print("The cars are : ")
    for(car in cars){
        print("$car ")
    }
    println()

    // Increment and Decrement
    println()
    var i = 5
    var d = 5
    var  sum = i.dec() + d.inc()
    println("The sum of i and d is: $sum")
    println("The value of i is: ${i.dec()}")
    println("The value of d is: ${d.inc()}")
}