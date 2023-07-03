package com.mycompany.passwordgenerator;
import java.util.Random;



public class PasswordGenerator {

    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "1234567890";
        String specialChars = "!@#$%^&*()-_=+[]{};:'\\\"\\\\|,.<>/?\"";
        String combination = upper + lower + specialChars + num;
        int len = 8;
        char[] password = new char[len];
        Random r =new Random();
        for(int i=0;i<len;i++) {
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Password: " + new String(password));
    }
}


