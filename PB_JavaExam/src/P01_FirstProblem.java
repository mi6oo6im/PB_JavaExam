import java.util.Scanner;

public class P01_FirstProblem {
// 01. Cat Diet
    public static void main(String[] args) {
        // fats, proteins, and carbohydrates
        // 1 gram fats = 9 calories
        // 1 gram proteins = 4 calories
        // 1 gram carbohydrates = 4 calories
        Scanner scanner = new Scanner(System.in);

        int fatsPercent = Integer.parseInt(scanner.nextLine());
        int proteinsPercent = Integer.parseInt(scanner.nextLine());
        int carbohydratesPercent = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());

        double gramsFats = (totalCalories * fatsPercent) * 1.0 / 100 / 9;
        double gramsProtein = (totalCalories * proteinsPercent) * 1.0 / 100 / 4;
        double gramsCarbohydrates = (totalCalories * carbohydratesPercent) * 1.0 / 100 / 4;

        double totalMass = gramsFats + gramsProtein + gramsCarbohydrates;

        double caloriesPerGram = totalCalories / totalMass;

        int percentWithoutWater = 100 - waterPercent;
        double finalCaloriesPerGram = caloriesPerGram * percentWithoutWater / 100;

        System.out.printf("%.4f", finalCaloriesPerGram);
    }
}
