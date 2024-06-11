package services.userService;

import models.User;
import repositories.UserRepository;

public class UserService {
    private UserRepository userRepository = UserRepository.getInstance();
    private final String REGEX_ACCOUNT = "^[_a-z0-9]{6,30}$";
    private final String REGEX_EMAIL = "^[a-zA-Z][a-zA-Z0-9._%+-]*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    private static UserService instance;

    private UserService() {}

    public synchronized static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public boolean registerUser(User user) {
        if (!user.getUserName().matches(REGEX_ACCOUNT) || !user.getPassword().matches(REGEX_ACCOUNT)) {
            throw new IllegalArgumentException("Account invalid");
        }
        if (!user.getEmail().matches(REGEX_EMAIL)) {
            throw new IllegalArgumentException("Email invalid");
        }

        for (User existingUser : userRepository.getAll()) {
            if (existingUser.getUserName().equals(user.getUserName())) {
                throw new IllegalArgumentException("Username already exists");
            }
        }
        userRepository.registerUser(user);
        return true;
    }

    public boolean loginUser(User user) {
        if (userRepository.loginUser(user.getUserName(), user.getPassword()) == null) {
            throw new IllegalArgumentException("Username or password incorrect");
        }
        return true;
    }
}
