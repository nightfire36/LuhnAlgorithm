
public class LuhnAlgorithmJava {

    public int calculateChecksum(int number, boolean doubleOdd) {
        String numberStr = new StringBuilder(String.valueOf(number)).reverse().toString();
        int doublePositions = 1;
        if(!doubleOdd) {
            doublePositions = 0;
        }

        int sum = 0;

        for(int i = 0; i < numberStr.length(); i++) {
            int numberAtI = Character.getNumericValue(numberStr.charAt(i));
            if((i + 1) % 2 == doublePositions) {
                numberAtI *= 2;
            }
            if(numberAtI > 9) {
                numberAtI = numberAtI % 10 + 1;
            }
            sum += numberAtI;
        }

        int controlSum = sum % 10;
        if(controlSum != 0) {
            controlSum = 10 - controlSum;
        }

        return controlSum;
    }

    public int calculateChecksum(int number) {
        return calculateChecksum(number, true);
    }

    public boolean isChecksumCorrect(int number) {
        return calculateChecksum(number, false) == 0;
    }

    public static void main(String[] args) {
        int number = 92480;

        int number2 = 924803;

        System.out.println(new LuhnAlgorithmJava().calculateChecksum(number));
        System.out.println(new LuhnAlgorithmJava().isChecksumCorrect(number2));
    }
}
