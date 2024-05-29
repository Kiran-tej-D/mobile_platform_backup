class Practice2 {

    var brand: String = ""
    var model: String = ""
    var price: Double = 0.0

    fun getinfo(): String{
        return "The brand is: $brand\nThe model is: $model\nThe price is:  $price"
    }
}
fun main(){

    val car1 = Practice2()
    car1.brand = "KIA"
    car1.model = "sonet"
    car1.price = 10.0

    val car2 = Practice2()
    car2.brand = "TATA"
    car2.model = "punch"
    car2.price = 8.0

    val car3 = Practice2()
    car3.brand = "TATA"
    car3.model = "altroz"
    car3.price = 11.0

    val cars = arrayOf(car1, car2, car3)
    val comparator = compareBy<Practice2> { it.price}
    val HighPrice = cars.asList().stream().max(comparator).get()

    println(HighPrice.getinfo())
}