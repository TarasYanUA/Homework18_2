import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyTicket {
    public static void main(String[] args) throws IOException {
        int[] arrayOfNumbers = inputNumbers();
        boolean isLuckTicket = checkIsLuckTicket(arrayOfNumbers);
        printResult(isLuckTicket);
    }

    public static int[] inputNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayOfNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter " + (i + 1) + " number of the ticket: ");
            int number = Integer.parseInt(reader.readLine());
            arrayOfNumbers[i] = number;
        }
        return arrayOfNumbers;
    }

    private static int checkFirstThreeNumbers(int[] arrayOfNumbers) {
        int firstThreeSum = arrayOfNumbers[0] + arrayOfNumbers[1] + arrayOfNumbers[2];
        return firstThreeSum;
    }

    private static int checkSecondThreeNumbers(int[] arrayOfNumbers) {
        int secondThreeSum = arrayOfNumbers[3] + arrayOfNumbers[4] + arrayOfNumbers[5];
        return secondThreeSum;
    }

    public static boolean checkIsLuckTicket(int[] arrayOfNumbers) {
        int firstThreeSum = checkFirstThreeNumbers(arrayOfNumbers);
        int secondThreeSum = checkSecondThreeNumbers(arrayOfNumbers);
        return (firstThreeSum) == (secondThreeSum);
    }

    public static void printResult(boolean isLuckyTicket) {
        if (isLuckyTicket) {
            System.out.println("Lucky ticket: true");
        } else {
            System.out.println("Sorry, try again!");
        }
    }
}
