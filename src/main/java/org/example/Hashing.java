package org.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Hashing {

    public void calculateMessageDigest(String algorithm, String password)  {
        try{
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            digest.update(password.getBytes());
            System.out.println("Used algorithm: " + algorithm);
            System.out.println("Entered password: " + password);
            System.out.println("Generated hash: " + bytesToHex(digest.digest()));
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public void calculateSecureRandom(String algorithm, String password)  {
        try{
            SecureRandom instance = SecureRandom.getInstance(algorithm);
            byte[] randomBytes = new byte[16];
            instance.setSeed(password.getBytes());
            instance.nextBytes(randomBytes);
            System.out.println("Used algorithm: " + algorithm);
            System.out.println("Entered password: " + password);
            System.out.println("Generated hash: " + bytesToHex(randomBytes));
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

    String bytesToHex(byte[] bytes) {
        StringBuilder out = new StringBuilder();
        for (byte b : bytes) {
            out.append(String.format("%02X", b));
        }
        return out.toString();
    }
}
