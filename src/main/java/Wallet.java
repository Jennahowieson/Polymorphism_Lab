import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> scannableCards;


    public Wallet(String name) {
        this.name = name;
        this.scannableCards = new ArrayList<IScan>();

    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.scannableCards.size();
    }

    public void addItem(IScan scannableCards) {
        this.scannableCards.add(scannableCards);
    }

    public String scan(IScan scannableCard) {
        return scannableCard.scan();
    }
}
