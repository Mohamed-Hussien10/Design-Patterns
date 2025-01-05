public class CreditFactory {
    
    public static CreditCard getCreditCard(String cardType) {
        if (cardType.equals("Titanum")) {
            return new Titanum();
        } else if (cardType.equals("Platinum")) {
            return new Platinum();
        } else if (cardType.equals("MoneyBack")) {
            return new MoneyBack();
        } else {
            return null;
        }
    }
}
