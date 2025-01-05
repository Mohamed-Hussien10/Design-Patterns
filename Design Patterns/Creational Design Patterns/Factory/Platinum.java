public class Platinum implements CreditCard {

    @Override
    public String getCardType() {
       return "Platinum";
    }

    @Override
    public int getCardLimit() {
       return 25000;
    }

    @Override
    public int getAnnualCharge() {
       return 30;
    }
    
}
