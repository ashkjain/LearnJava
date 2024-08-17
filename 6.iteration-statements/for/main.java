public class main
{
    public static void main(String[] args)
    {
        System.out.println("For Loop");

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Counter: "+ i);
        }

        // Infinite For Loop
        /* 
        for(;;)
        {

        }
         */
        System.out.println("FOr loop comma usage example: ");
        for(int i = 0, j = 10; i < j; i++, j--)
        {
            System.out.println("Counters: i = " + i +" j = "+j);
        }
    }
}