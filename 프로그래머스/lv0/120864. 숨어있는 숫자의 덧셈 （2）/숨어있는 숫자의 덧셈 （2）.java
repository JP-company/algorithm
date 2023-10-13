class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int contin = 0;
        
        for (int i=my_string.length() - 1; i>=0; i--) {
            if (my_string.charAt(i) < 58) {
                if (contin > 0) {
                    answer += (my_string.charAt(i) - 48) * Math.pow(10, contin);
                } else {
                    answer += my_string.charAt(i) - 48;
                }
                contin++;
            } else {
                contin = 0;
            }
        }
        
        return answer;
    }
}