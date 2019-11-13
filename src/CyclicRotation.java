import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        if (K > 0) {
            int size = A.length;
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    newArray[i] = A[size - 1];
                } else {
                    newArray[i] = A[i - 1];
                }
            }
            --K;
            return solution(newArray, K);
        }
        return A;
    }

    //should return [9, 7, 6, 3, 8].
    public static void main(String[] args) {

        int[] result1 = new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 3);

        System.out.println(Arrays.toString(result1));
    }
}