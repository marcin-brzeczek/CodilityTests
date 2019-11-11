import static java.lang.System.out;

public class Test2 {

    public static void main(String[] agrs) {

        out.println(new Test2().solution(99, 88879925));
    }


    public int solution(int A, int B) {

        int postion = -1;
        final long rangeA = 99;
        final long rangeB = 999999999;

        if ((A < 0 || A > rangeA)) {

            out.println("Wrong an integer of A:" + A);
            return -1;
        }

        if (B < 0 || B > rangeB) {
            out.println("Wrong an integer of B:" + B);
            return -1;
        }

        /*Ile razy int A występuje w B*/
        String strB = String.valueOf(B);
        String strA = String.valueOf(A);

        for (int i = 0; i < strB.length(); i++) {

            String newStr = strB.substring(i, i + 2);
            if (newStr.equals(strA)) {
                postion = i;
                return postion;
            }
        }

        return postion;
    }
}
