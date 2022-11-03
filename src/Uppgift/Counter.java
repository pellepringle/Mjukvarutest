package Uppgift;

public class Counter {
    int charCount;
    int lineCount;
    boolean stop;

    public Counter() {
        charCount = 0;
        lineCount = 0;

        stop = false;
    }

    public void checkStop(String line) {
        if (line.equals("stop") || (line.equals("Stop"))) {
            stop = true;
        }

    }

    public void characterCount(String line) {

        lineCount++;
        charCount += line.replace(" ", "").length();
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }

    public boolean getStop() {
        return stop;
    }
}

