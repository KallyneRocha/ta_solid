package dao;

import auth.Hasher;

public class UserDAO {
    private String email;
    private String password;
    private boolean auth;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public String getHashPassword(String password){
        return Hasher.hash(password);
    }
}
