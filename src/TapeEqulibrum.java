import java.util.Arrays;

public class TapeEqulibrum {

    public int solution(int[] A) {
        int partOne = 0;
        int partTwo = 0;
        int difference;
        int N = A.length;
        int arrayLength = N - 1;
        int[] arrayPartOne = new int[arrayLength];
        int[] arrayPartTwo = new int[arrayLength];
        int[] arrayDifferences = new int[arrayLength];

        for (int P = 1; P < N; P++) {
            partOne = partOne + A[P - 1];
            arrayPartOne[P - 1] = partOne;

            partTwo = partTwo + A[N - P];
            arrayPartTwo[N - P - 1] = partTwo;
        }

        for (int i = 0; i < arrayLength; i++) {
            difference = arrayPartOne[i] - arrayPartTwo[i];
            if (difference < 0)
                difference = difference * -1;
            arrayDifferences[i] = difference;
        }

        if (arrayDifferences.length == 1) {
            return arrayDifferences[0];
        }
        Arrays.sort(arrayDifferences);
        return arrayDifferences[0];
    }

    public static void main(String[] args) {
        int result = new TapeEqulibrum().solution(new int[]{3, 1, 2, 4, 3});

        System.out.println(result);
    }
}