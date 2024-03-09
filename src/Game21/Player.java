package Game21;

import java.util.Arrays;

public class Player {
    //Класс Game21.Player: - игрок
    //
    //Поля:
    //name (String) - имя игрока.
    //hand (Game21.Card[]) - текущие карты игрока (карты игрока текущего раунда).
    //score (int) - счет за текущий раунд.
    //totalScore (int) - общий счет игры.
    //Конструктор для инициализации имени игрока и начального состояния.
    //Метод drawCard(Game21.Card card) для добавления карты в руку и обновления счета score.
    //Метод resetRound() для сброса руки и счета за раунд.
    //Метод addPointToTotalScore() для добавления балла к общему счету.
    private final String NAME;
    private Card[] hand;
    private int score;
    private int totalScore;

    public Player(String name) {
        this.NAME = name;
        this.hand = new Card[0];
    }

    public void drawCard(Card card) {
        Card[] copy = Arrays.copyOf(this.hand, this.hand.length + 1);
        copy[copy.length - 1] = card;
        this.hand = copy;
        this.score += card.getValue();
        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy) + "    " + totalScore + " очко(в)");

    }

    public void resetRound() {
        this.score = 0;
        this.hand = new Card[0];

    }

    public void addPointToTotalScore() {
        this.totalScore++;
    }

    public int getScore() {
        return score;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
