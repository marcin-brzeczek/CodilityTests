import java.util.Arrays;

public class FrogRiverOne {

    public int solution(int X, int A[]) {

        int size = A.length;
        int result = -1;
        int count = 0;

        //last element
        if (A[size - 1] == X)
            return A[size - 1];

//        //single element
//        if (A[0] != 1) {
//            return -1;
//        }

        //missing element
        int[] sortedArray = Arrays.copyOf(A, A.length);
        Arrays.sort(sortedArray);
        for (int i = 0; i < size - 1; i++) {
            if (sortedArray[i + 1] - sortedArray[i] > 1)
                return -1;
        }
        // first matched
        for (int i = 0; i < size; i++) {
            if (X == A[i]) {
                sortedArray = Arrays.copyOf(A, i + 1);
                Arrays.sort(sortedArray);
                for (int j = 0; j < sortedArray.length - 1; j++) {
                    if (sortedArray[j + 1] - sortedArray[j] > 1) {
                        X = sortedArray[j + 1] - 1;
                        count = 0;
                        break;
                    }
                    count++;
                }
                if (count == sortedArray.length - 1) {
                    return i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //Tests
        // 3, [1, 3, 1, 3, 2, 1, 3] (got 6 expected 4).
        // 4, [1, 1, 3, 1, 4, 3, 2, 5, 3, 4, 6, 7] = 6
        // 50, [12,34,45,11,100,83,2,3] = 5
        int result = new FrogRiverOne().solution(8, new int[]{6, 1, 3, 7, 4, 3, 2, 8, 5});
        System.out.println(result);
    }
}