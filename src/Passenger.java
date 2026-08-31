public abstract class Passenger {
    String name;
    String id;
    Car reservedcar;
    double tripCost;

    public Passenger(String name, String id, Car reservedcar, double tripCost) {
        this.name = name;
        this.id = id;
        this.reservedcar = reservedcar;
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedcar() {
        return reservedcar;
    }

    public void setReservedcar(Car reservedcar) {
        this.reservedcar = reservedcar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }


    public abstract double compTripCost(Car obj);

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", reserved=" + reservedcar +
                ", tripCost=" + tripCost +
                '}';
    }
}
