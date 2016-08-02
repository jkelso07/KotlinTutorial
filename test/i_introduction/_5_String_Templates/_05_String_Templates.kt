package i_introduction._5_String_Templates

import org.junit.Assert.*
import org.junit.Test
import java.util.regex.Pattern

class _05_String_Templates() {
    @Test fun match() {
        assertTrue(Pattern.compile(task5()).matcher("Douglas Adams (11 MAR 1952)").find())
    }

    @Test fun match1() {
        assertTrue(Pattern.compile(task5()).matcher("Stephen Fry (24 AUG 1957)").find())
    }

    @Test fun doNotMatch() {
        assertFalse(Pattern.compile(task5()).matcher("Stephen Fry (24 RRR 1957)").find())
    }

    @Test fun shouldConcatinateWithComma() {
        assertEquals("This is some text in which variables (a, b) appear.", example1("a", "b"))
    }

    @Test fun shouldConcatinateWithCommaJavaStyle() {
        assertEquals("You can write it in a Java way as well. Like this: a, b!", example2("a", "b"))
    }

    @Test fun shouldReturn40(){
        assertEquals("Any expression can be used: 40", example3(true, 40, 50))
    }

    @Test fun shouldReturn50(){
        assertEquals("Any expression can be used: 50", example3(false, 40, 50))
    }

    @Test fun shouldReturnBlockText(){
        assertEquals("\nYou can use raw strings to write multiline text.\nThere is no escaping here, so raw strings are useful for writing regex patterns,\nyou don't need to escape a backslash by a backslash.\nString template entries (42) are allowed here.\n", example4())
    }

    @Test fun shouldReturnTrue(){
        assertEquals(true, example())
    }
}