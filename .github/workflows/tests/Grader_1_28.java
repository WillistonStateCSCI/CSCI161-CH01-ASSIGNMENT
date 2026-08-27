public class Grader_1_28 {
    public static void main(String[] args) throws Exception {
        java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
        java.io.PrintStream old = System.out;
        System.setOut(new java.io.PrintStream(buffer));
        P1_28.main(new String[0]);
        System.setOut(old);
        String[] lines = buffer.toString().split("\\R");
        long nonEmpty = java.util.Arrays.stream(lines).filter(l -> !l.isBlank()).count();
        System.out.
