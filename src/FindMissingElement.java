import java.util.Arrays;

public class FindMissingElement {

    public int solution(int[] A) {
        Arrays.sort(A);
        int result = 0;
        int size = A.length;
        if(A.length == 1 ){
            return  (A[0] > 1)  ? A[0] - 1 : A[0] + 1;
        }
        for (int i = 0; i < size -1; i++) {
            if (A[i + 1] - A[i] != 1) {
                return A[i] + 1;
            }else
                result = A[i] +2;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new FindMissingElement().solution(new int[]{3});
        System.out.println(result);
    }
}
