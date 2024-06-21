package hk.exam.seven;

public class ExamMainSeven {

	public static void main(String[] args) {
        Player you = new Player("젤잘나가", 26);
        Player my = new Player("안졸리나제리", 24);

        you.shuffle();
        my.shuffle();

        for (int i = 1; i <= 3; i++) {
            Card[] yourCards = you.drawCard();
            Card[] myCards = my.drawCard();

            you.setScore(ArenaRule.getCardToJumsu(yourCards));
            my.setScore(ArenaRule.getCardToJumsu(myCards));

            System.out.print(i + "번째 ");

            ArenaRule.setGamePlayAssess(my, you);

            ArenaRule.gamePlayResultInfo(my, you);

            System.out.println();
        }
    }

}
