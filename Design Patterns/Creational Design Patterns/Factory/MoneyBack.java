public class MoneyBack implements CreditCard{

    @Override
    public String getCardType() {
        return "MoneyBack";
    }

    @Override
    public int getCardLimit() {
        return 1500;
    }

    @Override
    public int getAnnualCharge() {
        return 50;
    }
    
}
