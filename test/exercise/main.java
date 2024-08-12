public class main {
    public static final String ADMIN_FLAG = "--admin";
    public static final String GUEST_FLAG = "--guest";

    public static void main(String[] args) {
        boolean hasAdminFlag = false;
        boolean hasGuestFlag = false;

        // Check each argument for flags, trim whitespace
        for (String arg : args) {
            String trimmedArg = arg.trim();
            System.out.println(arg);
            if (trimmedArg.equals(ADMIN_FLAG)) {
                hasAdminFlag = true;
            } else if (trimmedArg.equals(GUEST_FLAG)) {
                hasGuestFlag = true;
            }
        }

        // Determine output based on flags
        if (hasAdminFlag && hasGuestFlag) {
            System.out.println("Please select either 'ADMIN' or 'GUEST' mode for this program");
        } else if (hasAdminFlag) {
            System.out.println("Hello Admin");
        } else if (hasGuestFlag) {
            System.out.println("Hello Guest");
        } else {
            System.out.println("No valid mode specified");
        }
    }
}
