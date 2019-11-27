import java.util.Arrays;

public class PermCheck {
    public int solution(int A[]) {
        Arrays.sort(A);
        int size = A.length - 1;
        if (A[0] != 1)
            return 0;
        for (int i = 0; i < size ; i++) {
            if((A[i + 1] - A[i] != 1))
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int result = new PermCheck().solution(new int[]{1,3, 2, 4, 5});
        System.out.println(result);
    }
}
