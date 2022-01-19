package com.company;

import java.util.Scanner;

public class Main {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        boolean digit = false;
        boolean lowercase = false;
        boolean uppercase = false;
        boolean special = false;
        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if(password.length()<6){

            }
            if (Character.isDigit(c))
                digit = true;
            else if (Character.isUpperCase(c))
                uppercase = true;
            else if (Character.isLowerCase(c))
                lowercase = true;
            else
                special = true;
        }
        int e = 0;
        if (!digit) e++;
        if (!lowercase) e++;
        if (!uppercase) e++;
        if (!special) e++;
        if (e + n < 6) e = 6 - n;
        return e;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}

