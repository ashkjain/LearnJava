public class main
{
    public static void main(String[] args)
    {
        System.out.println("Continue");
        for(int i = 0; i < 5; i++)
        {
            if(i % 2 == 0) 
            {
                continue;
            }
            System.out.println("Counter: " + i);
        }
        System.out.println("Break");
        for(int i = 0; i < 5; i++)
        {
            if(i == 3) 
            {
                break;
            }
            System.out.println("Counter: " + i);
        }
        
    }
}
