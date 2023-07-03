import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(x->x%n==0).toArray();
    }
}