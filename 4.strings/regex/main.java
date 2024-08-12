import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
public class main
{
    public static void main(String[] args) 
    {
        System.out.println("=== Regular Expression ===");
        System.out.println();

        String gmailPattern = "[a-zA-z-\\d]+@gmail\\.com";
        Pattern p = Pattern.compile(gmailPattern);
        String sampleText = "Some random text that contains gmail address" + "like this one some-email@gmail.com. And some other random text";
        Matcher m = p.matcher(sampleText);
        m.find();
        String gmailAddress = m.group();
        System.out.println(gmailAddress);

        String sampleText2 = "There are three sentences in this string. Are you sure? Yes!";
        String[] sentences = sampleText2.split("[\\.!?]");
        System.out.println(Arrays.toString(sentences));
    }
}