package repository;

import dao.UserDAO;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static Map<String, UserDAO> users = new HashMap<>();

    public static UserDAO getUserByEmail(String email) {
        return users.get(email);
    }

    public static void registerLogin(UserDAO user) {
        users.put(user.getEmail(), user);
    }

}
