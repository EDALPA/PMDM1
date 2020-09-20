import javax.swing.tree.RowMapper

fun main() {
    println("Hello World.")
    println("number of a's = " + countAs("Mary got married"))
    assignReadersToBooks()
    printStringLength("This is a test")
    printStringLength(null)
    exercise1()
    exercise2()
    println(exercise3(19503863))
    exercise5("Mary got married")
    //println("Concatenation: " + concatenate("hello", null))
}

// TODO: 1.- Write a function called exercise1()
// that prints the numbers from 1 to 10 with
// println() and invoke it from main().
// Look for how to make a “for” loop here:
// https://kotlinlang.org/docs/reference/control-flow.html

fun exercise1(){
    println("\n**Exercise 1**")

    for(i in 1..10){
        println(i)
    }
}

// TODO: 2.- Uncomment this function:
fun exercise2() {
    println("\n**Exercise 2**")
    var month = 1
    while(month != 0) {
        println("Enter the number of the month (0 to finish)")
        val monthStr = readLine()
        if (month > 0 && month <= 12) {
            month = monthStr!!.toInt() // Don't worry about the !! yet. We will study it later
            // TODO: 2 write the number of days that has that month, using the "when" structure
            // You can read about it here:
            // https://kotlinlang.org/docs/reference/control-flow.html
            // take into account that some months have 30, others 31 and one 28 or 29.
            // Invoke the function from main()
            fun p(str: String){
                println(str)
            }
            when (month){
                2 -> p("28")
                4,6,9,10,11 -> p("30")
                1,3,5,7,8,12 -> p("31")
                else -> if (month > 12){
                    p("There are only 12 months!\n")
                    month = 1
                }
            }
        }
    }
}


// TODO: 3 Write a function called exercise3()
// that accepts a  number and returns a String
// that represents the corresponding NIF (number + letter)
// https://www.ordenacionjuego.es/en/calculo-digito-control
// https://kotlinlang.org/docs/reference/basic-types.html#arrays

fun exercise3 (number: Int): String {
    println("\n**Exercise 3**")
    println("Input number: "+number)
    var letter : String = "NIF: "+number.toString()
    when (number%23) {
        0-> letter += "T"
        1-> letter += "R"
        2-> letter += "W"
        3-> letter += "A"
        4-> letter += "G"
        5-> letter += "M"
        6-> letter += "Y"
        7-> letter += "F"
        8-> letter += "P"
        9-> letter += "D"
        10-> letter += "X"
        11-> letter += "B"
        12-> letter += "N"
        13-> letter += "J"
        14-> letter += "Z"
        15-> letter += "S"
        16-> letter += "Q"
        17-> letter += "V"
        18-> letter += "H"
        19-> letter += "L"
        20-> letter += "C"
        21-> letter += "K"
        22-> letter += "E"
    }
    return letter
}

// TODO: 4 Modify this function abbreviating it with "=" as return type
// (simplification 2)
// https://developer.android.com/kotlin/learn#simplifying
// Note: You can remove the : Int in the declaration
/*
fun countAs(str: String): Int {
    val count = str.count { c -> c == 'a' }
    return count
}
*/
fun countAs(str: String) = str.count { c -> c == 'a' }


/*
fun stringMapper(str: String, mapper: (String) -> Int): Int {
    return mapper(str)
}
*/

fun stringMapper(str: String, mapper: (String) -> Int) = mapper(str)


// TODO 5: Write a function called exercise5()
// In it you will invoke the function stringMapper declared above twice.
// The first one with a function that returns the number of characters
// and the second one with a function that returns the number of a’s.
// Print its results.

fun exercise5(str : String){
    println("\n**Exercise 5**\nText: "+str)
    println("Number of characters: "+stringMapper(str, {str -> str.length}))
    println("Number of a's: "+stringMapper(str, {str -> str.count{c -> c == 'a'}}))

}

data class Reader(val name: String, val age: Int)
// TODO 6: Create a data class Book that has 2 parameters
// title as a String that can not be modified (read only)
// and reader as a Reader
fun assignReadersToBooks() {
    val reader1 = Reader("John", 23)
    val reader2 = Reader("Mary", 34)


    // TODO 6: Uncomment these sentences
    // val book1 = Book("The name of the wind", reader1)
    // book1.reader = reader2
}

// TODO 7: Write the body of this function
// That prints the length of the string parameter.
// If the string is null, print 0
fun printStringLength(string: String?) {
    // Body
}

// TODO 8: Write a method concatenate() that concatenates 2 Strings
// received as parameters.
// If a String is null, convert it to “”.
// This is the invocation:
// println("Concatenation: " + concatenate("hello", null))
