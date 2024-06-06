package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String password = "password";
        Hashing hashing = new Hashing();

        //Task1
        System.out.println("=========MessageDigest=========");
        hashing.calculateMessageDigest("MD5",password);
        hashing.calculateMessageDigest("SHA-256",password);
        hashing.calculateMessageDigest("SHA-512",password);

        //Task2
        System.out.println("=========SecureRandom=========");
        hashing.calculateSecureRandom("SHA1PRNG", password);
        hashing.calculateSecureRandom("Windows-PRNG", password);
        hashing.calculateSecureRandom("DRBG", password);

        //Task3
        System.out.println("=========Right class=========");
        Map<RightHashing, String> correctMap = new HashMap<>();
        RightHashing correctKey1 = new RightHashing(1, "Ivan");
        RightHashing correctKey2 = new RightHashing(2, "Stepan");

        correctMap.put(correctKey1, "First");
        correctMap.put(correctKey2, "Second");

        System.out.println("CorrectMap:");
        for (Map.Entry<RightHashing, String> entry : correctMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        System.out.println("=========Wrong class=========");
        Map<WrongHashing, String> incorrectMap = new HashMap<>();
        WrongHashing incorrectKey1 = new WrongHashing(1, "Ivan");
        WrongHashing incorrectKey2 = new WrongHashing(2, "Stepan");

        incorrectMap.put(incorrectKey1, "First");
        incorrectMap.put(incorrectKey2, "Second");

        System.out.println("\nIncorrectMap:");
        for (Map.Entry<WrongHashing, String> entry : incorrectMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //WrongHashing incorrectKey3 = new WrongHashing(1, "John");



    }
}