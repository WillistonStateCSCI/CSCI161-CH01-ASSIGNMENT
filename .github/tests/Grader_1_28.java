import java.lang.reflect.*;

public class Grader_1_28 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("P1_28");

            // Check that the class has a main method (project entry point)
            Method main = cls.getMethod("main", String[].class);

            // Attempt to run main to ensure it executes without throwing
            main.invoke(null, (Object) new String[]{});

            System.out.println("PASS: P1_28 compiled and ran successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("FAIL: P1_28 class not found");
            System.exit(1);
        } catch (NoSuchMethodException e) {
            System.out.println("FAIL: P1_28 must have a public static void main(String[] args) method");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("FAIL: P1_28 threw an exception during execution: " + e.getCause());
            System.exit(1);
        }
    }
}
