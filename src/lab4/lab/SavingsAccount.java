package lab4.lab;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double savingsBalance){
        this.savingsBalance=savingsBalance;
    }

    public void calculateMonthlyInterest(){
        double monthly=(annualInterestRate*savingsBalance)/12d;
        savingsBalance+=monthly;
        System.out.println("Monthly interest is "+monthly);
        System.out.println("Savings Balance is "+savingsBalance);
    }
    public void modifyInterestRate(double newInterestRate){
        annualInterestRate=newInterestRate;

    }
    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void main(String[] args) {

        SavingsAccount[] a =new SavingsAccount[3];
       a[0]=new SavingsAccount(2000);
       a[1]=new SavingsAccount(25000);
       a[2]=new SavingsAccount(383838);
        for(int i=0;i<a.length;i++){
        a[i].modifyInterestRate(0.04);
        a[i].calculateMonthlyInterest();
        a[i].modifyInterestRate(0.05);
        a[i].calculateMonthlyInterest();
    }}
}

