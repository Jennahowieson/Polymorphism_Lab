public enum CardType {

    PERSONAL ("Personal",2),
    BUSINESS("Business", 4);

    private final String type;
    private final int interestRate;

    CardType(String type, int interestRate) {
        this.type = type;
        this.interestRate = interestRate;
    }

    public String getType() {
        return type;
    }

    public int getInterestRate() {
        return interestRate;
    }
}
