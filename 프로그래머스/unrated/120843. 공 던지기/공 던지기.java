class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        for (int i=0; i<k; i++) {
            if (i == k-1) {
                break;
            }
            answer += 2;
            if (answer > numbers.length-1) {
                answer -= numbers.length;
            }
        }
        
        return numbers[answer];
    }
}