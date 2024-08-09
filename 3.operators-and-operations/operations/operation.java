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
    }
}