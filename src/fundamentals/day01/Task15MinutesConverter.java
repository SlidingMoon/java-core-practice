package fundamentals.day01;

public class Task15MinutesConverter {
    public static void main(String[] args) {
        int allTime = 8923;
        int hours = allTime / 60;
        int remainingForHour = allTime % 60;
        System.out.println(hours);
        System.out.println(remainingForHour);
    }
}
