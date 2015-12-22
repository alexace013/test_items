package utils;

/**
 * Created by alexander on 21.12.15.
 */
public class TestTimeCounter {

    public static void main(String[] args) {

        long time1 = TimeCounter.countActionTime(new MyLongAccumulateAction());
        System.out.println("time1 = " + time1);
        long time2 = TimeCounter.countActionTime(new MyStringAccumulateAction());
        System.out.println("time2 = " + time2);

    }

}

class MyLongAccumulateAction implements TimeAction {

    @Override
    public void callWrappedAction() {
        long res = 0;

        for (int i = 0; i < 10_000; i++) {
            res += i;
        }

    }
}

class MyStringAccumulateAction implements TimeAction {

    @Override
    public void callWrappedAction() {
        String res = "";

        for (int i = 0; i < 10_000; i++) {
            res += i;
        }

    }
}
