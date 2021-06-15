import java.util.HashMap;
import java.util.Hashtable;

public class marathon {
    public static String solution(String[] participant, String[] completion) {
        int temp = 0;
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>(participant.length);
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], i);
            temp += map.get(participant[i]);
       //     System.out.println(map.get(participant[i]));
        }
        //System.out.println(temp);
        //System.out.println(map.get());
        for (int i = 0; i < completion.length; i++) {
            temp -= map.get(completion[i]);
            map.remove(completion[i]);
        }
        return participant[temp];
    }
    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden", "leo"};
        String[] completion = new String[]{"eden", "kiki", "leo"};
        solution(participant, completion);
    }
}
