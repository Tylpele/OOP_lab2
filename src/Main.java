import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        String[] email_test_list = {"shashkoff.danil2016@yandex.ru", "user@example.com",
                "sha.shkoff.dani.l2016@ya2342ndex.ru", "shashkoff.danil2016@yandex",
                "user@examplecom", "root@localhost", "bug@@@com.ru", "@val.ru, Just Text2"};
        for (int i = 0; i < email_test_list.length; i++) {
            if (is_Valid_Email(email_test_list[i]) == true)
                System.out.print("email " + email_test_list[i] + "  валидный\n");
            else
                System.out.print("email " + email_test_list[i] + "  НЕ валидный\n");
        }
    }

    public static boolean is_Valid_Email(String email) {
        String regex = "(\\w+[.!#$%&])*\\w+@\\w+(\\.\\w+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}