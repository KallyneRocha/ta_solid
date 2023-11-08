package auth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hasher {
    public static String hash(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] passwordBytes = password.getBytes();

            md.update(passwordBytes);

            byte[] hashedPasswordBytes = md.digest();

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedPasswordBytes) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}

