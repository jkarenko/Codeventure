import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

import org.testng.Assert.*
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class FooBarBazTest {
    private var outContent = ByteArrayOutputStream()
    private val errContent = ByteArrayOutputStream()
    private val originalOut: PrintStream = System.out
    private val originalErr: PrintStream = System.err
    private val foo = FooBarBaz()
    private val br = System.lineSeparator()
    private val comparison = listOf(
        "1",
        "2",
        "Foo",
        "4",
        "Bar",
        "Foo",
        "7",
        "8",
        "Foo",
        "Bar",
        "11",
        "Foo",
        "13",
        "14",
        "FooBar",
        "16",
        "17",
        "Foo",
        "19",
        "Bar",
        "Foo",
        "22",
        "23",
        "Foo",
        "Bar",
        "26",
        "Foo",
        "28",
        "29",
        "FooBar",
        "31",
        "32",
        "Foo",
        "34",
        "Bar",
        "Foo",
        "37",
        "38",
        "Foo",
        "Bar",
        "41",
        "Foo",
        "43",
        "44",
        "FooBar",
        "46",
        "47",
        "Foo",
        "49",
        "Bar",
        "Foo",
        "52",
        "53",
        "Foo",
        "Bar",
        "56",
        "Foo",
        "58",
        "59",
        "FooBar",
        "61",
        "62",
        "Foo",
        "64",
        "Bar",
        "Foo",
        "67",
        "68",
        "Foo",
        "Bar",
        "71",
        "Foo",
        "73",
        "74",
        "FooBar",
        "76",
        "77",
        "Foo",
        "79",
        "Bar",
        "Foo",
        "82",
        "83",
        "Foo",
        "Bar",
        "86",
        "Foo",
        "88",
        "89",
        "FooBar",
        "91",
        "92",
        "Foo",
        "94",
        "Bar",
        "Foo",
        "97",
        "98",
        "Foo",
        "Bar"
    )

    @BeforeMethod
    fun setUp() {
        System.setOut(PrintStream(outContent))
        System.setErr(PrintStream(errContent))
    }

    @AfterMethod
    fun tearDown() {
        outContent = ByteArrayOutputStream()
        System.setOut(originalOut)
        System.setErr(originalErr)
    }

    @Test
    fun `Should print 1`() {
        val n = 1
        foo.`Need numbers printed, but only if not divisible by 3 or 5`(n)
        assertEquals(outContent.toString(), comparison.subList(0, 1).joinToString { it + br }, "Unexpected output.")
    }

    @Test
    fun `Should print from 1 to 100 correctly`() {
        val n = 100
        foo.`Need numbers printed, but only if not divisible by 3 or 5`(n)
        assertEquals(outContent.toString(), comparison.subList(0, n).joinToString(br) + br)
    }

    @Test
    fun `Should print from 1 to a random number correctly`() {
        val random = (1..100).random()
        foo.`Need numbers printed, but only if not divisible by 3 or 5`(random)
        assertEquals(outContent.toString(), comparison.subList(0, random).joinToString(br) + br)
    }

    @Test
    fun `Should unscramble morg`() {
        val name = "morg"
        val expected = "grom"
        assertEquals(foo.`Help! I've been cursed and you must guess my name!`(name), expected)
    }

    @Test
    fun `Should unscramble doowle`() {
        val name = "doowle"
        val expected = "elwood"
        assertEquals(foo.`Help! I've been cursed and you must guess my name!`(name), expected)
    }

    @Test
    fun `Should unscramble random name`() {
        val name = (1..(5..10).random()).map { ('a'..'z').random() }.joinToString("")
        val expected = name.reversed()
        assertEquals(foo.`Help! I've been cursed and you must guess my name!`(name), expected)
    }
}