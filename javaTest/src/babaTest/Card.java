package babaTest;

public class Card {
	//ジョーカー
	public static final int JOKER = 0;
	//スペード
	public static final int SUIT_SPADE = 1;
	//ダイヤ
	public static final int SUIT_DIAMOND = 2;
	//クラブ
	public static final int SUIT_CLUB = 3;
	//ハート
	public static final int SUIT_HEART = 4;
	//カードのスート
	private int suit_;
	//カードの示す数
	private int number_;

	public Card(int suit,int number) {
		this.suit_ = suit;
		this.number_ = number;
	}

	public int getNumber() {
		return number_;
	}

	public String toString() {
		StringBuffer string = new StringBuffer();

		if(number_ > 0) {
			//スートの表示
			switch(suit_)
			{
			case SUIT_SPADE :
				string.append("S");
				break;

			case SUIT_DIAMOND:
				string.append("D");
				break;

			case SUIT_CLUB:
				string.append("C");
				break;

			case SUIT_HEART:
				string.append("H");
				break;

			default:
				break;
			}

			//数の表示
			switch(number_)
			{
			case 1:
				string.append("A");
				break;

			case 10:
				string.append("T");
				break;

			case 11:
				string.append("J");
				break;

			case 12:
				string.append("Q");
				break;

			case 13:
				string.append("K");
				break;

			default :
				string.append(number_);
				break;
		}
	}
	else {
		//ジョーカーを表す
		string.append("JK");
	}
	return string.toString();
	}
}
