class Solution {
    public int solution(int[] sides) {
        int smallInt = sides[0] > sides[1] ? sides[1] : sides[0];
        
        return 2 * smallInt - 1 ;
    }
}