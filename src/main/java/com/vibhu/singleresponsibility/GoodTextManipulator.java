package com.vibhu.singleresponsibility;

import java.util.Arrays;

// As expected : The only job of this class should be manipulating text.
public class GoodTextManipulator {
    private String text;

    public GoodTextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }
}

// To print, we should create another class, which will only handle printing text
// Now, in this class, we can create methods for as many variations of printing text as we want, because that's its job.
class TextPrinter {
    GoodTextManipulator textManipulator;

    public TextPrinter(GoodTextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    public void printText() {
        System.out.println(textManipulator.getText());
    }

    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
    }
}