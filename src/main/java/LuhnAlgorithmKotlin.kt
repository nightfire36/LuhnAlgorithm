
fun main() {

    val number = 92480
    val number2 = 924803

    System.out.println(LuhnAlgorithmKotlin().calculateChecksum(number))
    System.out.println(LuhnAlgorithmKotlin().isChecksumCorrect(number2))
}

class LuhnAlgorithmKotlin {

    fun calculateChecksum(number: Int, doubleOdd: Boolean = true): Int {
        val numberStr = number.toString().reversed()
        var doublePositions = 1
        if(!doubleOdd) {
            doublePositions = 0
        }
        var sum = 0

        for(i in numberStr.indices) {
            var numberAtI = Character.getNumericValue(numberStr[i])
            if((i + 1) % 2 == doublePositions) {
                numberAtI *= 2
            }
            if(numberAtI > 9) {
                numberAtI = numberAtI % 10 + 1
            }
            sum += numberAtI
        }

        var controlSum = sum % 10
        if(controlSum != 0) {
            controlSum = 10 - controlSum
        }

        return controlSum
    }

    fun isChecksumCorrect(number: Int): Boolean {
        return calculateChecksum(number, false) == 0
    }
}
