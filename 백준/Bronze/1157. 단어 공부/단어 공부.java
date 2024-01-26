import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        String inputLowerCase = input.toLowerCase();
        
        List<Character> list = new ArrayList<>();
        int maxCount = 0;
        
        while(!inputLowerCase.isEmpty()) {
            Character ch = inputLowerCase.charAt(0);
            int beforeLength = inputLowerCase.length();
            
            inputLowerCase = inputLowerCase.replace(String.valueOf(ch), "");
            int count = beforeLength - inputLowerCase.length();
            
            if (maxCount < count) {
                maxCount = count;
                list.clear();
                list.add(ch);
                continue;
            }
            
            if (maxCount == count) {
                list.add(ch);
            }
        }
        
        if (list.size() > 1) {
            System.out.println('?');
            return;
        }
        System.out.println(Character.toUpperCase(list.get(0)));
    }
}