import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String polynomial) {
        if (!polynomial.contains(" + ")) {
            return polynomial;
        }
        
        Map<Boolean, List<String>> stuByX = 
            Arrays.stream(polynomial.split(" \\+ "))
            .collect(Collectors.partitioningBy(x -> x.contains("x")));

        int x1 = (int)stuByX.get(true).stream()
            .filter(x -> x.equals("x"))
            .count();
        
        int x2 = stuByX.get(true).stream()
            .filter(x -> !x.trim().equals("x"))
            .mapToInt(x -> Integer.parseInt(x.replace("x", "")))
            .sum();
        
        int zero = stuByX.get(false).stream()
            .mapToInt(x -> Integer.parseInt(x))
            .sum();

        int x = x1 + x2;
        if (x == 0) {
            return zero + "";
        }
        if (x == 1) {
            return "x" + " + " + zero;
        }
        if (zero == 0) {
            return x + "x";
        }
        return x + "x" + " + " + zero;
    }
}