import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        Arrays.stream(array)
            .forEach(x -> {
                if (map.containsKey(x)) {
                    int i = map.get(x);
                    map.put(x, ++i);
                } else {
                    map.put(x, 1);
                }
            });
        
        int p = map.entrySet().stream()
            .max((a, b) -> a.getValue() - b.getValue())
            .get()
            .getKey();
        
        if (map.values().stream().filter(x ->  x == map.get(p)).count() > 1) {
            return -1;
        }
        
        return p;
    }
}