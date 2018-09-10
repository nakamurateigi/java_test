package babaTest;

public class OldMaid {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Master master = new Master();

		//テーブルの生成
		Table field = new Table();

		//プレイヤーの生成
		Player murata = new Player("村田",master, field);
		Player yamada = new Player("山田",master, field);
		Player saito = new Player("斎藤",master, field);

		//進行役へプレイヤーを登録
		master.registerPlayer(murata);
		master.registerPlayer(yamada);
		master.registerPlayer(saito);

		//トランプを生成
		Hand trump = createTrump();

		//ゲームの準備をする
		master.prepareGame(trump);

		//ゲームを開始する
		master.startGame();

	}

	private static Hand createTrump() {
		Hand trump = new Hand();

		//各スート53枚のカードを生成する
		for(int number = 1; number <= 13; number++) {
			trump.addCard(new Card(Card.SUIT_CLUB,number));
			trump.addCard(new Card(Card.SUIT_DIAMOND,number));
			trump.addCard(new Card(Card.SUIT_HEART,number));
			trump.addCard(new Card(Card.SUIT_SPADE,number));
		}

		//ジョーカーも生成
		trump.addCard(new Card(0,Card.JOKER));

		return trump;
	}

}
