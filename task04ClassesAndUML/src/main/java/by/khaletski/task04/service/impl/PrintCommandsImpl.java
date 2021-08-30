package by.khaletski.task04.service.impl;

import by.khaletski.task04.controller.command.CommandName;

import java.util.Arrays;

public class PrintCommandsImpl implements by.khaletski.task04.service.PrintCommands {

    @Override
    public void printCommands() {
        String[] string = Arrays.toString(CommandName.values())
                .replaceAll("^.|.$", "")
                .split(", ");
        for (int i = 0; i < string.length - 1; i++) {
            System.out.println(string[i]);
        }
    }
}
