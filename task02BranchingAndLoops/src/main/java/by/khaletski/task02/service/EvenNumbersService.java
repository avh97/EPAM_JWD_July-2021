package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/** This class creates the 'EvenNumbersService' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class EvenNumbersService {
    private ArrayList<Integer> numbers;

    static final Logger LOGGER = LogManager.getLogger(EvenNumbersService.class);

    /**
     * Default constructor creates an 'EvenNumbersService' object consisting of numbers
     * in the range between two numbers.
     * @param startValue
     * @param extremeValue
     */

    public EvenNumbersService(final int startValue, final int extremeValue) {
        ArrayList<Integer> arrayList = new ArrayList<>(Math.abs(startValue - extremeValue));
        for (int i = startValue; i <= extremeValue; i++) {
            arrayList.add(i);
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0 || number == 0) {
                iterator.remove();
            }
            this.numbers = arrayList;

        }
        LOGGER.debug("Object 'EvenNumbersService' has been successfully created");
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvenNumbersService that = (EvenNumbersService) o;
        return numbers.equals(that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }
}
