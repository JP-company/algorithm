class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        for (int i=0; i<strArr.length; i++) {
            if (i % 2 == 1) {
                if (strArr[i].equals("+")) {
                    System.out.println(strArr[i]);
                    answer += Integer.parseInt(strArr[i+1]);
                } else {
                    answer -= Integer.parseInt(strArr[i+1]);
                }
            }
        }
        
        return answer;
    }
}