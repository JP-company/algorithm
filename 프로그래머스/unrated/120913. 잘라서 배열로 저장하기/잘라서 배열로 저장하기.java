import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answerList = new ArrayList<>();
        
        while (my_str.length() > n) {
            answerList.add(my_str.substring(0, n));
            my_str = my_str.substring(n);
        }
        answerList.add(my_str);
        
        return answerList.toArray(new String[0]);
    }
}