package fundamentals.day01;

public class Task16SecondsConverter {
    public static void main(String[] args) {
        int time = 3671;
        int hours = (time / 60) / 60;
        int remainingMinutes = (time / 60) % 60;
        int remainingSeconds = time % 60;

        System.out.println(hours);
        System.out.println(remainingMinutes);
        System.out.println(remainingSeconds);

    }
}
