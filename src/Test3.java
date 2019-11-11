import java.util.*;

import static java.lang.System.out;

public class Test3 {


    public static void main(String[] args) {

        out.print(new Test3().solution("00:01:07,400-234-090\n" +
                "00:05:01,701-080-080\n" +
                "00:05:00,400-234-090"));
    }

    public int solution(String S) {

        int totalCost = 0;
        final int costUpTo300sec = 3;
        final int costOver5min = 150;
        int costLine = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        long duration = 0;

        /* 00:05:00  - 5 * 150*/
        /*00:05:01 - 6 *150 */
        /*00:04:35 - (4 * 60 + 35) * 3*/
        String format = "\\d{2}:\\d{2}:\\d{2}\\,\\d{3}-\\d{3}-\\d{3}";
        final long maxLines = 100;

        String[] tab = S.split("\n");
        for (int j = 0; j < tab.length; j++)
            if (!tab[j].matches(format)) {
                out.println("Incorrect format of line: " + tab[j]);
                return 0;

            }
        List<Integer> durationList = new LinkedList<>(); // lista z czasami trwania
        Map<String, String> mapLogs = new HashMap<>();// map z logami
        Map<Integer, Integer> mapCostNumbers = new HashMap<>(); // map czas trwania i koszt

        for (int i = 0; i < tab.length; i++) {
            mapLogs.put(tab[i].split(",")[0], tab[i].split(",")[1]);
        }


        for (Map.Entry<String, String> entry : mapLogs.entrySet()) {

            hours = Integer.valueOf(entry.getKey().substring(0, 2));
            minutes = Integer.valueOf(entry.getKey().substring(3, 5));
            seconds = Integer.valueOf(entry.getKey().substring(6, 8));

            if (hours > 0)
                costLine = hours * 60 * costOver5min;

            if (minutes > 0 && minutes < 5 && seconds > 0)
                costLine += minutes * 60 * costUpTo300sec + seconds * costUpTo300sec;

            if (minutes >= 5 && seconds > 0)
                costLine += (minutes + 1) * costOver5min;

            if(hours>0)
                duration = hours * 60 *60;
            if(minutes>0)
                duration+= minutes *60;
            if(seconds>0)
                duration+=seconds;

            mapCostNumbers.put(costLine, (int) duration);
            durationList.add((int)duration);
        }

       int maxDur = Collections.max(durationList); // najdłuższy czas poł za darmo


        for(Map.Entry<Integer, Integer> entry : mapCostNumbers.entrySet() ){
            if(entry.getValue()!=maxDur)
                totalCost+= entry.getKey();
        }

        out.println(mapLogs);

        return totalCost;
    }
}
