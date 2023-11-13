class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[100];
        threeVillegeRule(arr);
    
        return arr[n-1];
    }
    
    private void threeVillegeRule(int[] arr) {
        int index = 0;
        int b = 1;
        
        while (true) {
            if (b % 3 == 0 || String.valueOf(b).contains("3")) {
                b++;
                continue;
            }
            
            arr[index] = b;
            b++;
            index++;
            
            if (arr[99] != 0) {
                return;
            }
        }
    }
}