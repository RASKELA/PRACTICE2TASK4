package org.practice2.task4;

public class InsertCommand implements AbstractCommand {
    private String text;
    private Window windowToInsert;

    public InsertCommand(String text, Window windowToInsert) {
        this.text = text;
        this.windowToInsert = windowToInsert;
    }

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}