package by.khaletski.task04.service.impl;

import by.khaletski.task04.service.SelectLocaleService;

import java.util.ResourceBundle;

public class SelectLocaleServiceImpl implements SelectLocaleService {

    @Override
    public void selectLocale(Locale locale) {
        if (locale == Locale.RU) {
            java.util.Locale ruLocale = new java.util.Locale("ru", "RU");
            ResourceBundle.getBundle("locale_RU", ruLocale);
        } else if (locale == Locale.US) {
            java.util.Locale usLocale = new java.util.Locale("en", "US");
            ResourceBundle.getBundle("locale_EN", usLocale);
        }
    }

    public enum Locale {
        RU,
        US
    }
}
