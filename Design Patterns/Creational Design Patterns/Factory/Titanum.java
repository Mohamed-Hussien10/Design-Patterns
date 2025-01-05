public class Titanum implements CreditCard {

    @Override
    public String getCardType() {
       return "Titanum";
    }

    @Override
    public int getCardLimit() {
        return 53000;
    }

    @Override
    public int getAnnualCharge() {
        return 10;
    }
    
}
