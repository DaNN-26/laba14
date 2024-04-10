import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String str = "Привет ::0db8:85A3::::: hello 345";
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Pattern pat = Pattern.compile("(::)?((\\d\\d\\d\\d|\\d\\d\\d[a-fA-F]|\\d\\d[a-fA-F]\\d|\\d[a-fA-F][a-fA-F]\\d\\d|[a-fA-F]\\d\\d\\d:|\\d\\d[a-fA-F][a-fA-F]|\\d[a-fA-F][a-fA-F]\\d|[a-fA-F][a-fA-F]\\d\\d|\\d[a-fA-F]\\d[a-fA-F]|[a-fA-F]\\d[a-fA-F]\\d|[a-fA-F]\\d\\d[a-fA-F]|[a-fA-F][a-fA-F][a-fA-F]\\d|[a-fA-F]\\d[a-fA-F][a-fA-F]|[a-fA-F][a-fA-F]\\d[a-fA-F]|\\d[a-fA-F][a-fA-F][a-fA-F]|[a-fA-F][a-fA-F][a-fA-F][a-fA-F]):){3,7}(\\d\\d\\d\\d|\\d\\d\\d[a-fA-F]|\\d\\d[a-fA-F]\\d|\\d[a-fA-F][a-fA-F]\\d\\d|[a-fA-F]\\d\\d\\d:|\\d\\d[a-fA-F][a-fA-F]|\\d[a-fA-F][a-fA-F]\\d|[a-fA-F][a-fA-F]\\d\\d|\\d[a-fA-F]\\d[a-fA-F]|[a-fA-F]\\d[a-fA-F]\\d|[a-fA-F]\\d\\d[a-fA-F]|[a-fA-F][a-fA-F][a-fA-F]\\d|[a-fA-F]\\d[a-fA-F][a-fA-F]|[a-fA-F][a-fA-F]\\d[a-fA-F]|\\d[a-fA-F][a-fA-F][a-fA-F]|[a-fA-F][a-fA-F][a-fA-F][a-fA-F])(::)?");

        Matcher match = pat.matcher(str);
        if(match.find())
            System.out.println("IP-адрес: " + match.group());
        else
            System.out.println("Ошибка: в строке не найдено IP-адресов");
    }
}