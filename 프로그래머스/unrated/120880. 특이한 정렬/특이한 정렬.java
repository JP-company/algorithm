import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] numlist, int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int k=0; k<numlist.length; k++) {
            linkedList.add(0);
        }
        
        for (int i=0; i<numlist.length; i++) {
            me:
            for (int j=0; i<numlist.length; j++) {
                int currentValue = linkedList.get(j);
                if (currentValue == 0) {
                    linkedList.set(j, numlist[i]);
                    break me;
                }
                
                if (compare(numlist[i], currentValue, n)){
                    linkedList.add(j, numlist[i]);
                    linkedList.removeLast();
                    break me;
                }
            }
        }
        
        return linkedList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public boolean compare(int a, int b, int n) {
        int aSize = size(a - n);
        int bSize = size(b - n);
        
        if (aSize < bSize) {
            return true;
        }
        if (aSize == bSize && a > b) {
            return true;
        }
        return false;
    }
    
    public int size(int a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }
}