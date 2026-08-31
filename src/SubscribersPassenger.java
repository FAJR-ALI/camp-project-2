public class SubscribersPassenger extends Passenger{

    double discount = 0.50;

    public SubscribersPassenger(String name, String id, Car reserved, double tripCost) {
        super(name, id, reserved, tripCost);
    }

    @Override
    public double compTripCost(Car obj) {
        if (obj.getMaxCapacity() == 0) {
            throw new IllegalArgumentException("Car capacity is zero !!");
        }
        reservedcar = obj;
        double total = obj.getRoute().getTripPrice() - (discount * obj.getRoute().getTripPrice());
        return total;
    }
}
