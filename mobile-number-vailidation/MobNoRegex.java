import java.util.regex.*;

public class MobNoRegex {

    public static boolean isValid(String s) {
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }

    public static void main(String[] args) {
        // String s = "347873923408";
        String s = "917292554433";
        if (isValid(s))
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}
