package com.vibhu.singleresponsibility;

// Expected : The only job of this class should be manipulating text.
// Violation: Performing 2 responsibilities- manipulating and printing the text.
public class BadTextManipulator {
    private String text;

    public BadTextManipulator(String text) {
        this.text = text;
    }

    // Returns the text
    public String getText() {
        return text;
    }

    // manipulates existing text
    public void appendText(String newText) {
        text = text.concat(newText);
    }

    // manipulates existing text
    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    // manipulates existing text
    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    // Bad practice when implementing SRP principle, not in the scope of this class
    public void printText() {
        System.out.println(this.text);
    }
    // Bad practice
}
