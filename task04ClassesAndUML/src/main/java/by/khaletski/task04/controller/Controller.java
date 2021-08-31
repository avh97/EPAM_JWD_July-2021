package by.khaletski.task04.controller;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.controller.command.CommandName;
import by.khaletski.task04.controller.command.Localization;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.factory.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    static final Logger LOGGER = LogManager.getLogger(Controller.class);

    public final TourList executeTask(final String request) {
        Command executionCommand = provider.getCommand(request);
        LOGGER.debug("Command has been executed.");
        return executionCommand.execute(request);
    }

    public final void startApplication(final Localization localization) {
        Locale usLocale = new java.util.Locale("us", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("locale_US", usLocale);
        if (localization.equals(Localization.RU)) {
            Locale ruLocale = new java.util.Locale("ru", "RU");
            resourceBundle = ResourceBundle.getBundle("locale_RU", ruLocale);
        }
        System.out.print(resourceBundle.getString("start"));
        Controller controller = new Controller();
        String string;
        printCommands();
        while (true) {
            string = getTaskName();
            System.out.print(resourceBundle.getString("result"));
            if (string.equals("EXIT")) {
                break;
            }
            ServiceFactory.getInstance().getPrintTourListImpl().printTourList(controller.executeTask(string));
            System.out.println(resourceBundle.getString("next"));
        }
    }

    public final String getTaskName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public final void printCommands() {
        String[] string = Arrays.toString(CommandName.values())
                .replaceAll("^.|.$", "")
                .split(", ");
        for (int i = 0; i < string.length - 1; i++) {
            System.out.println(string[i]);
        }
    }
}
