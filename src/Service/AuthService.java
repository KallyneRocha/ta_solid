package Service;

import auth.Auth;
import auth.Hasher;
import dao.UserDAO;

import javax.naming.AuthenticationException;

public class AuthService {
    private Auth auth;
    private static Hasher hasher;

    public AuthService(Auth auth, Hasher hasher) {
        this.auth = auth;
        this.hasher = hasher;
    }

    public static boolean isUserValid(UserDAO user) throws AuthenticationException {
        if (user == null) {
            throw new AuthenticationException("User not found.");
        }
        return true;
    }

    public static boolean isPasswordCorrect(String password, UserDAO user) throws AuthenticationException {
        String HashPassword = hasher.hash(password);
        if (!user.getHashPassword(password).equals(HashPassword)){
            throw new AuthenticationException("Invalid password.");
        };
        return true;
    }
}
