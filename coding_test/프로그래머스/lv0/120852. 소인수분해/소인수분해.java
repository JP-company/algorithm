import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public Integer[] solution(int n) {
        Integer[] answer = {};
        Set<Integer> intSet = new LinkedHashSet<>();
        for (int i=2; i<=n; i++) {
            if (n % i == 0) {
                n /= i;
                intSet.add(i);
                i -= 1;
            }
        }
        answer = intSet.toArray(new Integer[0]);
        
    
        return answer;
    }
}