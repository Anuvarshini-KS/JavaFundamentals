package com.KovanLabs.Intern.RegexConcepts;
import java.util.*;
import java.util.regex.*;
public class EmailVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        System.out.println("Enter the number of emails:");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the emails : ");
        String[] emails = new String[num];
        for (int i = 0; i < num; i++)
        {
            emails[i] = sc.nextLine();
        }
        for (String email : emails)
        {
            System.out.println(email + " → " + email.matches(regex));
        }
    }
}
