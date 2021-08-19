package by.khaletski.task03.dao;

import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.entity.NumberArray;

import java.io.FileNotFoundException;

public interface INumberArrayFill {
    NumberArray fill() throws FileNotFoundException, DAOException;
}
