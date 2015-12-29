package hw3.railwayCashbox.train;

import hw3.railwayCashbox.carriage.Carriage;

public interface ConditionTrain {

    /**
     * @param int - input carriagesNumber, where carriagesNumber => number of carriages
     * @return array carriages
     */
    Carriage[] addCarriages(int carriagesNumber);

}
