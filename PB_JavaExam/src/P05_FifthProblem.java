import java.util.Scanner;

public class P05_FifthProblem {
// 05. Everest

    public static void main(String[] args) {
        // starting point 5 364 meters
        // goal point 8 848 meters
        // timeline 5 days
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int reachedHeight = 5_364;
        int days = 1;
        while (!input.equals("END")) {
            String willSleep = input;
            int climbedMeters = Integer.parseInt(scanner.nextLine());
            if (willSleep.equals("Yes")) {
                days++;
                if (days > 5){
                    break;
                } else {
                    reachedHeight += climbedMeters;
                }
            } else{
                reachedHeight += climbedMeters;
            }
            if (reachedHeight >= 8_848){
                break;
            }
            input = scanner.nextLine();
        }
        if (reachedHeight >= 8_848){
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.printf("Failed!%n" +
                    "%d", reachedHeight);
        }
    }
}
