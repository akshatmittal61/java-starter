import utils.Logger;

public class Functions {
    public static class Student {
        private String name;
        private int age;
    }

    public static String replaceCharacters(String input, String from, String to) {
        if (input == null) {
            return "";
        } else if (from != null && !from.isEmpty()) {
            if (to == null || to.isEmpty()) {
                to = "";
            }

            return input.replace(from, to);
        } else {
            return input;
        }
    }

    public static void main(String[] args) {
        // System.out.println(convertIntToString(1));
//        Logger.info(replaceCharacters("Hello World", "o", "0"));
//        Logger.info(replaceCharacters("Hello \n It's me, Akshat", "\n", "0"));
        System.out.println(replaceCharacters("Battery performance is too good ,one full charge goes for a more than a day .camera is also good . \nThe touch and operating is very smooth", "\n", " "));
    }
}
