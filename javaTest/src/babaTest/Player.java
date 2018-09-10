package babaTest;

public class Player {
	private Master master_;

	private Table table_;

	private Hand myHand_ = new Hand();

	private String name_;


	public Player(String name,Master master,Table table) {
		this.name_ = name;
		this.master_ = master;
		this.table_ = table;
	}

	public void play(Player nextPlayer) {
		//次のプレイヤーに手札を出してもらう
		Hand nextHand = nextPlayer.showHand();

		Card pickedCard = nextHand.pickCard();

		//引いた結果を表示
		System.out.println(this + ":"+ nextPlayer + "さんから" + pickedCard + "を引きました");

		//引いたカードを自分の手札に加え、同じ数のカードがあったら捨てる
		dealCard(pickedCard);

		//手札が0になったからどうか調べる
		if(myHand_.getNumberOfCards() == 0) {
			master_.declareWin(this);
		}
		else {
			System.out.println(this + ":残りの手札は" + myHand_ + "です");
		}
	}

	public Hand showHand() {
		if(myHand_.getNumberOfCards() == 1) {
			master_.declareWin(this);
		}

		//見せる前にシャッフルする
		myHand_.shuffle();

		return myHand_;
	}

	public void receiveCard(Card card) {
		dealCard(card);
	}

	private void dealCard(Card card) {
		myHand_.addCard(card);

		Card[] sameCards = myHand_.findSameNumberCard();

		if(sameCards != null) {
			System.out.println(this + ":");
			table_.disposedCard(sameCards);
		}
	}

	public String toString() {
		return name_;
	}

}
