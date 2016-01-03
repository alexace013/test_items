package hw2.parking;

public class BikerTest {

    public static void main(String[] args) {

        Motorcycle motorcycle1 = new Motorcycle("suzuki", 1785.9);
        Motorcycle motorcycle2 = new Motorcycle("bmw", 2432.7);

        Biker biker1 = new Biker("Bob", 25);

        biker1.buyMotorcycle(motorcycle1, motorcycle1.getPrice());
        System.out.println(biker1.sellMotorcycle());
        biker1.buyMotorcycle(motorcycle2, motorcycle2.getPrice());
        System.out.println(biker1.sellMotorcycle());
        System.out.println(biker1.getMoney());

    }

}
