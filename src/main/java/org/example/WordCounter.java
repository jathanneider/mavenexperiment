package org.example;

import org.apache.commons.lang3.StringUtils;

public class WordCounter {
    public static void main(String[] args) {
        String input = "This is a simple Maven project example.";
        int wordCount = StringUtils.split(input, ' ').length;
        System.out.println("Word count: " + wordCount);
    }
}