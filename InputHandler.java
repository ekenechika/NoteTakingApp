import java.util.Scanner;

/**
 * A class for handling user input in the console.
 */
public class InputHandler {
    private Scanner scanner;

    /**
     * Constructs an InputHandler object and initializes the scanner.
     */
    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Gets user input with a provided prompt.
     * @param prompt The prompt to display to the user.
     * @return The user's input as a string.
     */
    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }
}