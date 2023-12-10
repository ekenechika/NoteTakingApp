import java.util.ArrayList;

/**
 * A class managing a collection of notes in the NoteApp application.
 */
public class NoteCollection {
    private ArrayList<Note> notes;

    /**
     * Constructs a NoteCollection object and initializes the list of notes.
     */
    public NoteCollection() {
        this.notes = new ArrayList<>();
    }

    /**
     * Adds a note to the list of notes.
     * @param note The note to add.
     */
    public void addNote(Note note) {
        notes.add(note);
    }

    /**
     * Removes a note from the list of notes.
     * @param note The note to remove.
     */
    public void removeNote(Note note) {
        notes.remove(note);
    }

    /**
     * Gets all notes in the collection.
     * @return The list of all notes.
     */
    public ArrayList<Note> getAllNotes() {
        return notes;
    }
    protected ArrayList<Note> getNotes() {
        return notes;
    }
    
}