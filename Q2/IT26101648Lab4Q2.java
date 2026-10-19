import java.util.Scanner;

public class IT26101648Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double examMark, labMark;
        double examPercentage, labPercentage, finalMark;

        // --- Input and Validate Exam Mark ---
        System.out.print("Enter exam marks (out of 100): ");
        examMark = input.nextDouble();
        while (examMark < 0 || examMark > 100) {
            System.out.print("Invalid! Enter exam marks between 0 and 100: ");
            examMark = input.nextDouble();
        }

        // --- Input and Validate Lab Mark ---
        System.out.print("Enter lab submission marks (out of 100): ");
        labMark = input.nextDouble();
        while (labMark < 0 || labMark > 100) {
            System.out.print("Invalid! Enter lab marks between 0 and 100: ");
            labMark = input.nextDouble();
        }

        // --- Input and Validate Percentages ---
        System.out.print("Enter percentage for exam mark: ");
        examPercentage = input.nextDouble();
        System.out.print("Enter percentage for lab mark: ");
        labPercentage = input.nextDouble();

        while (examPercentage + labPercentage != 100) {
            System.out.println("Invalid! Percentages must add up to 100.");
            System.out.print("Enter percentage for exam mark: ");
            examPercentage = input.nextDouble();
            System.out.print("Enter percentage for lab mark: ");
            labPercentage = input.nextDouble();
        }

        // --- Calculate Final Mark ---
        finalMark = (examMark * examPercentage / 100) + (labMark * labPercentage / 100);

        System.out.println("Final Mark of the module is: " + finalMark);

        input.close();
    }
}