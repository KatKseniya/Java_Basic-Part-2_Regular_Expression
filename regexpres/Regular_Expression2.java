package regexpres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression2 {
    public static void main(String[] args) {
        String text = "aba aca aea abba adca abea";


        String regex = "(a..a)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }
    }
}
