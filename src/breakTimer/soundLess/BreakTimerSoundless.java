package breakTimer.soundLess;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class BreakTimerSoundless {
    private static final int BREAK_DURATION = 10 * 60 * 1000;
    private static final int BREAK_INTERVAL = 60 * 60 * 1000;
    private static final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new BreakTask(timer), 0, BREAK_INTERVAL);

        System.out.println("Программа запущена. Для завершения нажмите Enter. - " + formatter.format(new Date()));

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        timer.cancel();  // Отменяем таймер перед выходом из программы
        System.exit(0);

    }

    private static class BreakTask extends TimerTask {
        private final Timer timer;

        public BreakTask(Timer timer) {
            this.timer = timer;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(BREAK_INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Пора сделать перерыв! Длительность: 10 минут. - " + formatter.format(new Date()));
            try {
                Thread.sleep(BREAK_DURATION);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Перерыв завершен. Возвращайтесь к работе! - " + formatter.format(new Date()));
            try {
                Thread.sleep(BREAK_INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
