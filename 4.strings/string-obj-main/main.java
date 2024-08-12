import java.util.Arrays;
import java.util.ArrayList;
import java.lang.String;
public class main
{
    public static void main(String[] args)
    {
        System.out.println("=== String Methods ===");
        System.out.println("");
        String s = " hello ";
        System.out.println("s.lenght(): " + s.length());
        System.out.println("s.contains(\"he\"): " + s.contains("he"));
        System.out.println("s.isEmpty(): " + s.isEmpty());
        System.out.println("s.toUpperCase(): " + s.toUpperCase());
        System.out.println("s.toLowerCase(): " + s.toLowerCase());
        System.out.println("s.startsWith(\"h\"): " + s.startsWith("h"));
        System.out.println("s.endsWith(\" \"): " + s.endsWith(" "));
        System.out.println("s.replace(\"ll\", \"LL\"): " + s.replace("ll","LL"));
        System.out.println("s.trim(): " + s.trim());
        // System.out.println("s.strip(): " + s.strip()); Does not exist in Java SE 8

        System.out.println("s.substring(0, 3): " + s.substring(0, 3));
        System.out.println("Arrays.toString(s.getBytes()): " + Arrays.toString(s.getBytes()));
        System.out.println("Arrays.toString(s.toCharArray()): " + Arrays.toString(s.toCharArray()));
        System.out.println("Arrays.toString(s.split(\"e\")): " + Arrays.toString(s.split("e")));
    }
}