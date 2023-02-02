//fun main(){
  //  println("Hello wi");
  //  sayHellokotlin();
//}

//fun sayHellokotlin(){
  //  println("Hello! Kotlin");
//}

/*fun main(){

    var username: String = "Harsh"
    println("Hello $username.");

}*/

/*fun main(){

    var username: String = "Harsh"
    println("Hello \$username.");

}*/

// Variables
/*fun main(){

    val username: String = "Harsh"
    var age: Int = 25

    println("Hello $username. I am $age old. In 2 years, I will be ${age+2}");

}*/

//Datatypes
/*fun main() {
    val exampleString = "\"Florian\nWalther\""
    val exampleRawString = """ "Florian
Walther" """
    print(exampleRawString)

    val exampleNumber: Double
    exampleNumber = 2_000_000.12
    val exampleLong: Long = exampleNumber.toLong()

    val exampleChar = '?'
    val exampleInt: Int = exampleChar.toInt()

    val exampleBoolean = false
}*/

//OPerators
/*
fun main() {
    var a = 5
    val b = 3.0

    println("a = " + a + " b = " + b)

    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    println("(2 + 2) * 3 = ${(2 + 2) * 3}")

    println("-a = ${-a}")

    a += 2
    println("a += 2: $a")

    println("a++: ${a++}")
    println("++a: ${++a}")

    a -= 2
    println("a -= 2: $a")

    println("a--: ${a--}")
    println("--a: ${--a}")

    a *= 2
    println("a *= 2: $a")

    a /= 2
    println("a /= 2: $a")

    a %= 2
    println("a %= 2: $a")
}
*/

//Array
/*
fun main() {
    val names = arrayOf("Jim", "John", "Jenny", "Jamie")

    names[0] = "Jeremy"

    println("Number of elements: ${names.size}")
    println("First element: ${names[0]}")
    println("Last element: ${names[2]}")
}
*/

//Loop
/*
fun main() {
    val names = arrayOf("Jim", "John", "Jenny", "Jamie")

    //for (name in names) println(name)

    for(index in names.indices){
        println("Index: $index Element: ${names[index]}")
    }
    //for (i in 1..10) println(i)

    //for (i in 1 until 10) println(i)

    //for (i in 10L downTo 1) println(i)

    //for (i in 'a'..'z' step 2) println(i)
}
*/

//Comparision and Logical
/*
fun main() {
    println("2 > 1 is ${2 > 1}")
    println("2 < 1 is ${2 < 1}")
    println("1 >= 1 is ${1 >= 1}")

    println("1 == 1 is ${1 == 1}")
    println("1 == 2 is ${1 == 2}")
    println("1 != 2 is ${1 != 2}")

    println("!(2 > 1) is ${!(2 > 1)}")

    println("true && false = ${true && false}")
    println("true || false = ${true || false}")

    val condition = (2 > 1) || (3 > 2) && (2 > 3)
    println(condition)
}

 */

//while and do while loop
/*
fun main() {
    var i = 0

    outer@ do {
        println(i)
        i++
        //continue

        var j = 0

        while (j < 5) {
            println("---$j")
            j++
            break@outer
            println("I'm not printed")
        }

        println("I'm printed")

    } while (i < 5)

    var number = 8
}
*/

//If/Else
/*
fun main() {
    for (i in 1..10) {

        val prefix = if (i == 1) {
            "*"
        } else if (i !in 4..7) {
            "-"
        } else {
            print("-")
            ">"
        }

        println("$prefix $i")
    }

    val time = 10
}
 */

// use of When
/*
fun main() {
    val time = 14
    val isSunday = true

    val greeting = when {
        isSunday -> "I'm gonna stay in bed all day!"
        time < 5 -> "Why up so early?"
        in 0..11 -> "Good morning!"
        12 -> "Time for lunch!"
        13, 14 -> {
            println("Yawn...")
            "Time for a nap!"
        }
        else -> "Good day!"
    }

    println(greeting)
}
 */

// Function parameter
/*
fun main() {
    greet("Herbert", 5)
}

fun greet(name: String, reps: Int) {
    var repsLeft = reps

    while (repsLeft > 0) {
        println("Hello, $name! Nice to meet you!")
        repsLeft--
    }
}
 */

//Function Return
/*
fun main(): Unit {
    val max = getMax(12, 2)
    println(max)
}

fun getMax(num1: Int, num2: Int): Int {
    if (num1 > num2) {
        return num1
    } else {
        return num2
    }

    println("This will not be printed")
}

 */

//Single Expression
/*
fun main() {
    println(double(12))
}

fun double(num: Int) = num * 2
 */

//Overloading
/*
fun main() {
    println(getMax(14, 100, 9))
}

fun getMax(a: Int, b: Int) = if (a > b) a else b

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int) =
    when {
        a >= b && a >= c -> a
        b >= a && b >= c -> b
        else -> c
    }

fun greet(name: String, reps: Int) {
    for (i in 0 until reps) println("Hello, $name!")
}

fun greet(message: String, reps: Int) {
    for (i in 0 until reps) println(message)
}
 */


//default value
/*
fun main() {
    greet(
        "How are you?",
        name = "Hans",
        reps = 3
    )
}

fun greet(message: String, name: String = "User", reps: Int = 1) {
    for (i in 0 until reps) println("Hello, $name! $message")
}

 */

//Vararg
/*
fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6)

    println(getSum(10, 20, *array, 30, b = 40))
}

fun getSum(a: Int, vararg numbers: Int, b: Int): Int {
    var sum = a + b

    for (number in numbers) sum += number

    return sum
}
 */

// Const Val
/*
const val STRING_CONSTANT = "I am a constant"

fun main() {
    println(STRING_CONSTANT)

    println(getMax(900, 4000, 50, 10, 11, 2))
}

fun getMax(first: Int, vararg remaining: Int): Int {
    println(STRING_CONSTANT)

    var max = first

    for (i in remaining) {
        if (i > max) max = i
    }

    return max
}
 */

//opps
/*
const val STRING_CONSTANT = "I am a constant"

fun main() {
    println(STRING_CONSTANT)

    println(getMax(900, 4000, 50, 10, 11, 2))
}

fun getMax(first: Int, vararg remaining: Int): Int {
    println(STRING_CONSTANT)

    var max = first

    for (i in remaining) {
        if (i > max) max = i
    }

    return max
}
 */

// creating class
/*
fun main() {
    val user1 = User("Hans", 30)

    println("user name: ${user1.name}")
    println("user age: ${user1.age}")

    val user2 = User("Elfriede", 60)

    println("user name: ${user2.name}")
    println("user age: ${user2.age}")
}

class User(val name: String, var age: Int) {
}

 */

//In blocks
/*
fun main() {
    val user1 = User("   Hans   ", 30)
    val user2 = User("  Elfriede   ", 60)
    val user3 = User(age = 60)
    val user4 = User("    ", 20)
}

class User(name: String = "No Name", var age: Int) {
    init {
        print("New user created. Age: $age,")
    }

    val name: String

    init {
        if (name.isBlank()) {
            this.name = "No Name"
        } else {
            this.name = name.trim()
        }

        println(" Name: ${this.name}")
    }
}
 */