class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int num = 1;
        for (int i=0; i<emergency.length; i++) {
            for (int j : emergency) {
                if (emergency[i] < j) {
                    num++;
                }
            }
            answer[i] = num;
            num = 1;
         }
        
        
        return answer;
    }
}