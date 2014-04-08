package com.locationwallet;

import com.fima.cardsui.objects.CardStack;
import com.fima.cardsui.views.CardUI;

public class CardManager {

	
	// Show original cards
	public void ShowCards(CardUI mCardView) {
		// init CardView
		mCardView.setSwipeable(true);

		CardStack stackPlay = new CardStack();
		stackPlay.setTitle("");
		mCardView.addStack(stackPlay);

		mCardView.addCard(new MyPlayCard("Cafe",
				"Address", "112-96-3322", "#33b6ea", "#33b6ea", true, false));

		mCardView
				.addCardToLastStack(new MyPlayCard(
						"StarBucks",
						"1055 Escalone Ave, Sunnyvale, CA",
						"112-96-3322",
						"#e00707", "#e00707", true, true));

		// add one card
		mCardView
				.addCard(new MyPlayCard(
						"Hotel",
						"430 Giannini Dr, Santa Clara",
						"112-96-3322",
						"#f2a400", "#9d36d0", true, true));

		mCardView
				.addCardToLastStack(new MyPlayCard(
						"Home",
						"938 78th Street NY",
						"112-96-3322",
						"#4ac925", "#222222", true, true));
		// draw cards
		mCardView.refresh();

	}
}
