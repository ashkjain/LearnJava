import java.lang.String;
public class main {
    public static void main(String[] args) {
        String s = " hello ";
        System.out.println("=== String comparison ===");
        System.out.println("");

        String s2 = " hello ";
        System.out.println("s == s2: " + (s == s2));

        String s3 = new String(" hello ");
        System.out.println("s == s3: " + (s == s3));
        System.out.println("s.equals(s3): " + s.equals(s3));
        System.out.println("s == s3.intern(): " + (s == s3.intern()));

        String firstName = "Ashish";
        String firstName2 = "ashish";
        System.out.println("firstName.equals(firstName2): " + firstName.equals(firstName2));
        System.out.println("firstName.equalsIgnoreCase(firstName2): " + firstName.equalsIgnoreCase(firstName2));
    }
}
