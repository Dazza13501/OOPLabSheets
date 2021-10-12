package labsheet5;

public class BankAccount {

    private String owner;
    private int number;
    private static double interestRate;


    public BankAccount() {

        owner= "Owner not available";
        number=0;
        interestRate=0;

    }

    public BankAccount(String owner, int number, double interestRate){

        this.owner=owner;
        this.number=number;
        BankAccount.interestRate=interestRate;

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

        BankAccount.interestRate= interestRate;
    }

    public String toString(){

        return ("\n\nOwner: "+owner+" Account Number: "+number+" Interest Rate: "+interestRate);
    }


}