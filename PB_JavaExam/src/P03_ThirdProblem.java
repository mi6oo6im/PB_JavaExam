import java.util.Scanner;

public class P03_ThirdProblem {
// 03. Excursion Calculator

    public static void main(String[] args) {
        // 	            Пролет (spring)	    Лято (summer)	    Есен (autumn)	    Зима (winter)
        //До 5 човека	50.00 лв. на човек	48.50 лв. на човек	60.00 лв. на човек	86.00 лв. на човек
        //Над 5 човека	48.00 лв. на човек	45.00 лв. на човек	49.50 лв. на човек	85.00 лв. на човек
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double pricePerPerson = 0.0;
        if (peopleCount > 5){
            switch (season) {
                case "spring":
                    pricePerPerson = 48.0;
                    break;
                case "summer":
                    pricePerPerson = 45.0 * 0.85;  // - 15 % discount
                    break;
                case "autumn":
                    pricePerPerson = 49.5;
                    break;
                case "winter":
                    pricePerPerson = 85.0 * 1.08; // + 8 % overhead
                    break;
            }
        } else {
            switch (season) {
                case "spring":
                    pricePerPerson = 50.0;
                    break;
                case "summer":
                    pricePerPerson = 48.5 * 0.85; // - 15 % discount
                    break;
                case "autumn":
                    pricePerPerson = 60.0;
                    break;
                case "winter":
                    pricePerPerson = 86.0 * 1.08; // + 8 % overhead
                    break;
            }
        }
        System.out.printf("%.2f leva.", pricePerPerson * peopleCount);
    }
}
