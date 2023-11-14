class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        for (int i = 0; i < A.length(); i++) {
            String str = A.substring(A.length() - i) + A.substring(0, A.length() - i);
            if (str.equals(B)) {
                return i;
            }
        }
        
        return -1;
    }
}