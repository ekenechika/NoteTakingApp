/**
 * A class representing a note in the NoteApp application.
 */
public class Note {
    private String title;
    private String content;

    /**
     * Constructs a Note object with the specified title and content.
     * @param title The title of the note.
     * @param content The content of the note.
     */
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * Gets the title of the note.
     * @return The title of the note.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the content of the note.
     * @return The content of the note.
     */
    public String getContent() {
        return content;
    }

    /**
     * Returns a string representation of the note.
     * @return The string representation of the note.
     */
    @Override
    public String toString() {
        return "Title: " + title + "\nContent: " + content;
    }
}