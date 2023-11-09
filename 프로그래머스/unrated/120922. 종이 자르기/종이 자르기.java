class Solution {
    public int solution(int M, int N) {
        int answer = M - 1;
        
        for (int i=0; i<M; i++) {
            answer += N - 1;            
        }
        
        return answer;
    }
}