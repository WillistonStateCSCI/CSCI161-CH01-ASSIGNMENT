//Exercise R-1.11
//Hint - Start by trying to make each of the wallets go over their credit limits
//All changes will take place in this file, leave CreditCard.java as is.
public class R1_13 {
public static void main(String[] args) {
        CreditCard13[] wallet = new CreditCard13[3];
        wallet[0] = new CreditCard13("John Bowman", "California Savings", "5931 0375 9387 5309", 5000);
        wallet[1] = new CreditCard13("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard13("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        //TODO:  Modify the declaration in this for loop to make one of the cards go over its limit.
        //Add a comment explaining which card goes over the limit and why
        for(int val = 1; val <=16; val++){
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for(CreditCard13 card : wallet){
            CreditCard13.printSummary(card); // calling static method
            while(card.getBalance()>200){
                card.makePayment(200);
                System.out.println("New balance = "+card.getBalance());
            }
        }
    }

}
