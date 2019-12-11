package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.List;

public class BlackJackPlayer {
    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

}
