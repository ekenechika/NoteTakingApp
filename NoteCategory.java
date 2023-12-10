/**
 * A class representing a category for notes in the NoteApp application.
 */
public class NoteCategory {
    private String categoryName;

    /**
     * Constructs a NoteCategory object with the specified category name.
     * @param categoryName The name of the category.
     */
    public NoteCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Gets the name of the category.
     * @return The name of the category.
     */
    public String getCategoryName() {
        return categoryName;
    }
}