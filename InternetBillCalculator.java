import java.util.Scanner;

public class InternetBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter data usage
        System.out.print("Enter total data consumed in GB: ");
        int totalGB = sc.nextInt();

        int billAmount;

        if (totalGB < 10) {
            billAmount = 300; // Basic charge
        } else if (totalGB <= 30) {
            billAmount = 300 + 5 * (totalGB - 10);
        } else {
            billAmount = 400 + 3 * (totalGB - 30);
        }

        // Display result
        System.out.println("Your monthly bill is: Rs. " + billAmount);
        
        sc.close();
    }
}
