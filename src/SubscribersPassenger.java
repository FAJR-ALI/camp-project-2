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
        // the capacity will decrase
        obj.setMaxCapacity(obj.getMaxCapacity() - 1);
        double total = obj.getRoute().getTripPrice()  - (discount * obj.getRoute().getTripPrice());
        return total;
    }
    // اسوي ال to String
    @Override
    public String toString() {
        return "SubscribersPassenger{" +
                ", reservedcar=" + reservedcar +
                ", tripCost=" + tripCost +
                "} " + super.toString();
    }
}
