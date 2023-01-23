public class DebitCard extends BankCard implements IScan{
    private String cardNumber;
    private int sortCode;
    private int accountNumber;
    private String expiryDate;
    private int securityNumber;
    private CardType cardType;

    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber,CardType cardType) {
        super(cardNumber, expiryDate, securityNumber, cardType);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String scan() {
        return "Payment Complete";
    }
}
