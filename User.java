/**
 * A class representing a user in the NoteApp application.
 */
public class User {
    private String username;
    private String password;

    /**
     * Constructs a User object with the specified username and password.
     * @param username The username of the user.
     * @param password The password of the user.
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    /**
     * Authenticates the user by checking the entered password.
     * @param enteredPassword The password entered by the user.
     * @return True if the entered password matches the user's password, false otherwise.
     */
    public boolean authenticate(String enteredPassword) {
        return password.equals(enteredPassword);
    }
}