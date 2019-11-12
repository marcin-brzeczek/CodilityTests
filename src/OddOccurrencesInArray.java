import java.util.ArrayList;

public class OddOccurrencesInArray {

    public int solution(int[] A) {

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    ++count;
                }
            }
            if (count == 1) {
                return A[i];
            } else {
                count = 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int result = new OddOccurrencesInArray().solution(new int[]{9, 3, 11, 3, 5, 5, 9});
        System.out.println(result);
    }
}
