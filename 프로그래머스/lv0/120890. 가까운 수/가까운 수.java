import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        List<Integer> intList = new ArrayList<>();
        
        for (int i : array) {
            intList.add(i);
        }
        intList.add(n);
        intList.sort(Comparator.naturalOrder());
        
        if (intList.indexOf(n) == 0) {
            return intList.get(1);
        } else if (intList.indexOf(n) == intList.size() - 1 ) {
            return intList.get(intList.size() - 2);
        }
        
        int prevInt = intList.get(intList.indexOf(n) - 1);
        int postInt = intList.get(intList.indexOf(n) + 1);
        
        answer = (n - prevInt) > (postInt - n) ? postInt : prevInt;
        
        return answer;
    }
}