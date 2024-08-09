import java.lang.*;
public class math_nan_infinite
{
    public static void main(String[] args)
    {
        System.out.println(Math.PI); // Return the value of PI
        System.out.println(Math.max(3,5)); //Returns the maximum value
        System.out.println(Math.min(3,5)); // Returns the minimum value
        System.out.println(Math.sqrt(4)); // Returns the square root
        System.out.println(Math.abs(-5)); // Returns the absolute value

        System.out.println(Math.sqrt(-1)); // NaN
        System.out.println(0 / 0.0); // NaN
        System.out.println((0 / 0.0) + 5); // NaN

        System.out.println(5 / 0.0); // Infinity
        System.out.println(-5 / 0.0); // Infinity

        System.out.println(Math.round(20.0 / 3.0)); // 7
        System.out.println(Math.round(20.0 * 100.0 / 3.0) / 100.0); // 6.67

        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 100));
        System.out.println((int)(Math.random() * 100) + 100);
    }
}