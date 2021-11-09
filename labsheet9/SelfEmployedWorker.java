package labsheet9;

public final class SelfEmployedWorker extends Employee {


    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName, double estimatedIncome) {
        super(firstName, lastName);
        setEstimatedIncome(estimatedIncome);
    }

    public double earnings() {
        return estimatedIncome;
    }

    public void setEstimatedIncome(double estimatedIncome) {
        this.estimatedIncome = (int)(Math.random()*(900-399)+400);
    }

    public String toString(){

        return "Employee's name is: " +super.toString()+ " Estimated income is: " +estimatedIncome;
    }
}
