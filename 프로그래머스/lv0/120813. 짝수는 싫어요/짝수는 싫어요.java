class Solution {
    public int[] solution(int n) {
        int arrSize = (int)Math.ceil(n/2f);
        int[] answer = new int[arrSize];
        int j = 0;
        
        for (int i=0; i<=n; i++) {
            if (i % 2 != 0) {
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}