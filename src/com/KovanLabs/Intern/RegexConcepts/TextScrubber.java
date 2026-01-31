package com.KovanLabs.Intern.RegexConcepts;
import java.util.regex.*;
public class TextScrubber {
    public static void main(String[] args) {

        String input = "H3ll0 W0rld! Th1s is J4v4.";

        String result = input
                .replaceAll("[0-9]", "*")
                .replaceAll("[^a-zA-Z0-9\\s*]", "");

        System.out.println(result);
    }
}
