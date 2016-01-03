package hw2.parking;

/**
 * class Biker
 methods
 - buyMotorcycle
 - sellMotorcycle
 - fixMotorcycle
 */

public class Biker implements BikerInterface {

    private String name;
    private int age;
    private Motorcycle motorcycle;
    private double money;

    public Biker(String name, int age) {
        this.name = name;
        this.age = age;
        money = 10_000;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public boolean buyMotorcycle(Motorcycle motorcycle, double price) {
        if (price >= motorcycle.getPrice()) {
            this.motorcycle = motorcycle;
            this.motorcycle.setBiker(this);
            money -= price;
            System.out.println("motorcycle a bought.");
            return true;
        } else {
            System.out.println("your price is less than the specified price.");
            return false;
        }
    }

    @Override
    public double sellMotorcycle() {
        if (motorcycle != null) {
            double temp = (motorcycle.getPrice() / 3) * 2;    // 2 / 3 - product has been in use, the price is reduced
            money += temp;
            this.motorcycle = null;
            return temp;
        } else {
            return -1;
        }
    }

    @Override
    public boolean fixMotorcycle() {
        if (motorcycle.isCondition() == false) {
            motorcycle.setCondition(true);
        }
        return motorcycle.isCondition();
    }

    @Override
    public String toString() {
        return "Biker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", motorcycle=" + motorcycle +
                ", money=" + money +
                '}';
    }
}
