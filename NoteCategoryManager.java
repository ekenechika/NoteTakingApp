import java.util.ArrayList;

/**
 * A class managing note categories in the NoteApp application.
 */
public class NoteCategoryManager {
    private ArrayList<NoteCategory> categories;

    /**
     * Constructs a NoteCategoryManager object and initializes the list of categories.
     */
    public NoteCategoryManager() {
        this.categories = new ArrayList<>();
    }

    /**
     * Gets or creates a note category with the specified name.
     * @param categoryName The name of the category.
     * @return The existing or newly created NoteCategory.
     */
    public NoteCategory getOrCreateCategory(String categoryName) {
        for (NoteCategory category : categories) {
            if (category.getCategoryName().equalsIgnoreCase(categoryName)) {
                return category;
            }
        }

        // Create a new category if not found
        NoteCategory newCategory = new NoteCategory(categoryName);
        categories.add(newCategory);
        return newCategory;
    }
}