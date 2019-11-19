import java.util.Arrays;

public class PermCheck {

    public int solution(int A[]) {
        Arrays.sort(A);

        int size = A.length - 1;
        for (int i = 0; i < size && (A[i + 1] - A[i] != 1); i++) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int result = new PermCheck().solution(new int[]{4});
        System.out.println(result);
    }
}
