import java.util.ArrayList;

/**
 * The main class representing the NoteApp application.
 * This class orchestrates user interactions and manages the application's core functionalities.
 */
public class NoteApp {
    // Components for user interaction and data management
    private InputHandler inputHandler;
    private UserManager userManager;
    private NoteCategoryManager categoryManager;
    private NoteCollectionWithCategories noteCollection;

    /**
     * Constructs a NoteApp object and initializes its components.
     * Initializes InputHandler for user input, UserManager for user management,
     * NoteCategoryManager for note categories, and NoteCollectionWithCategories for note storage.
     */
    public NoteApp() {
        this.inputHandler = new InputHandler();
        this.userManager = new UserManager();
        this.categoryManager = new NoteCategoryManager();
        this.noteCollection = new NoteCollectionWithCategories();
    }

    /**
     * Starts the NoteApp application, presenting a menu to the user and handling their input.
     */
    public void start() {
        while (true) {
            // Displaying main menu options
            System.out.println("\n1. Register\n2. Login\n3. Add Note\n4. View All Notes\n5. Exit\n6. Delete");

            // Getting user's choice
            int choice = Integer.parseInt(inputHandler.getUserInput("Enter your choice"));

            // Handling user's choice
            switch (choice) {
                case 1:
                    // User registration
                    String newUsername = inputHandler.getUserInput("Enter new username");
                    String newPassword = inputHandler.getUserInput("Enter password");
                    User newUser = new User(newUsername, newPassword);
                    userManager.addUser(newUser);
                    System.out.println("User registered successfully!");
                    break;

                case 2:
                    // User login
                    String username = inputHandler.getUserInput("Enter username");
                    String password = inputHandler.getUserInput("Enter password");
                    User loggedInUser = userManager.getUserByUsername(username);

                    if (loggedInUser != null && loggedInUser.authenticate(password)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid credentials. Please try again.");
                    }
                    break;

                case 3:
                    // Adding a new note
                    String noteTitle = inputHandler.getUserInput("Enter note title");
                    String noteContent = inputHandler.getUserInput("Enter note content");

                    // Add note category
                    String categoryName = inputHandler.getUserInput("Enter note category");
                    NoteCategory category = categoryManager.getOrCreateCategory(categoryName);

                    NoteWithCategory newNote = new NoteWithCategory(noteTitle, noteContent, category);
                    noteCollection.addNote(newNote);
                    System.out.println("Note added successfully!");
                    break;

                case 4:
                    ArrayList<Note> allNotes = noteCollection.getAllNotes();
                    System.out.println("\nAll Notes:");
                    for (Note note : allNotes) {
                        if (note instanceof NoteWithCategory) {
                            // Cast the note to NoteWithCategory and print detailed information
                            NoteWithCategory noteWithCategory = (NoteWithCategory) note;
                            System.out.println(noteWithCategory.toString());
                        } else {
                            // Handle the case where the note is not an instance of NoteWithCategory
                            System.out.println(note.toString());
                        }
                        System.out.println("---------------");
                    }
                    break;

                case 5:
                    // Exiting the application
                    System.out.println("Exiting the NoteApp. Goodbye!");
                    System.exit(0);
                    break;

                    case 6:
                    // Deleting a note
                    String noteTitleToDelete = inputHandler.getUserInput("Enter the title of the note you want to delete");
                    noteCollection.deleteNoteByTitle(noteTitleToDelete);
                    System.out.println("Note deleted successfully!");  // Note: This message will be printed regardless of deletion status
                    break;
                
                default:
                    // Handling invalid choices
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
        }
      }
    }

    public static void main(String[] args) {
        // Create a NoteApp object and start the application
        NoteApp noteApp = new NoteApp();
        noteApp.start();
    }
}
