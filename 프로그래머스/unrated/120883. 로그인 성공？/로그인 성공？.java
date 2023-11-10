class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        for (String[] dbArr : db) {
            if (id_pw[0].equals(dbArr[0])) {
                System.out.println(dbArr[0]);
                if (id_pw[1].equals(dbArr[1])) {
                    return "login";
                }
                return "wrong pw";
            }
        }
        return "fail";

    }
}