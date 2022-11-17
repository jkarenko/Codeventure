fun main() {
    println("""
        Greetings, Codeventurer!
        Stay a while and listen to my tale...
        
        This domain has seen a lot of troubles of late.
        Perhaps, if you are not too burdened, you might
        take a look at the town bulletin board system.
        
        There be many quests to undertake - please
        have a look!

    """.trimIndent())

    println("FooBarBaz Disctrict:")
    Class.forName("FooBarBaz").declaredMethods.forEach { println(it.name.prependIndent(" -> ")) }

}