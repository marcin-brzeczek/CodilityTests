import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import static java.lang.System.out;


public class Test1 {

    public static void main(String[] args) {


        out.print(new Test1().solution(new int[]{1, 4,-1, 3, 2}));

    }


    private int solution(int[] A) {

        final long size_N = 200000;

        long counterMinusOne=0;

        /*sprawdzenie poprawności*/
       for(int i :A)
        if(i<-1 || i > size_N -1){

           out.println("Incorret element of array: " +i);
           return  -1;
        }

        /*załadowanie nowej listy o rozmiarze
         najwiekszego elementu tablicy A*/
        int sizeNewList = Arrays.stream(A).max().getAsInt();

        /*nowa lista załądowana wstępnie nullami*/
        LinkedList<Integer> newList = new LinkedList<Integer>();

        for (int i = 0; i < sizeNewList; i++)
            newList.add(null);

             /*sprawdzenie każdego elementu z tablicy A*/
        for (int j = 0; j < A.length; j++) {

            if (j == 0 && A[j]!=-1)
                newList.add(0, A[j]);

            if (A[j] == -1) {
            counterMinusOne++;
                continue;
            }

            if (A[j] >= 0  && j < A.length - 1)
                if(A[j + 1]!=-1)
                newList.add(A[j], A[j + 1]);

            out.println(newList);
        }

        newList.removeAll(Collections.singleton(null));

        for(int count =0 ;count<counterMinusOne; count++)
        newList.addLast(-1);

        out.println(newList);

        return newList.size();
    }
}
