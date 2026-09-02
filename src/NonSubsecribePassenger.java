public class NonSubsecribePassenger extends Passenger{

    boolean discountCoupon ;
    double total;

    public NonSubsecribePassenger(String name, String id, Car reserved, double tripCost, boolean discountCoupon) {
        super(name, id, reserved, tripCost);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }
    @Override
    public double compTripCost(Car obj) {
        if (obj.getMaxCapacity() == 0) {
            throw new IllegalArgumentException("Car capacity is zero!!");
        }
        reservedcar = obj;
        // the capacity will decrase
        obj.setMaxCapacity(obj.getMaxCapacity() - 1);
        if (discountCoupon) {
            total = obj.getRoute().getTripPrice()  - (obj.getRoute().getTripPrice() * 0.10);
        } else {
            total = obj.getRoute().getTripPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "NonSubsecribePassenger{" +
                "reservedcar=" + reservedcar +
                ", tripCost=" + tripCost +
                "} " + super.toString();
    }
}
