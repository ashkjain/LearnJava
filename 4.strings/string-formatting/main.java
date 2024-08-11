import java.lang.String;
public class main
{
    public static void main(String[] args)
    {
        String firstName = "Ashish";
        String greetingsTemplate = "Hello, dear %s! Good %s!";
        String morning = "morning";
        String afternoon = "afternoon";
        String evening = "evening";
        String formattedString = String.format(greetingsTemplate,firstName ,morning);
        String formattedString2 = String.format(greetingsTemplate,firstName ,afternoon);
        String formattedString3 = String.format(greetingsTemplate,firstName ,evening);
        System.out.println(formattedString);
        System.out.println(formattedString2);
        System.out.println(formattedString3);

        System.out.printf("You have %d computers available at store \n", 10);
    }
}