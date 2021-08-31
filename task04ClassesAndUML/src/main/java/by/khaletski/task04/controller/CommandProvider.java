package by.khaletski.task04.controller;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.controller.command.CommandName;
import by.khaletski.task04.controller.command.impl.WrongRequest;
import by.khaletski.task04.controller.command.impl.location.ShowLocationGreece;
import by.khaletski.task04.controller.command.impl.location.ShowLocationRussia;
import by.khaletski.task04.controller.command.impl.location.ShowLocationTurkey;
import by.khaletski.task04.controller.command.impl.location.ShowLocationUkraine;
import by.khaletski.task04.controller.command.impl.location.SortByLocation;
import by.khaletski.task04.controller.command.impl.meal.ShowMealNone;
import by.khaletski.task04.controller.command.impl.meal.ShowMealOne;
import by.khaletski.task04.controller.command.impl.meal.ShowMealThree;
import by.khaletski.task04.controller.command.impl.meal.SortByMeals;
import by.khaletski.task04.controller.command.impl.price.ShowMaxPrice100;
import by.khaletski.task04.controller.command.impl.price.ShowMaxPrice1000;
import by.khaletski.task04.controller.command.impl.price.ShowMaxPrice500;
import by.khaletski.task04.controller.command.impl.price.SortByPrice;
import by.khaletski.task04.controller.command.impl.transport.ShowTransportAirplane;
import by.khaletski.task04.controller.command.impl.transport.ShowTransportBus;
import by.khaletski.task04.controller.command.impl.transport.ShowTransportTrain;
import by.khaletski.task04.controller.command.impl.transport.SortByTransport;
import by.khaletski.task04.controller.command.impl.period.ShowMinPeriodOne;
import by.khaletski.task04.controller.command.impl.period.ShowMinPeriodThree;
import by.khaletski.task04.controller.command.impl.period.ShowMinPeriodSeven;
import by.khaletski.task04.controller.command.impl.period.SortByPeriod;
import by.khaletski.task04.controller.command.impl.type.ShowTypeCruise;
import by.khaletski.task04.controller.command.impl.type.ShowTypeHealing;
import by.khaletski.task04.controller.command.impl.type.ShowTypeRecreation;
import by.khaletski.task04.controller.command.impl.type.ShowTypeShopping;
import by.khaletski.task04.controller.command.impl.type.SortByType;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.SHOW_TYPE_CRUISE, new ShowTypeCruise());
        repository.put(CommandName.SHOW_TYPE_EXCURSION, new ShowTypeCruise());
        repository.put(CommandName.SHOW_TYPE_HEALING, new ShowTypeHealing());
        repository.put(CommandName.SHOW_TYPE_RECREATION, new ShowTypeRecreation());
        repository.put(CommandName.SHOW_TYPE_SHOPPING, new ShowTypeShopping());
        repository.put(CommandName.SHOW_LOCATION_GREECE, new ShowLocationGreece());
        repository.put(CommandName.SHOW_LOCATION_RUSSIA, new ShowLocationRussia());
        repository.put(CommandName.SHOW_LOCATION_TURKEY, new ShowLocationTurkey());
        repository.put(CommandName.SHOW_LOCATION_UKRAINE, new ShowLocationUkraine());
        repository.put(CommandName.SHOW_NONE_MEAL, new ShowMealNone());
        repository.put(CommandName.SHOW_ONE_MEAL, new ShowMealOne());
        repository.put(CommandName.SHOW_THREE_MEAL, new ShowMealThree());
        repository.put(CommandName.SHOW_TRANSPORT_AIRPLANE, new ShowTransportAirplane());
        repository.put(CommandName.SHOW_TRANSPORT_BUS, new ShowTransportBus());
        repository.put(CommandName.SHOW_TRANSPORT_TRAIN, new ShowTransportTrain());
        repository.put(CommandName.SHOW_MIN_PERIOD_1_DAY, new ShowMinPeriodOne());
        repository.put(CommandName.SHOW_MIN_PERIOD_3_DAY, new ShowMinPeriodThree());
        repository.put(CommandName.SHOW_MIN_PERIOD_7_DAY, new ShowMinPeriodSeven());
        repository.put(CommandName.SHOW_MAX_PRICE_100_USD, new ShowMaxPrice100());
        repository.put(CommandName.SHOW_MAX_PRICE_500_USD, new ShowMaxPrice500());
        repository.put(CommandName.SHOW_MAX_PRICE_1000_USD, new ShowMaxPrice1000());
        repository.put(CommandName.SORT_BY_TYPE, new SortByType());
        repository.put(CommandName.SORT_BY_LOCATION, new SortByLocation());
        repository.put(CommandName.SORT_BY_MEAL, new SortByMeals());
        repository.put(CommandName.SORT_BY_TRANSPORT, new SortByTransport());
        repository.put(CommandName.SORT_BY_PERIOD, new SortByPeriod());
        repository.put(CommandName.SORT_BY_PRICE, new SortByPrice());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    final Command getCommand(final String name) {
        CommandName commandName;
        Command command;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
