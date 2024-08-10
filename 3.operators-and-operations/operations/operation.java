import java.lang.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class operation
{
    public static void main(String[] args)
    {
        int i = 20;
        System.out.println(i / 3); // Quotient
        System.out.println(i % 3); // Remainder
        System.out.println((double)i/3); // Return precise amount after type casting

        BigDecimal ridefee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePerPerson = ridefee.divide(amountOfPeople, RoundingMode.HALF_UP);
        System.out.println(chargePerPerson); // Exact value with cents

        double d = 3.1;
        double d2 = 1.21;
        System.out.println(d - d2); // Returns 1.8900000000001, and does not make sense for a application

        BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
        System.out.println(bd3.subtract(bd4)); // Returns readable and a number that will make sense in an application
    }
}