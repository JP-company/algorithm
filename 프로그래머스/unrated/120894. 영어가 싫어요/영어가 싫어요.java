import java.util.Map;
import java.util.HashMap;

class Solution {
    public long solution(String numbers) {

        Map<String, String> replaceMap = new HashMap<>();
        replaceMap.put("zero", "0");
        replaceMap.put("one", "1");
        replaceMap.put("two", "2");
        replaceMap.put("three", "3");
        replaceMap.put("four", "4");
        replaceMap.put("five", "5");
        replaceMap.put("six", "6");
        replaceMap.put("seven", "7");
        replaceMap.put("eight", "8");
        replaceMap.put("nine", "9");
        
        for (Map.Entry<String, String> entry : replaceMap.entrySet()) {
            if (numbers.contains(entry.getKey())) {
                numbers = numbers.replaceAll(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(numbers);
        return Long.parseLong(numbers);
    }
}