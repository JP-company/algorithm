import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        
        Set<Character> setChar = new HashSet<>();
        Set<Character> setCharDistinct = new HashSet<>();
        
        for (int i=0; i<s.length(); i++) {
            if (setChar.contains(s.charAt(i))) {
                setCharDistinct.add(s.charAt(i));
            } else {
                setChar.add(s.charAt(i));
            }
        }
        
        return setChar.stream().filter(x -> !setCharDistinct.contains(x)).sorted().map(ch -> ch+"").reduce((a, b) -> a += b).orElse("");
    }
}