import java.util.Random;

public class NaroRainfall {
    public static void main(String[] args) {
        Random random = new Random();
        int[] rainfall = new int[30];
        int total = 0;
        int wetDays = 0;

        System.out.println("=== NARO Namulonge - Monthly Rainfall Report ===");
        System.out.println("Daily Readings (mm):");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < 30; i++) {
            rainfall[i] = random.nextInt(61);
            total += rainfall[i];
            if (rainfall[i] > 30) {
                wetDays++;
            }
            System.out.println("Day " + (i + 1) + ": " + rainfall[i] + " mm");
        }

        double average = (double) total / 30;

        System.out.println("-------------------------------------------");
        System.out.println("Total Rainfall    : " + total + " mm");
        System.out.println("Average Daily     : " + average + " mm");
        System.out.println("Wet Days (>30 mm) : " + wetDays);

        System.out.print("Month Classification: ");
        if (total <= 300) {
            System.out.println("DRY (total <= 300 mm)");
        } else if (total <= 600) {
            System.out.println("NORMAL (301 - 600 mm)");
        } else {
            System.out.println("FLOOD-RISK (total > 600 mm)");
        }
    }
}