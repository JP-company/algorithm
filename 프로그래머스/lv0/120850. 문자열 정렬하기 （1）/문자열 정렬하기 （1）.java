import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<my_string.length(); i++) {
            if ((my_string.charAt(i))>47 &&(my_string.charAt(i))<58) {
                list.add(my_string.charAt(i)-'0');
            }
        }
        answer = list.stream().mapToInt(x-> x).sorted().toArray();
        return answer;
    }
}