package auth;

import Service.AuthService;
import dao.UserDAO;
import repository.UserRepository;

import javax.naming.AuthenticationException;

public class Auth {

    public void Authenticate(String email, String password) throws AuthenticationException {
        UserDAO user = UserRepository.getUserByEmail(email);

        AuthService.isUserValid(user);
        AuthService.isPasswordCorrect(password, user);

        user.setAuth(true);
        UserRepository.registerLogin(user);
    }
}
