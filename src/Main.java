import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nStarting Counter");

        try {
            System.out.print("\nEnter a first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter a second number: ");
            int number2 = input.nextInt();

            Counter counter = new Counter(number1, number2);

            if (counter.isFirstSmallerThan()) {
                System.out.printf(
                    "\nCount number is '%d'\n\n",
                    counter.getMaxCount()
                );
                counter.start();
            }
        } catch (InputMismatchException exception) {
            System.out.println(Message.INPUT_EXCEPTION.get());
            System.exit(0);
        } catch (InvalidParameterException exception) {
            System.out.println(Message.PARAMETERS_EXCEPTION.get());
            System.exit(0);
        }
    }
}
