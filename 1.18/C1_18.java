//Exercise C-1.18
//Hint - Use the Math.pow function for calculations.  Use your solution for norm(v,p) to implement norm(v).
public class C1_18 {
    public static void main(String[] args) {
        //The main method has been provided to test your code.
        //Change the values in vector and pVal as necessary to test your code.
        double [] vector = {4,3};
        int pVal = 6;

        System.out.println("The p-norm value of v is "+norm(vector, pVal));
        System.out.println("The Euclidean norm of v is "+norm(vector));
        
    }
    public static double norm(double[] v, int p){
        //TODO:  Add/Modify code to return the p-norm
        return 0.0;
    }

    public static double norm(double[] v){
        //TODO:  Add/Modify code to return the Euclidean norm
        return 0.0;
    }
}
