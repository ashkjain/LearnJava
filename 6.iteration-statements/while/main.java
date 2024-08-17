public class main
{
    public static void main(String[] args)
    {
        System.out.println("While Loop");
        int counter = 0;
        while (counter < 5)
        {
            System.out.println("Counter: "+ counter++);
        }

        // THis is infinite loop
        while (true)
        {
            System.out.println("Infinite");
        }
    }
}