```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val sum = list.sum()
    println(sum) // Output: 15

    val average = list.average()
    println(average) // Output: 3.0

    val emptyList = emptyList<Int>()
    val emptyListSum = if (emptyList.isEmpty()) 0 else emptyList.sum() //Safe handling for empty list
    println(emptyListSum) // Output: 0
    val emptyListAverage = if (emptyList.isEmpty()) 0.0 else emptyList.average() //Safe handling for empty list
    println(emptyListAverage) // Output: 0.0
}
```