import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Map<String, Double> grade = Map.of(
            "A+", 4.5,
            "A0", 4.0,
            "B+", 3.5,
            "B0", 3.0,
            "C+", 2.5,
            "C0", 2.0,
            "D+", 1.5,
            "D0", 1.0,
            "F" , 0.0,
            "P", 0.0
        );
        
        double totalScore = 0.0;
        double totalGrade = 0.0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] strArr = line.split(" ");
            String key = strArr[2];
            
            Double score = grade.get(key);
            Double gradeDouble = Double.parseDouble(strArr[1]);
            totalGrade = (!key.equals("P")) ? totalGrade + gradeDouble : totalGrade;
            totalScore += score * gradeDouble;
        }
        
        System.out.println(totalScore / totalGrade);
    }
}