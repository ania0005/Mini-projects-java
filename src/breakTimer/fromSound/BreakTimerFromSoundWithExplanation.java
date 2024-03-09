package breakTimer.fromSound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class BreakTimerFromSoundWithExplanation {

    private static final int BREAK_DURATION = 10 * 60 * 1000;                                 // Длительность перерыва: 10 минут в миллисекундах
    private static final int BREAK_INTERVAL = 60 * 60 * 1000;                                  // Интервал каждый час в миллисекундах

    private static final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) {
        Timer timer = new Timer();


        timer.scheduleAtFixedRate(new BreakTask(), 0, BREAK_INTERVAL);                   // Запускаем задачу BreakTask с фиксированной периодичностью

        System.out.println("Программа запущена. Для завершения нажмите Enter. - " + formatter.format(new Date()));

                                                                                                // Ждем, пока пользователь нажмет Enter
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

                                                                                                // Отменяем таймер перед выходом из программы
        timer.cancel();
        System.exit(0);
    }

    private static class BreakTask extends TimerTask {                                           // определение вложенного статического (вложенного в другой класс) класса с именем BreakTask,
                                                                                                 // который расширяет класс TimerTask. TimerTask - это абстрактный класс в Java,
                                                                                                 // предоставляющий шаблон для создания задач, которые можно выполнить по расписанию.
        @Override
        public void run() {

            try {                                                                                   // Засыпаем поток на BREAK_INTERVAL миллисекунд (один час)
                Thread.sleep(BREAK_INTERVAL);                                                       // метод вызывается для текущего потока и заставляет его заснуть
                                                                                                    // (в режим ожидания) на указанное количество миллисекунд
            } catch (InterruptedException e) {                                                      // метод sleep может привести к InterruptedException, если другой
                                                                                                    // поток прерывает "спящий" поток. В таком случае, метод выкинет
                throw new RuntimeException(e);                                                      //исключение InterruptedException.
            }                                                                                       // Здесь мы ловим исключение InterruptedException, которое может возникнуть
                                                                                                    // в случае, если поток, спящий в Thread.sleep, был прерван другим потоком. В данном случае, мы
                                                                                                    // оборачиваем исключение в объект RuntimeException и выбрасываем его дальше.


            playSound("sound22.wav");                                                       // Воспроизводим звук и выводим сообщение о начале перерыва
            System.out.println("Пора сделать перерыв! Длительность: 10 минут. - " + formatter.format(new Date()));


            try {
                Thread.sleep(BREAK_DURATION);                                                         // Засыпаем поток на BREAK_DURATION миллисекунд (10 минут)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            playSound("sound22.wav");                                                         // Воспроизводим звук и выводим сообщение о завершении перерыва
            System.out.println("Перерыв завершен. Возвращайтесь к работе! - " + formatter.format(new Date()));


            try {
                Thread.sleep(BREAK_INTERVAL);                                                           // Засыпаем поток на BREAK_INTERVAL миллисекунд (один час)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        private void playSound(String filename) {
            try {
                                                                                                        // Получаем AudioInputStream из звукового файла
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filename).getAbsoluteFile());
                                                                                                        //строка создает объект AudioInputStream, представляющий звуковой
                                                                                                        // поток из указанного звукового файла. Метод AudioSystem.getAudioInputStream
                                                                                                        // выполняет эту операцию, а new File(filename).getAbsoluteFile() создает объект
                                                                                                        // File из имени файла и получает его абсолютный путь.

                Clip clip = AudioSystem.getClip();                                                      //Эта строка создает объект Clip. Clip - это механизм для воспроизведения звука в Java Sound API.
                                                                                                        // Открываем звуковой поток для воспроизведения
                clip.open(audioInputStream);                                                            //Открывает звуковой поток из AudioInputStream для воспроизведения в Clip.
                                                                                                        // Теперь Clip готов к воспроизведению звука из указанного файла.
                                                                                                        // Запускаем воспроизведение звука
                clip.start();                                                                           // Запускает воспроизведение звука с помощью метода start() объекта Clip.
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {        // В случае возникновения ошибки (например, если файл не поддерживается, произошла ошибка
                                                                                                        // ввода/вывода или линия звука недоступна), исключение обрабатывается.
                                                                                                        // В данном случае, вызывается printStackTrace()
                                                                                                        // Выводим стек вызовов в случае ошибки
                e.printStackTrace();
            }
        }
    }
}