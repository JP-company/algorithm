import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        
        int x = Arrays.stream(dots).mapToInt(arr -> arr[0]).distinct().sorted()
            .reduce((a,b) -> b - a).getAsInt();
        int y = Arrays.stream(dots).mapToInt(arr -> arr[1]).distinct().sorted()
            .reduce((a,b) -> b - a).getAsInt();
        
        return x * y;
    }
}