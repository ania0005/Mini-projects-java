package Game21;

import java.util.Iterator;
import java.util.Scanner;

public class Game21App {
    //Игровой процесс:
    //При старте игры игроку предлагается ввести имя.
    //Создается объект игрока и перемешанная колода карт.
    //Размер массива карт игрока при инициализации игрока и перезапуске игры равен 0 new Card[0];
    //Каждый раз когда игрок получает новую карту, необходимо увеличить размер массива на 1
    // (смотри метод drawCard(Card card))
    //Массив карт игрока должен быть всегда сортирован по полю suit - в алфавитном порядке и value - по возрастанию.
    //Игроку предлагается продолжить раунд или завершить его (ввод в консоль "y" для продолжения раунда):
    //При продолжении раунда (если игрок ввел "y") игрок берет карту из колоды. (используйте Iterator в классе
    // Deck что бы получить следующую карту из колоды)
    //При завершении раунда (если игрок ввел "e") проверяется счет и, если достигнута сумма 21, к общему счету
    // добавляется балл (метод addPointToTotalScore()).
    //После завершения раунда текущие карты и счет сбрасываются (метод resetRound()).
    //Игра заканчивается, когда колода карт иссякнет, с выводом общего счета игрока.
    //Ввод и вывод
    //для ввода используйте Scanner
    //результаты выводите в консоль
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        Player player = new Player(name);
        Deck deck = new Deck();
        System.out.println("Начинаем игру");
        System.out.println("Получите карту");

        Iterator<Card> deckIterator = deck.iterator();
        while (deckIterator.hasNext()) {

            System.out.println("Ваши карты:");
            player.drawCard(deckIterator.next());
            System.out.println("Хотите взять еще одну карту?   Y/N");
            String answer  = scanner.nextLine();

            while (!answer.equals("Y") && !answer.equals("N")){
                System.out.println("Вы ввели не корректный ответ, введите Y или N");
                answer  = scanner.nextLine();
              }

            switch (answer) {
                case "Y":

                    if (player.getScore() == 21) {
                        player.addPointToTotalScore();
                        player.resetRound();
                        break;
                    } else
                        break;

                case "N":
                    if (player.getScore() != 21) {
                        player.resetRound();
                        System.out.println("Начинаем новый раунд");
                        break;
                    } else {
                        player.addPointToTotalScore();
                        player.resetRound();
                        System.out.println("Начинаем новый раунд");
                        break;
                    }
            }
        }
        System.out.println("Игра окончена");
        System.out.println("Ваш счет " + player.getTotalScore() + " очка(ов)");
    }

}
