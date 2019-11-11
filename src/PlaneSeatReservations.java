public class PlaneSeatReservations {

    public int solution(int N, String S) {

        if(S.trim().length() == 0)
            return 2 * N;

        int maxPlacesFamily = 4;
        int amountOfFamilies = 0;
        int amountOfFamilyMembers = 0;
       int amountOfFirstGroup= 0;
       int minAmountOfFirstGroup = 2;

        String[] inputPlaces = S.split(" ");

        char[] places = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K'};

        for (int i = 0; i < N; i++) {

            for (int j = 1; j < places.length - 1; j++) {
                if (j<inputPlaces.length) {
                    if(inputPlaces[j].toCharArray()[0]== i && inputPlaces[j].toCharArray()[1] != places[j])
                    amountOfFamilyMembers++;
                } else{
                    amountOfFamilyMembers++;
                }
                if(j==1 || j==2){
                    amountOfFirstGroup++;
                }
                if (amountOfFamilyMembers == maxPlacesFamily) {
                    amountOfFamilyMembers =0;
                    amountOfFamilies++;
                }
            }
            if(amountOfFirstGroup != minAmountOfFirstGroup) {
                amountOfFamilies = amountOfFamilies - 1;
                        amountOfFirstGroup = 0;
            }
        }
            return amountOfFamilies;
    }

    public static void main(String[] args) {

        int result = new PlaneSeatReservations().solution(1, "") ;

        System.out.println(result);
    }
}