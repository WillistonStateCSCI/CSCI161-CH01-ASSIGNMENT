public class Grader_1_06 {
    static int pass = 0, fail = 0;
    public static void check(String label, int actual, int expected) {
        if (actual == expected) { pass++; System.out.println("PASS: " + label); }
        else { fail++; System.out.println("FAIL: " + label + " (expected " + expected + ", got " + actual + ")"); }
    }
    public static void main(String[] args) {
        check("sumOdd(5)", R1_06.sumOdd(5), 9);
        check("sumOdd(6)", R1_06.sumOdd(6), 9);
        check("sumOdd(1)", R1_06.sumOdd(1), 1);
        check("sumOdd(10)", R1_06.sumOdd(10), 25);
        System.out.println(pass + " passed, " + fail + " failed");
        if (fail > 0) System.exit(1);
    }
}
