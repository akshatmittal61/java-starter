import utils.Logger;

public class LearningStrings {
    public static void main(String[] args) {
        String s = "Hello";
        s += 'a';
        System.out.println(s);
        System.out.println(reverseEqn("1+2*3"));
    }

    static boolean isSign(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static String rev(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i = n - 1; i >= 0; --i) {
            char c = s.charAt(i);
            Logger.info(s, i, c);
            ans.append(c);
        }
        return ans.toString();
    }

    static String reverseEqn(String s) {
        // your code here
        String tmp = "";
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i = n - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (isSign(c)) {
                if (!tmp.isEmpty()) {
                    ans.append(rev(tmp));
                    tmp = "";
                }
                ans.append(c);
            } else {
                tmp += c;
            }
        }
        if (tmp != "") {
            ans.append(tmp);
        }
        return ans.toString();
    }
}
