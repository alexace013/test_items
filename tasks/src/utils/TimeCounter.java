package utils;

/**
 * Created by alexander on 21.12.15.
 */
public class TimeCounter {

    public static long countActionTime(TimeAction timeAction) {

        long start = System.currentTimeMillis();
        timeAction.callWrappedAction();
        long end = System.currentTimeMillis();

        return end - start;

    }

}
