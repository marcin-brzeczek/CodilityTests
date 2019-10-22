import java.util.Arrays;
import java.util.Collections;

public class Task1 {


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

        if (countContainsOnes > 1) {
            for (int i = 0; i < countContainsOnes - 1; i++) {
                for (int j = 1; j < numbers.length; j++) {
                    if (numbers[j] == '0') {
                        result++;
                    }else
                        break;
                }
                resultNumbers[i] = result;
                System.out.println(result);
                result = 0;
            }
            return Arrays.stream(resultNumbers).max().getAsInt();
        }

        return 0;
    }

    public static void main(String[] args) {

        int result = new Task1().solution(1041);

    }
}
