public class CreditCard extends BankCard implements IScan {
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;
    private CardType cardType;


    public CreditCard(String cardNumber, String expiryDate, int securityNumber, CardType cardType) {
        super(cardNumber, expiryDate, securityNumber, cardType);
    }

    public String scan() {
        return "Payment Successful";
    }
}
