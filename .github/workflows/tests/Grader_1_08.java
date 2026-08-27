public class Grader_1_08 {
    static int pass = 0, fail = 0;
    public static void check(String label, int actual, int expected) {
        if (actual == expected) { pass++; System.out.println("PASS: " + label); }
        else { fail++; System.out.println("FAIL: " + label + " (expected " + expected + ", got " + actual + ")"); }
    }
    public static void main(String[] args) {
        check("numVowels(Hello World)", R1_08.numVowels("Hello World"), 3);
        check("numVowels(AEIOUaeiou)", R1_08.numVowels("AEIOUaeiou"), 10);
        check("numVowels(bcdfg)", R1_08.numVowels("bcdfg"), 0);
        check("numVowels(empty)", R1_08.numVowels(""), 0);
        System.out.println(pass + " passed, " + fail + " failed");
        if (fail > 0) System.exit(1);
    }
}
