import java.util.Scanner;

public class P02_SecondProblem {
// 02. Maiden Party

    public static void main(String[] args) {
        //•	Любовно послание - 0.60 лв.
        //•	Восъчна роза - 7.20 лв.
        //•	Ключодържател - 3.60 лв.
        //•	Карикатура - 18.20 лв.
        //•	Късмет изненада - 22 лв.
        // Ако поръчаните артикули са 25 или повече магазинът прави отстъпка 35% от общата цена
        // 10% разход за хостинг

        Scanner scanner = new Scanner(System.in);
        double partyCost = Double.parseDouble(scanner.nextLine());
        int loveLettersCount = Integer.parseInt(scanner.nextLine());
        int waxRosesCount = Integer.parseInt(scanner.nextLine());
        int keyHoldersCount = Integer.parseInt(scanner.nextLine());
        int sketchCount = Integer.parseInt(scanner.nextLine());
        int luckyCharmsCount = Integer.parseInt(scanner.nextLine());

        double incomeFromLoveLetters = loveLettersCount * 0.60;
        double incomeFromWaxRoses = waxRosesCount * 7.20;
        double incomeFromKeyHolders = keyHoldersCount * 3.60;
        double incomeFromSketches = sketchCount * 18.20;
        double incomeFromLuckyCharms = luckyCharmsCount * 22.00;

        double totalIncomeBeforeDiscount = incomeFromLoveLetters + incomeFromWaxRoses + incomeFromKeyHolders +
                incomeFromSketches + incomeFromLuckyCharms;

        int totalProductsCount = loveLettersCount + waxRosesCount + keyHoldersCount + sketchCount + luckyCharmsCount;

        double discount = 0.0;

        if (totalProductsCount >= 25){
            discount = totalIncomeBeforeDiscount * 0.35;
        }
        double totalIncomeBeforeExpenses = totalIncomeBeforeDiscount - discount;
        double finalIncome = totalIncomeBeforeExpenses - totalIncomeBeforeExpenses * 0.1;
        double deltaMoney = Math.abs(finalIncome - partyCost);
        if (finalIncome >= partyCost){
            System.out.printf("Yes! %.2f lv left.", deltaMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", deltaMoney);
        }
    }
}
