import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().reduce("", (a,b) -> a+b);
    }
}