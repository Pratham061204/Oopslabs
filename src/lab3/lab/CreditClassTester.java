package lab3.lab;

import java.util.Scanner;

public class CreditClassTester {

        public static void main(String[] args) {
            CreditCard card = new CreditCard("John Doe", "1234567890123456", true, 1234, "12/25", 3, 1000, 5000);
            card.display();
            card.changeCardStatus(true);
            card.transact(500);
            card.changePin(567);
            card.transact(515);
            System.out.println(card.getCardTypeName());

            card.display();
    }
}

class CreditCard {
    String name;
    String cardNo;
    boolean enabled;
    int pin;
    String expiryMonth;
    int cardType;
    //Platinum =3, Gold =2, Silver =1
    int currentCredit;
    int creditLimit;

    public CreditCard(String name, String cardNo, boolean enabled, int pin, String expiryMonth, int cardType, int currentCredit, int creditLimit) {
        this.name = name;
        this.cardNo = cardNo;
        this.enabled = enabled;
        this.pin = pin;
        this.expiryMonth = expiryMonth;
        this.cardType = cardType;
        this.currentCredit = currentCredit;
        this.creditLimit = creditLimit;
    }

    public boolean isEnabled() {
        return enabled;
    }

    protected void changePin(int newPin){
        pin=newPin;
    }
    protected void transact(int amt){
        if(enabled!=false&& amt>0 && currentCredit>0 && ((currentCredit-amt)>=0) &&creditLimit>=amt&&isPinValid()==true){
            double discount=0;
            if(cardType==3){
                discount=0.03;
            }
            else if(cardType==2){
                    discount=0.02;
                }
            else if(cardType==1){
                discount=0.01;
            }
            double discountedAmount=amt-(amt*discount);
            currentCredit-=discountedAmount;

            System.out.println("Transaction completed ." +
                    "Current Credit amount is "+currentCredit);
            }
        else {
            System.out.println("Transaction failed due to insufficient balance or Incorrect PIN or Card Status");
        }
        }
        public void changeCardStatus(boolean status){
            System.out.println("Card status before "+enabled);
        enabled=status;
            System.out.println("Card status after "+enabled);
        }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Card Number: " + cardNo);
        System.out.println("Enabled: " + enabled);
        System.out.println("Expiry Month: " + expiryMonth);
        System.out.println("Card Type: " + getCardTypeName());
        System.out.println("Current Credit: $" + currentCredit);
        System.out.println("Credit Limit: $" + creditLimit);
    }

    public String getCardTypeName() {
        switch (cardType){
            case 1-> {
                return "Silver";
            }
            case 2->{
                return "Gold";
            }
            case 3->{
                return "Platinum";
            }
            default -> {
                return "Invalid";
            }
        }
    }
    public boolean isPinValid(){
        if(isEnabled()==true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter PIN");
            int p = Integer.parseInt(sc.nextLine());
            if (p == pin) {
                return true;
            } else {
                System.out.println("Please enter valid PIN");
                return false;
            }
        }
        return false;
    }

}
