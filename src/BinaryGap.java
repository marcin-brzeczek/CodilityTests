import java.util.Arrays;

public class BinaryGap {

    private int solution(int N) {
        String binaryValue = Integer.toBinaryString(N);

        System.out.println(binaryValue);

        int countContainsOnes = 0;
        int result = 0;
        char numbers[] = binaryValue.toCharArray();

        for (char number : numbers) {
            if (number == '1')
                countContainsOnes++;
        }

        System.out.println("Contains ones number: " + countContainsOnes);

        int[] resultNumbers = new int[countContainsOnes];
        int start = 1;

        if (countContainsOnes > 1) {
            for (int i = 0; i < countContainsOnes - 1; i++) {
                for (int j = start; j < numbers.length; j++) {
                    if (numbers[j] == '0') {
                        result++;
                    } else {
                        resultNumbers[i] = result;
                        System.out.println(result);
                        start = ++j;
                        break;
                    }
                }
                result = 0;
            }
            return Arrays.stream(resultNumbers).max().getAsInt();
        }
        return 0;
    }

    public static void main(String[] args) {

        int result = new BinaryGap().solution(66561);
//        int result = new Task1().solution(96561);
        System.out.println("Result: " + result);

    }
}
