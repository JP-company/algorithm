import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String str = Arrays.stream(array).mapToObj(i -> String.valueOf(i)).reduce((a, b) -> a + b).get();
        
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '7') {
                answer++;
            }
        }
        
        return answer;
    }
}