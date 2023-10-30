import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun testMainFunction() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        System.setOut(printStream)

        main(arrayOf())

        val printedText = outputStream.toString().trim()

        System.setOut(System.out)

        assertEquals("Hello World!", printedText)
    }
}