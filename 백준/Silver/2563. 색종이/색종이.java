import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int paperLength = 100;
        int colorPaperLength = 10;
        int answer = 0;
        
        boolean[][] paper = new boolean[100][100];
        for(int i=0; i<count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j=x; j<x+colorPaperLength; j++) {
                for(int k=y; k<y+colorPaperLength; k++) {
                    paper[j][k] = true;
                }
            }
        }
        
        for(int m=0; m<paperLength; m++) {
            for(int n=0; n<paperLength; n++) {
                if(paper[m][n]) {
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
    }
}