package by.khaletski.task03.dao;

import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.entity.Matrix;

public interface IMatricesFill {
    Matrix[] fill() throws DAOException;
}
