class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i=0; i<my_string.length(); i++) {
            int j = Integer.valueOf(my_string.charAt(i)) - 48;
            if (j < 10) {
                answer += j;
            }
        }
        return answer;
    }
}