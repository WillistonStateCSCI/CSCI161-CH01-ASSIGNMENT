//Exercise C-1.25
//Hint - You might use a StringBuilder to compose the pieces of the string into one large string (including newlines)

public class C1_25 {

    public static void main(String[] args) {
        CreditCard24[] wallet = new CreditCard24[3];
        wallet[0] = new CreditCard25("John Bowman", "California Savings", "5931 0375 9387 5309", 5000);
        wallet[1] = new CreditCard25("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard25("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        for(int val = 1; val <=16; val++){
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for(CreditCard25 card : wallet){
            //TODO: Modify code below to use your new toString method instead of printSummary()
            CreditCard25.printSummary(card); // calling static method
            while(card.getBalance()>200){
                card.makePayment(200);
                System.out.println("New balance = "+card.getBalance());
            }
        }
    }

}