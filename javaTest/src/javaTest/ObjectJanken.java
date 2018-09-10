package javaTest;

public class ObjectJanken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Judge saito = new Judge();

		Player murata = new Murata("村田さん");

		Tactics murataTactics = new AskTactics();

		murata.setTactics(murataTactics);

		Player yamada = new Yamada("山田さん");

		Tactics yamadaTactics = new RandomTactics();

		yamada.setTactics(yamadaTactics);

		saito.startJanken(murata, yamada);

	}

}
