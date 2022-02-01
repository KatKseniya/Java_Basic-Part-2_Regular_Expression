package regexpres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression13 {
    public static void main(String[] args) {
        String text = "23 2+3 2++3 2+++3 445 677";


        String regex = "(2\\+*3)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }
    }
}
