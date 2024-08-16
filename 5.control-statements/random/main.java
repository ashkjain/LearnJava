import java.util.Random;
public class main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        System.out.println(rand.nextInt()); // any random int
        System.out.println(rand.nextInt(100)); // any int from 0 - 99
        System.out.println(rand.nextInt(100) + 1); // any int from 1 - 100
    }
}