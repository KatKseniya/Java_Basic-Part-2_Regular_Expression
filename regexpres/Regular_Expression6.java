package regexpres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression6 {
    public static void main(String[] args) {
        String text = "aa aba abba abbba abca abea";


        String regex = "(ab?a)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }
    }
}
