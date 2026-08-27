public class Grader_1_19 {
    static int pass = 0, fail = 0;
    public static void check(String label, int actual, int expected) {
        if (actual == expected) { pass++; System.out.println("PASS: " + label); }
        else { fail++; System.out.println("FAIL: " + label + " (expected " + expected + ", got " + actual + ")"); }
    }
    public static void main(String[] args) {
        check("divBy2(26)", C1_19.divBy2(26), 4);
        check("divBy2(2)", C1_19.divBy2(2), 1);
        check("divBy2(1)", C1_19.divBy2(1), 0);
        check("divBy2(1024)", C1_19.divBy2(1024), 9);
        System.out.println(pass + " passed, " + fail + " failed");
        if (fail > 0) System.exit(1);
    }
}
