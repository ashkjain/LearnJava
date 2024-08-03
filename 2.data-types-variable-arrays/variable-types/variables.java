public class variables {
    public static void main(String[] args) {
        byte b = 1;
        short s;
        s = 2;
        int i = 3;
        long l = 4;
        char c = 'a';
        boolean bool = true;

        float f = 1.2f;
// You Can Also Do This
        float f2 = 1.2F;

        long l2 = 2_000_000_000L;

        double d = 1.3;
        var v = 1;

        int i3 = s;
        char c2 = 100;
        System.out.println(c2);
        double d2 = i3;
        d2 = l;

        // We can also to tht type conversion while adding the value to the another variable
        b = (byte)i3;
        // What we did here is since the int value cannont be passed into byte, we converted the value to the byte.
    }
}
