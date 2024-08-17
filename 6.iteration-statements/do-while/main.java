public class main
{
    public static void main(String[] args)
    {
        System.out.println("Do While Loop");
        int counter = 0;
        do
        {
            System.out.println("Counter: "+ counter++);
        }
        while (counter < 5);

        do
        {
            System.out.println("Counter is Five already: " + counter);
        }
        while (counter < 5);
    }
}