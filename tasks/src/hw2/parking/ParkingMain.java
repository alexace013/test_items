package hw2.parking;

public class ParkingMain {

    public static void main(String[] args) throws Parking.ParkingFullException {

        Parking parking = new Parking(4);
        parking.open();

        Motorcycle moto1 = new Motorcycle("suzuki", 2000);
        Motorcycle moto2 = new Motorcycle("bmw", 2500);
        Motorcycle moto3 = new Motorcycle("kubatsi", 1300);
        Biker biker1 = new Biker("Bob", 24);
        Biker biker2 = new Biker("Den", 27);
        Biker biker3 = new Biker("Tod", 31);
        biker1.buyMotorcycle(moto1, moto1.getPrice());
        biker2.buyMotorcycle(moto2, moto2.getPrice());
        biker3.buyMotorcycle(moto3, moto3.getPrice());

        parking.addMotoOnLastFreePlace(moto1);

        System.out.println(parking.getSize());

        parking.addMotoByPlaceNumber(2, moto2);
        parking.addMotoOnLastFreePlace(moto3);

        System.out.println(parking.getSize());

        parking.takeLastBike();

        parking.takeMotoByPlaceNumber(1);

        System.out.println(parking.getSize());

        System.out.println(parking.showAllInGarage());

        System.out.println(parking.clearGaragePlaces());

        parking.close();

        Motorcycle moto4 = new Motorcycle("Ural", 800);
        Biker biker4 = new Biker("Tom", 21);
        biker4.buyMotorcycle(moto4, moto4.getPrice());

        parking.addMotoOnLastFreePlace(moto4);

        System.out.println("size " + parking.getSize());

    }

}
