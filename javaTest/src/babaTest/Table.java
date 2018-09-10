package babaTest;

import java.util.ArrayList;

public class Table {
	//捨てられたカードを保持しておくためのリスト
	private ArrayList disposedCards_ = new ArrayList();

	public void disposedCard(Card card[]) {
		for(int index=0;index < card.length;index++ ) {
			//捨てられたカードを表示する
			System.out.print(card[index]+" ");
		}

		System.out.println("捨てました");

		//捨てられたカードをリストに追加して保持しておく
		disposedCards_.add(card);
	}

}
