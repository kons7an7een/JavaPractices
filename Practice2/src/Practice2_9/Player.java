package Practice2_9;

public class Player {

    private Card[] cards = new Card[5];

    Player() {
        for (int i = 0; i < 5; i++)
            cards[i] = new Card("", "");
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }
}