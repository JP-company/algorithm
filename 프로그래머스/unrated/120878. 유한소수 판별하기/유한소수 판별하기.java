class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int big = max(a, b);
        int small = min(a, b);
        int greatestCommonFactor = getGreatestCommonFactor(big, small);
        
        b /= greatestCommonFactor;
        
        while (b > 0) {
            boolean two = b % 2 == 0;
            boolean five = b % 5 == 0;
            if (two || five) {
                if (two) {
                    b /= 2;
                } else {
                    b /= 5;
                }
                continue;
            }
            
            if (b == 1) {
                return 1;
            }
            return 2;
        }
        
        
        
        
        
        
        return answer;
    }
    
    private int getGreatestCommonFactor(int a, int b) {
        int result = a % b;
        if (result == 0) {
            return b;
        }
        return getGreatestCommonFactor(b, result);
    }
    
    private int max(int a, int b) {
        return a > b ? a : b;
    }
    
    private int min(int a, int b) {
        return a <= b ? a : b;
    }
}