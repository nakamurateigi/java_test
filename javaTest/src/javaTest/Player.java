package javaTest;

public class Player {
	//ジャンケンの手を表す定数
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	/*プレイヤーの名前*/
	private String name_;

	/*プレイヤーの勝った回数*/
	private int winCount_ = 0;

	private Tactics tactics_;

	public Player(String name) {
		name_ = name;
	}

	/*
	 * ジャンケンの手を出す
	 *
	 */
	public int showHand() {


		int hand = tactics_.readTactics();

		return hand;
	}

	/*
	 * 審判から勝敗を聞く
	 *
	 */
	public void notifyResult(boolean result) {
		if(result == true) {
			winCount_++;
		}

	}

	/*
	 * 自分の勝った回数を答える
	 */
	public int getCountWin() {
		return winCount_;
	}

	//プレイヤーの名前を答える
	public String getName() {
		return name_;
	}

	//プレイヤーに戦略を渡す
	void setTactics(Tactics tactics) {
		tactics_ = tactics;
	}

}
