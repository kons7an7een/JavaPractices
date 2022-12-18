package Practice2_9;

import java.util.*;

public class Poker {

    Random rand = new Random();
    private int n;
    private Card[] deck = new Card[52];
    private int l = deck.length;
    private Card[] cards = new Card[5];
    private String[] types = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
    private String[] colors = {"Пики", "Червы", "Крести", "Бубны"};

    Poker(int n) {
        this.n = n;
        setDeck(deck);
        for (int i = 0; i < this.n; i++) {
            setCardsFor1Player();
            System.out.println("Карты игрока " + (i+1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println("\t" + getCards()[j].getParameters());
            }
        }

    }

    private void setDeck(Card[] deck) {
        int i = 0;
        for (int j = 0; j < types.length; j++) {
            for (int k = 0; k < colors.length; k++) {
                this.deck[i] = new Card(types[j], colors[k]);
                i++;
            }
        }
    }

    private Card getRandomCard(Card[] deck) {

        int j = rand.nextInt(l);
        Card randomCard = deck[j];
        Card[] newDeck = new Card[l - 1];
        for (int i = 0; i < l; i++) {
            if (i < j) newDeck[i] = deck[i]; else
                if (i == j) continue; else
                    if (i > j) newDeck[i-1] = deck[i];
        }
        l--;
        for (int i = 0; i < l; i++)
            deck[i] = newDeck[i];
        return randomCard;
    }

    private void setCardsFor1Player() {
        for (int i = 0; i < 5; i++) {
            cards[i] = getRandomCard(deck);
        }
    }

    private Card[] getCards() {
        return cards;
    }

}
