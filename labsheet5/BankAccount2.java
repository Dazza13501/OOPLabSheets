package labsheet5;

public class BankAccount2 {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count;


    public BankAccount2() {

        owner= "Owner not available";
        number=0;
        interestRate=0;

    }

    public BankAccount2(String owner, int number, double interestRate){

        setOwner(owner);
        setInterestRate(interestRate);
        incrementCount();
        setNumber(count);

    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }

    public static double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){

        BankAccount2.interestRate= interestRate;
    }
    public static int getCount(){
        return count;

    }
    private static void incrementCount(){
        count++;
    }

    public String toString(){

        return ("\n\nOwner: "+owner+" Account Number: "+number+" Interest Rate: "+interestRate);
    }


}