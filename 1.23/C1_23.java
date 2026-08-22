//Exercise C-1.23
//Hint - Go back to the definition of dot product and write a for loop that matches it.

public class C1_23 {
    public static void main(String[] args) {
        //Math method has been provided for you to test your code
        //Adjust int[] a and b accordingly
        int [] a = new int []{1, 2, 3};
        int [] b = new int []{1, 2, 3};

        int [] c = compute(a, b);

        for(int n : c){
            System.out.print(n+" ");
        }
    }
    public static int[] compute(int[] a, int[] b){
        // Add/Modify code below
        return a;
    }
}
