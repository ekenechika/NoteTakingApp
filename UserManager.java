import java.util.ArrayList;

/**
 * A class managing user-related operations in the NoteApp application.
 */
public class UserManager {
    private ArrayList<User> users;

    /**
     * Constructs a UserManager object and initializes the list of users.
     */
    public UserManager() {
        this.users = new ArrayList<>();
    }

    /**
     * Adds a user to the list of users.
     * @param user The user to add.
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Gets a user by their username.
     * @param username The username of the user to retrieve.
     * @return The user with the specified username, or null if not found.
     */
    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}

