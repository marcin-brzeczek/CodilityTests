import static java.lang.System.out;

public class
Test4 {


    public static void main(String[] args) {

        out.print(new Test4().solution(568, 12999));

    }

    public int solution(int A, int B) {

        int C = 0;
        final long range = 100000000;
        int length = 0;

        if ((A < 0 || A > range)) {
            out.println("Wrong an integer of A:" + A);
            return -1;
        }

        if (B < 0 || B > range) {
            out.println("Wrong an integer of B:" + B);
            return -1;
        }


        String strB = String.valueOf(B);
        String strA = String.valueOf(A);
        String strC = "";
        int min = 0;
        if (strA.length() <= strB.length())
            min = strA.length();
        else
            min= strB.length();


        for (int i = 0; i < min; i++)
            strC += strA.substring(i, i + 1) + strB.substring(i, i + 1);

        if(strA.length()>min)
            strC+= strA.substring(min, strA.length());

        if(strB.length()>min)
            strC+= strB.substring(min, strB.length());



        C = Integer.valueOf(strC);

        if (C > range) {
            out.println("result exceed range!");
            return -1;
        }
        return C;
    }
}
