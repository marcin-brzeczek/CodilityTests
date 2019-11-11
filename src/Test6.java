
public class Test2 {

    int solution(int[] array) {

        int i,j = 0;
        int changes1 =0; int changes2 = 0;
        for(i=0;i<array.length;i+=2){
            if(array[i]!=1){
                changes1++;
            }
        }
        for(j=1;j<array.length;j+=2){
            if(array[j]!=0){
                changes1++;
            }
        }
        for(i=0;i<array.length;i+=2){
            if(array[i]!=0){
                changes2++;
            }
        }
        for(j=1;j<array.length;j+=2){
            if(array[j]!=1){
                changes2++;
            }
        }
       /*
        while (i++ < array.length - 1) {
           if(array[i] %2 !=0)
               changes++;
           i++;
        }
        return changes;
       */
       return changes1;
    }

    public static void main(String[] args) {

        System.out.println(new Test2().solution(new int[]{0,1, 0, 1, 0, 1, 0}));
    }
}