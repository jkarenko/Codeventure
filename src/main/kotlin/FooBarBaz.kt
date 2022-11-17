class FooBarBaz {
    /**
     * Takes a number between 1 and 100 and starts counting from 1 to that number.
     * If the number is divisible by 3, it prints "Foo".
     * If the number is divisible by 5, it prints "Bar".
     * If the number is divisible by both 3 and 5, it prints "FooBar".
     * Otherwise, it prints the number.
     * @param number The number to count to.
     */
    fun `Need numbers printed, but only if not divisible by 3 or 5`(number: Int) {
        println(number)
    }


    /**
     * I have many names but a curse has befallen me, and now they are all scrambled up!
     * My first letter has switched places with the last.
     * My second letter has switched places with the second to last.
     * my... you get the idea. Please help me!
     * @param name The name to unscramble.
     * @return The unscrambled name.
     */
    fun `Help! I've been cursed and you must guess my name!`(name: String): String {
        return name
    }
}