class FooBarBaz {
    /**
     * Takes a number between 1 and 100 and starts counting from 1 to that number.
     * If the number is divisible by 3, it prints "Foo".
     * If the number is divisible by 5, it prints "Bar".
     * If the number is divisible by both 3 and 5, it prints "FooBar".
     * Otherwise, it prints the number.
     * @param number The number to count to.
     */
    fun fooBar(number: Int) {
        // your code here
        for (i in 1..number) {
            if (i % 3 == 0) {
                print("Foo")
            }
            if (i % 5 == 0) {
                print("Bar")
            }
            if (i % 3 != 0 && i % 5 != 0) {
                print(i)
            }
            println()
        }
    }
}