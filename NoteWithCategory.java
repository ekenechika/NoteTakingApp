/**
 * A class representing a note with an associated category in the NoteApp application.
 */
public class NoteWithCategory extends Note {
    private NoteCategory category;

    /**
     * Constructs a NoteWithCategory object with the specified title, content, and category.
     * @param title The title of the note.
     * @param content The content of the note.
     * @param category The category of the note.
     */
    public NoteWithCategory(String title, String content, NoteCategory category) {
        super(title, content);
        this.category = category;
    }

    /**
     * Gets the category of the note.
     * @return The category of the note.
     */
    public NoteCategory getCategory() {
        return category;
    }

    /**
     * Returns a string representation of the note with the associated category.
     * @return The string representation of the note with the category.
     */
    @Override
    public String toString() {
        return super.toString() + "\nCategory: " + category.getCategoryName();
    }
    // Add a new method to get a formatted string without category information
    public String toShortString() {
        return super.toString();
    }
}