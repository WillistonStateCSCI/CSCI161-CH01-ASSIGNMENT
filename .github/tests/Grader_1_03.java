public class Grader_1_03 {
    static int pass = 0, fail = 0;
    public static void check(String label, boolean actual, boolean expected) {
        if (actual == expected) { pass++; System.out.println("PASS: " + label); }
        else { fail++; System.out.println("FAIL: " + label + " (expected " + expected + ", got " + actual + ")"); }
    }
    public static void main(String[] args) {
        check("isMultiple(12,4)", R1_03.isMultiple(12, 4), true);
        check("isMultiple(12,5)", R1_03.isMultiple(12, 5), false);
        check("isMultiple(0,5)", R1_03.isMultiple(0, 5), true);
        check("isMultiple(-8,4)", R1_03.isMultiple(-8, 4), true);
        check("isMultiple(7,7)", R1_03.isMultiple(7, 7), true);
        System.out.println(pass + " passed, " + fail + " failed");
        if (fail > 0) System.exit(1);
    }
}
