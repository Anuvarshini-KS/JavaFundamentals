package com.KovanLabs.Intern.FridayChallenge;

public class Enigma {
    public static void main(String[]args)
    {
     String message = "Hello!";
     int key = 6;
     // String encryptText = encrypt(message,key);
     String decryptText = decrypt(encrypt(message,key),key);
     System.out.println("Original Messase : "+message);
     // System.out.println("Encrypted Text : "+encryptText);
     System.out.println("Decrypt Text : "+decryptText);
    }
    public static String encrypt(String message,int key)
    {
        char[] chars = message.toCharArray();
        StringBuilder encryption = new StringBuilder();
        for(char c : chars)
        {
            encryption.append((char) (c^key));
        }
        return encryption.toString();
    }
    public static String decrypt(String cipher,int key)
    {
        char[] chars = cipher.toCharArray();
        StringBuilder decryption = new StringBuilder();
        for(char c : chars)
        {
            decryption.append((char)(c^key));
        }
        return decryption.toString();
    }
}
