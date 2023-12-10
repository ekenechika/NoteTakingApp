import java.util.ArrayList;

/**
 * A class extending NoteCollection to include categories in the NoteApp application.
 */
public class NoteCollectionWithCategories extends NoteCollection {
    // Extends NoteCollection to include categories

    /**
     * Deletes a note from the collection based on its title.
     * @param title The title of the note to be deleted.
     * @return true if the note is found and deleted, false otherwise.
     */
    public boolean deleteNoteByTitle(String title) {
        for (Note note : getNotes()) {
            if (note instanceof NoteWithCategory) {
                NoteWithCategory noteWithCategory = (NoteWithCategory) note;
                if (noteWithCategory.getTitle().equals(title)) {
                    getNotes().remove(note);
                    return true;
                }
            } else {
                if (note.getTitle().equals(title)) {
                    getNotes().remove(note);
                    return true;
                }
            }
        }
        return false;
    }
}
