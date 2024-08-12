public class main
{
    public static void main(String[] args)
    {
        int amountOfMoneyOnAccount = 100;
        int itemPrice = 200;

        if(amountOfMoneyOnAccount < itemPrice)
        {
            System.out.println("You do not have enough money on your account to purchase this item");
        }
        else
        {
            System.out.println("Item is purchased");
        }
        
        // With no curly braces
        
        amountOfMoneyOnAccount += 200;
        
        if(amountOfMoneyOnAccount < itemPrice)
        System.out.println("You do not have enough mnoney to purchase this item");
        else
        System.out.println("Item is purchased");
        System.out.println("Now this is outside of the scope of else block.");

        // Nested If statement
        int i1 = 3;
        int i2 = 2;
        int i3 = 10;

        if (i1 > i2)
        {
            if (i1 > i3)
                System.out.println("i1 is more than i2 and i3");
            else
                System.out.println("i1 is more than i2 but less than i3");
        }
        else
            System.out.println("i1 is less than i2");

            // if - else - if
            int orderPrice = 1000;
            if (orderPrice > 0 && orderPrice < 100)
            {
                System.out.println("You have 5% discount for this order");
            }
            else if (orderPrice >= 100 && orderPrice < 500)
            {
                System.out.println("You have 10% discount for this order");
            }
            else if (orderPrice >= 500 && orderPrice < 5000)
            {
                System.out.println("You have 15% discount for this order");
            }
    }
}