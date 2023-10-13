import java.util.Arrays;
import java.util.stream.Stream;


class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] strArr = s.split(" ");
        for (String str : strArr) {
            if (str.equals("Z")) {
                strArr[Arrays.asList(strArr).indexOf("Z")] = 
                    String.valueOf(
                    Integer.parseInt(
                        strArr[Arrays.asList(strArr).indexOf("Z") - 1]
                    ) * (-1));
            }
        }
        
        
        Stream<String> strStream = Arrays.stream(strArr);
        answer = strStream.mapToInt(Integer::parseInt).sum();
        return answer;
    }
}