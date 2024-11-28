package org.practice2.task4;

public class CutCommand implements AbstractCommand {
    private String text;
    private int startLine;

    public CutCommand(String text, int startLine) {
        this.text = text;
        this.startLine = startLine;
    }

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}