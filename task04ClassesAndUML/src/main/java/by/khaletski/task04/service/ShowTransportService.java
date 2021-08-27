package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Transport;

public interface ShowTransportService {
    TourList showTransport(TourList tourList, Transport transport);

    TourList showTransport(Transport transport);
}
