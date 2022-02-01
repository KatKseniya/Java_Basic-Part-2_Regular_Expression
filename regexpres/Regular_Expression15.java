package regexpres;

public class Regular_Expression15 {
    public static void main(String[] args) {

        String text = "aba accca azzza wwwwa";
        String myStr =text.replaceAll("(a([^\\s]*)a)+", "!$2!");
        System.out.println(myStr);

    }
}
