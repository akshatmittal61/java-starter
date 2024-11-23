package Living;

public class Intelligence {
    Integer iq;

    public Intelligence(Integer iq) {
        this.iq = iq;
    }

    public String parse(String message) {
        if (this.iq < 100) {
            return message;
        }
        String ans = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                ans += message.charAt(i);
            } else {
                if(i % 2 == 0) {
                    ans += (char) (message.charAt(i) - 1);
                } else {
                    ans += (char) (message.charAt(i) + 1);
                }
            }
        }
        return ans;
    }
}
