import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String[] spell, String[] dic) {
        List<String> spellList = Arrays.asList(spell);
        
        for (String dicStr : dic) {
            List<String> dicList = Arrays.asList(dicStr.split(""));
            if ( dicList.stream()
                .filter(x -> !spellList.contains(x))
                .count() == 0 
                && 
                dicList.containsAll(spellList)) {
                return 1;
            }
        }
        return 2;
    }
}