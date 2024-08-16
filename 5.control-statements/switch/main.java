import java.lang.String;
public class main
{
    public static void main(String[] args)
    {
        String customerStatus = "premium_customer";
        switch(customerStatus)
        {
            case "guest":
                System.out.println("Thank You for your order!");
                break;
            case "regular_customer":
                System.out.println("Thank you for your purchase!");
                break;
            case "premium_customer":
                System.out.println("Wow! You are a premium customer!");
                break;
            default:
                System.out.println("Customer does not have a status yet ");
        }
        System.out.println("==== Switch with no break");

        int i = 1;
        switch(i)
        {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            default:
                System.out.println("This is default block");
        }

        System.out.println("==== Switch with default");

        i = 10;
        switch(i)
        {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("This is default block");
        }

    }
}