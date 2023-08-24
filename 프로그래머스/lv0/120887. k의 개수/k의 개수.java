class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int num = 0;
        
        for (int a=i; a <= j; a++) {
            for (int b=a; b > 0; b /= 10) {
                num  = b % 10;
                if (num==k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}