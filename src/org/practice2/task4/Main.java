package org.practice2.task4;

public class Main {
    public static void main(String[] args) {
        WindowController windowController = new WindowController();
        CopyCommand copyCommand = new CopyCommand();
        windowController.addCommand(copyCommand);
        windowController.executeAllPendingCommands();
    }
}