import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        final int limitTop = board[0] / 2;
        final int limitBottom = -board[0] / 2;
        
        final int limitRight = board[1] / 2;
        final int limitLeft = -board[1] / 2;
        int x = 0;
        int y = 0;
        
        Arrays.stream(keyinput)
            .filter(input -> input.startsWith("u") || input.startsWith("d"))
            .mapToInt(element -> element.startsWith("u") ? 1 : -1)
            .forEach(intElement -> {
                answer[1] += intElement;
                answer[1] = answer[1] > limitRight ? --answer[1] : answer[1];
                answer[1] = answer[1] < limitLeft ? ++answer[1] : answer[1];
            });
        
        Arrays.stream(keyinput)
            .filter(input -> input.startsWith("l") || input.startsWith("r"))
            .mapToInt(element -> element.startsWith("r") ? 1 : -1)
            .forEach(intElement -> {
                answer[0] += intElement;
                answer[0] = answer[0] > limitTop ? --answer[0] : answer[0];
                answer[0] = answer[0] < limitBottom ? ++answer[0] : answer[0];
            });
        
        
        return answer;
    }
}