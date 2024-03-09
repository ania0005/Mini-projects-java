package breakTimer.fromSound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class BreakTimerFromSound {

    private static final int BREAK_DURATION = 10 * 60 * 1000; // Длительность перерыва 10 минут
    private static final int BREAK_INTERVAL = 60 * 60 * 1000; // Интервал каждый час

    private static final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new BreakTask(), 0, BREAK_INTERVAL);
        System.out.println("Программа запущена. Для завершения нажмите Enter. - " + formatter.format(new Date()));

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        timer.cancel();
        System.exit(0);
    }

    private static class BreakTask extends TimerTask {

        @Override
        public void run() {
            try {
                Thread.sleep(BREAK_INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            playSound("sound22.wav");
            System.out.println("Пора сделать перерыв! Длительность: 10 минут. - " + formatter.format(new Date()));
            try {
                Thread.sleep(BREAK_DURATION);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            playSound("sound22.wav");
            System.out.println("Перерыв завершен. Возвращайтесь к работе! - " + formatter.format(new Date()));
            try {
                Thread.sleep(BREAK_INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        private void playSound(String filename) {
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filename).getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                e.printStackTrace();
            }
        }
    }
}
