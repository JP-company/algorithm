class Solution {
    public int solution(int n) {
        int answer = 1;
        while (n >= answer * answer) {
            if (n == answer * answer) {
                return 1;
            }
            answer++;
        }
        return 2;
    }
}