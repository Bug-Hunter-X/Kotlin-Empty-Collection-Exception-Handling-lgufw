# Kotlin Empty Collection Exception Handling
This example demonstrates a common error in Kotlin when working with collections:  Attempting to calculate the sum or average of an empty collection results in an `UnsupportedOperationException`.  The solution shows how to safely handle this scenario by checking for emptiness before performing the calculation.

## Bug
The `bug.kt` file shows the problematic code.  The `emptyList.sum()` call throws an exception when the list is empty.  The solution demonstrates a safe approach.