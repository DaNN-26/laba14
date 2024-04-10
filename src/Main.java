import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        File file = new File("D://ip.txt");
        String str = "Привет, 192.234.121.211 Тебя взломали!))";
        Pattern pat = Pattern.compile("(([1-9]\\d\\d|2[0-4]\\d|25[0-5]|\\d)\\.){3}(//d|[1-9]\\d\\d|2[0-4]\\d|25[0-5])");

        Matcher match = pat.matcher(str);
        if (match.find())
           System.out.println("IP-адрес: " + match.group());
        else
            System.out.println("IP-адресов не найдено");
    }
}