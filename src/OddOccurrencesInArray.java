import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution(int[] A) {

        Arrays.sort(A);
        int i= 0;
        while (i < A.length - 1 && A[i] == A[i + 1]) {
            i = i + 2;
        }
        return A[i];
    }

    public static void main(String[] args) {
        int result = new OddOccurrencesInArray().solution(new int[]{9, 3, 1, 3, 5, 5, 9});
        System.out.println(result);
    }
}
