import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (int i=0; i<5; i++) {
            list.add(sc.next());
        }

        int row = list.size();
        int column = list.stream().mapToInt(String::length).max().getAsInt();
        Character[][] charArr = new Character[row][column];

        for(int i=0; i<row; i++) {
            int length = list.get(i).length();
            for(int j=0; j<length; j++) {
                charArr[i][j] = list.get(i).charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<column; i++) {
            for(int j=0; j<row; j++) {
                Character ch = charArr[j][i];
                if (ch != null) {
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb);
    }
} 