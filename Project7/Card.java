package Project7;

public class Card implements Comparable<Card> {

    private char symbol;
    private int number;

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card c) {
        return Character.compare(this.symbol, c.symbol);
    }
}
