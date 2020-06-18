import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LuhnAlgorithmTest {

    private val luhnAlgorithm = LuhnAlgorithmKotlin()

    @Test
    fun calculateChecksum1() {
        assertEquals(3, luhnAlgorithm.calculateChecksum(542943730))
    }

    @Test
    fun calculateChecksum2() {
        assertEquals(6, luhnAlgorithm.calculateChecksum(898217038))
    }

    @Test
    fun calculateChecksum3() {
        assertEquals(8, luhnAlgorithm.calculateChecksum(118059058))
    }

    @Test
    fun calculateChecksum4() {
        assertEquals(0, luhnAlgorithm.calculateChecksum(741169828))
    }

    @Test
    fun calculateChecksum5() {
        assertEquals(1, luhnAlgorithm.calculateChecksum(2147483647))
    }

    @Test
    fun calculateChecksum6() {
        assertEquals(4, luhnAlgorithm.calculateChecksum(3))
    }

    @Test
    fun calculateChecksum7() {
        assertEquals(3, luhnAlgorithm.calculateChecksum(51))
    }

    @Test
    fun calculateChecksum8() {
        assertEquals(0, luhnAlgorithm.calculateChecksum(0))
    }

    @Test
    fun calculateChecksum9() {
        assertEquals(8, luhnAlgorithm.calculateChecksum(1000000))
    }

    @Test
    fun isChecksumCorrect1() {
        assertEquals(true, luhnAlgorithm.isChecksumCorrect(29089422))
    }

    @Test
    fun isChecksumCorrect2() {
        assertEquals(false, luhnAlgorithm.isChecksumCorrect(29089423))
    }

    @Test
    fun isChecksumCorrect3() {
        assertEquals(true, luhnAlgorithm.isChecksumCorrect(513))
    }

    @Test
    fun isChecksumCorrect4() {
        assertEquals(true, luhnAlgorithm.isChecksumCorrect(179102942))
    }
}
