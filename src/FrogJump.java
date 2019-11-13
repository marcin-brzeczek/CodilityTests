
public class FrogJump {

    public int solution(int X, int Y, int D){
        int  distanceToGO = Y - X;
        double result = (double) distanceToGO/D;
        return (int) Math.ceil(result);
    }

    public static void main(String[] args) {

       int result = new FrogJump().solution(10, 50, 30);

       System.out.println("Frog jumps: "+ result);
    }
}
