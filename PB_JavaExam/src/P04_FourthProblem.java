import java.util.Scanner;

public class P04_FourthProblem {
// 04. Workout

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int targetKM = 1_000;
        int trainingDays = Integer.parseInt(scanner.nextLine());
        double dailyKilometers = Double.parseDouble(scanner.nextLine());;

        double totalKilometers = dailyKilometers;

        for (int day = 1; day <= trainingDays; day++) {
            int percentageIncrement = Integer.parseInt(scanner.nextLine());
            dailyKilometers = dailyKilometers + percentageIncrement * dailyKilometers / 100;
            totalKilometers += dailyKilometers;
        }
        double deltaKilometers = Math.ceil(Math.abs(totalKilometers - targetKM));
        if (totalKilometers >= targetKM){
            System.out.printf("You've done a great job running %.0f more kilometers!", deltaKilometers);
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", deltaKilometers);
        }
    }
}
