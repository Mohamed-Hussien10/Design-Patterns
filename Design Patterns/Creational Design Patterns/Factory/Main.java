public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = CreditFactory.getCreditCard("Titanum");
        System.out.println(creditCard.getCardType());
        System.out.println(creditCard.getCardLimit());
        System.out.println(creditCard.getAnnualCharge());
        
    }
}
