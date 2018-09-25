package blackjack_1;

public class Game {
	public void play() {
		System.out.println("===========BLACKJACK START===========");
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		
		Rule rule = new Rule();
		CardDeck cardDeck = new CardDeck();
		
	}
}
