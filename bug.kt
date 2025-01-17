```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val sum = list.sum()
    println(sum) // Output: 15

    val average = list.average()
    println(average) // Output: 3.0

    //This line is problematic
    val emptyList = emptyList<Int>()
    val emptyListSum = emptyList.sum()
    println(emptyListSum) // Throws java.lang.UnsupportedOperationException: Empty collection
}
```